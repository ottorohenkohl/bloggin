package de.ottorohenkohl.bloggin.resource;

import de.ottorohenkohl.bloggin.domain.reference.ReferenceService;
import de.ottorohenkohl.bloggin.domain.reference.object.ReferenceFresh;
import jakarta.annotation.security.RolesAllowed;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;
import lombok.RequiredArgsConstructor;

import static jakarta.ws.rs.core.MediaType.APPLICATION_JSON;

@Path("/reference/")
@ApplicationScoped
@RequiredArgsConstructor
public class ReferenceResource extends BaseResource {
    
    private final ReferenceService referenceService;
    
    @Path("{identifier}")
    @RolesAllowed("author")
    @DELETE
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    public Response deleteExistingReference(@PathParam("identifier") String identifier) {
        return Response.created(getPath("/reference/%s", referenceService.removeExistingReference(identifier).identifier())).build();
    }
    
    @Path("blank")
    @RolesAllowed("author")
    @GET
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    public Response getExistingInternalsWithoutTarget() {
        return Response.ok(referenceService.findExistingInternalsWithoutTarget()).build();
    }
    
    @Path("{identifier}")
    @GET
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    public Response getExistingReference(@PathParam("identifier") String identifier) {
        return Response.ok(referenceService.findExistingReference(identifier)).build();
    }
    
    @Path("")
    @RolesAllowed("author")
    @GET
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    public Response getExistingReferences(@QueryParam("count") Integer count, @QueryParam("start") Integer start) {
        return Response.ok(referenceService.findExistingReferences(getPage(count, start))).build();
    }
    
    @Path("")
    @RolesAllowed("author")
    @POST
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    public Response postFreshReference(ReferenceFresh referenceFresh) {
        return Response.created(getPath("/reference/%s", referenceService.storeFreshReference(referenceFresh).identifier())).build();
    }
}