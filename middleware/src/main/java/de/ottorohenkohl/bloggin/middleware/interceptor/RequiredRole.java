package de.ottorohenkohl.bloggin.middleware.interceptor;

import de.ottorohenkohl.bloggin.domain.person.RoleService;
import de.ottorohenkohl.bloggin.domain.person.constant.Scope;
import de.ottorohenkohl.bloggin.domain.person.object.RoleExisting;
import io.quarkus.security.Authenticated;
import io.quarkus.security.AuthenticationFailedException;
import jakarta.enterprise.util.Nonbinding;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InterceptorBinding;
import jakarta.interceptor.InvocationContext;
import jakarta.persistence.NoResultException;
import lombok.RequiredArgsConstructor;
import org.eclipse.microprofile.jwt.JsonWebToken;

import java.lang.annotation.Retention;
import java.util.Objects;

import static de.ottorohenkohl.bloggin.domain.person.constant.Scope.ADMIN;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(RUNTIME)
@Authenticated
@InterceptorBinding
public @interface RequiredRole {
    @Nonbinding Scope value();
}

@RequiredRole(ADMIN)
@Authenticated
@Interceptor
@RequiredArgsConstructor
class RequiredRoleInterceptor {
    
    private final JsonWebToken jsonWebToken;
    private final RoleService roleService;
    
    @AroundInvoke
    Object enforceRole(InvocationContext invocationContext) throws Exception {
        try {
            var roles = roleService.findExistingRoles(jsonWebToken.getIssuer(), jsonWebToken.getSubject());
            var scopes = roles.stream().map(RoleExisting::scope).map(Scope::valueOf).toList();
            
            if (scopes.stream().anyMatch(scope -> readScope(invocationContext).ordinal() >= scope.ordinal())) {
                return invocationContext.proceed();
            }
        } catch (NoResultException noResultException) {
            var error = String.format("Person with issuer %s subject %s found", jsonWebToken.getSubject(), jsonWebToken.getIssuer());
            
            throw new AuthenticationFailedException(error, noResultException);
        }
        
        throw new AuthenticationFailedException();
    }
    
    Scope readScope(InvocationContext invocationContext) {
        var annotation = invocationContext.getMethod().getAnnotation(RequiredRole.class);
        if (Objects.nonNull(annotation)) {
            return annotation.value();
        }
        
        return invocationContext.getTarget().getClass().getAnnotation(RequiredRole.class).value();
    }
}