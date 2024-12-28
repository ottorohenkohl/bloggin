package de.ottorohenkohl.bloggin.resource;

import de.ottorohenkohl.bloggin.domain.site.SiteService;
import de.ottorohenkohl.bloggin.domain.site.object.SiteExisting;
import de.ottorohenkohl.bloggin.domain.site.object.SiteFresh;
import de.ottorohenkohl.bloggin.middleware.interceptor.RequiredRole;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;
import lombok.RequiredArgsConstructor;

import static de.ottorohenkohl.bloggin.domain.person.constant.Scope.MANAGER;
import static jakarta.ws.rs.core.MediaType.APPLICATION_JSON;

@Path("/site")
@ApplicationScoped
@RequiredArgsConstructor
public class SiteResource extends BaseResource {
    
    private final SiteService siteService;
    
    @Path("/{identifier}")
    @DELETE
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    @RequiredRole(MANAGER)
    public Response deleteExistingSite(@PathParam("identifier") String identifier) {
        return Response.created(getPath("/page/%s", siteService.removeExistingSite(identifier).identifier())).build();
    }
    
    @Path("/{identifier}")
    @GET
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    public Response getExistingSite(@PathParam("identifier") String identifier) {
        return Response.ok(siteService.findExistingSite(identifier)).build();
    }
    
    @Path("/")
    @GET
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    @RequiredRole(MANAGER)
    public Response getExistingSites(@QueryParam("count") Integer count, @QueryParam("start") Integer start) {
        return Response.ok(siteService.findExistingSites(getPage(count, start))).build();
    }
    
    @Path("/")
    @PATCH
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    @RequiredRole(MANAGER)
    public Response patchExistingSite(SiteExisting siteExisting) {
        return Response.accepted(siteService.changeExistingSite(siteExisting)).build();
    }
    
    @Path("/")
    @POST
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    @RequiredRole(MANAGER)
    public Response postFreshSite(SiteFresh siteFresh) {
        return Response.created(getPath("/site/%s", siteService.storeFreshSite(siteFresh).identifier())).build();
    }
}