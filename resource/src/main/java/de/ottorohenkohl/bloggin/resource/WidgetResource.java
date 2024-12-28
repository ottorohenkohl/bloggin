package de.ottorohenkohl.bloggin.resource;

import de.ottorohenkohl.bloggin.domain.widget.WidgetService;
import de.ottorohenkohl.bloggin.domain.widget.object.WidgetExisting;
import de.ottorohenkohl.bloggin.domain.widget.object.WidgetFresh;
import de.ottorohenkohl.bloggin.middleware.interceptor.RequiredRole;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;
import lombok.RequiredArgsConstructor;

import static de.ottorohenkohl.bloggin.domain.person.constant.Scope.AUTHOR;
import static jakarta.ws.rs.core.MediaType.APPLICATION_JSON;

@Path("/widget")
@ApplicationScoped
@RequiredArgsConstructor
public class WidgetResource extends BaseResource {
    
    private final WidgetService widgetService;
    
    @Path("/{identifier}")
    @DELETE
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    @RequiredRole(AUTHOR)
    public Response deleteExistingWidget(@PathParam("identifier") String identifier) {
        return Response.accepted(widgetService.removeExistingWidget(identifier).identifier()).build();
    }
    
    @Path("/{identifier}")
    @GET
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    public Response getExistingWidget(@PathParam("identifier") String identifier) {
        return Response.ok(widgetService.findExistingWidget(identifier)).build();
    }
    
    @Path("/")
    @PATCH
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    @RequiredRole(AUTHOR)
    public Response patchExistingWidget(WidgetExisting widgetExisting) {
        return Response.accepted(widgetService.changeExistingWidget(widgetExisting)).build();
    }
    
    @Path("")
    @POST
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    @RequiredRole(AUTHOR)
    public Response postFreshWidget(WidgetFresh widgetFresh) {
        return Response.created(getPath("/widget/%s", widgetService.storeFreshWidget(widgetFresh).identifier())).build();
    }
}