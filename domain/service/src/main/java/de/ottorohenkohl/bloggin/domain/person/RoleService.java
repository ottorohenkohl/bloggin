package de.ottorohenkohl.bloggin.domain.person;

import de.ottorohenkohl.bloggin.domain.core.value.Identifier;
import de.ottorohenkohl.bloggin.domain.person.constant.Scope;
import de.ottorohenkohl.bloggin.domain.person.object.RoleExisting;
import de.ottorohenkohl.bloggin.domain.person.object.RoleFresh;
import de.ottorohenkohl.bloggin.domain.person.value.Issuer;
import de.ottorohenkohl.bloggin.domain.person.value.Subject;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.control.ActivateRequestContext;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

import java.util.List;

@ActivateRequestContext
@ApplicationScoped
@RequiredArgsConstructor
public class RoleService {
    
    private final LoginRepository loginRepository;
    private final PersonRepository personRepository;
    private final RoleExistingMapper roleExistingMapper;
    private final RoleFreshMapper roleFreshMapper;
    private final RoleRepository roleRepository;
    
    @Transactional
    public List<RoleExisting> findExistingRoles(String identifier) {
        return roleRepository.read(personRepository.read(new Identifier(identifier))).stream().map(roleExistingMapper::export).toList();
    }
    
    @Transactional
    public List<RoleExisting> findExistingRoles(String issuer, String subject) {
        return roleRepository.read(loginRepository.read(new Issuer(issuer), new Subject(subject)).getPerson()).stream().map(roleExistingMapper::export).toList();
    }
    
    @Transactional
    public RoleExisting removeExistingRole(String identifier, String scope) {
        return roleExistingMapper.export(roleRepository.delete(roleRepository.read(personRepository.read(new Identifier(identifier)), Scope.valueOf(scope))));
    }
    
    @Transactional
    public RoleExisting storeFreshRole(RoleFresh roleFresh) {
        return roleExistingMapper.export(roleFreshMapper.parse(roleFresh));
    }
}