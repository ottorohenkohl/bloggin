package de.ottorohenkohl.bloggin.resource;

import de.ottorohenkohl.bloggin.domain.reference.ReferenceService;
import de.ottorohenkohl.bloggin.domain.reference.object.ReferenceFresh;
import de.ottorohenkohl.bloggin.middleware.interceptor.RequiredRole;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;
import lombok.RequiredArgsConstructor;

import static de.ottorohenkohl.bloggin.domain.person.constant.Scope.AUTHOR;
import static jakarta.ws.rs.core.MediaType.APPLICATION_JSON;

@Path("/reference")
@ApplicationScoped
@RequiredArgsConstructor
public class ReferenceResource extends BaseResource {
    
    private final ReferenceService referenceService;
    
    @Path("/{identifier}")
    @DELETE
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    @RequiredRole(AUTHOR)
    public Response deleteExistingReference(@PathParam("identifier") String identifier) {
        return Response.created(getPath("/reference/%s", referenceService.removeExistingReference(identifier).identifier())).build();
    }
    
    @Path("/blank")
    @GET
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    @RequiredRole(AUTHOR)
    public Response getExistingInternalsWithoutTarget() {
        return Response.ok(referenceService.findExistingInternalsWithoutTarget()).build();
    }
    
    @Path("/{identifier}")
    @GET
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    public Response getExistingReference(@PathParam("identifier") String identifier) {
        return Response.ok(referenceService.findExistingReference(identifier)).build();
    }
    
    @Path("/")
    @GET
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    @RequiredRole(AUTHOR)
    public Response getExistingReferences(@QueryParam("count") Integer count, @QueryParam("start") Integer start) {
        return Response.ok(referenceService.findExistingReferences(getPage(count, start))).build();
    }
    
    @Path("/")
    @POST
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    @RequiredRole(AUTHOR)
    public Response postFreshReference(ReferenceFresh referenceFresh) {
        return Response.created(getPath("/reference/%s", referenceService.storeFreshReference(referenceFresh).identifier())).build();
    }
}