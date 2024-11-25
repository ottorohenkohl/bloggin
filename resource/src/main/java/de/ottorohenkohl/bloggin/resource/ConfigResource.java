package de.ottorohenkohl.bloggin.resource;

import de.ottorohenkohl.bloggin.domain.config.ConfigService;
import de.ottorohenkohl.bloggin.domain.config.object.ConfigExisting;
import de.ottorohenkohl.bloggin.middleware.interceptor.RequiredRole;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;
import lombok.RequiredArgsConstructor;

import static de.ottorohenkohl.bloggin.domain.person.constant.Scope.ADMIN;
import static jakarta.ws.rs.core.MediaType.APPLICATION_JSON;

@Path("/config")
@ApplicationScoped
@RequiredArgsConstructor
public class ConfigResource extends BaseResource {
    
    private final ConfigService configService;
    
    @Path(("/"))
    @GET
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    public Response getExistingConfig() {
        return Response.ok(configService.findExistingConfig()).build();
    }
    
    @Path("/")
    @PUT
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    @RequiredRole(ADMIN)
    public Response putFreshConfig(ConfigExisting configExisting) {
        configService.changeExistingConfig(configExisting);
        
        return Response.created(getPath("/config")).build();
    }
}