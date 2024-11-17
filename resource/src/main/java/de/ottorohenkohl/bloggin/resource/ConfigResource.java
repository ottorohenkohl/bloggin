package de.ottorohenkohl.bloggin.resource;

import de.ottorohenkohl.bloggin.domain.config.ConfigService;
import de.ottorohenkohl.bloggin.domain.config.object.ConfigExisting;
import jakarta.annotation.security.RolesAllowed;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;
import lombok.RequiredArgsConstructor;

import static jakarta.ws.rs.core.MediaType.APPLICATION_JSON;

@Path("/config/")
@ApplicationScoped
@RequiredArgsConstructor
public class ConfigResource extends BaseResource {
    
    private final ConfigService configService;
    
    @Path((""))
    @GET
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    public Response getExistingConfig() {
        return Response.ok(configService.findExistingConfig()).build();
    }
    
    @Path("config")
    @RolesAllowed("admin")
    @PUT
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    public Response putFreshConfig(ConfigExisting configExisting) {
        return Response.created(getPath("/config/%s", configService.changeExistingConfig(configExisting).identifier())).build();
    }
}