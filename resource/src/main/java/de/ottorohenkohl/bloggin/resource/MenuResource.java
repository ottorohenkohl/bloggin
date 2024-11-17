package de.ottorohenkohl.bloggin.resource;

import de.ottorohenkohl.bloggin.domain.menu.MenuService;
import de.ottorohenkohl.bloggin.domain.menu.object.CategoryFresh;
import de.ottorohenkohl.bloggin.domain.menu.object.ItemFresh;
import de.ottorohenkohl.bloggin.domain.menu.object.MenuFresh;
import de.ottorohenkohl.bloggin.domain.menu.object.SectionFresh;
import jakarta.annotation.security.RolesAllowed;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;
import lombok.RequiredArgsConstructor;

import static jakarta.ws.rs.core.MediaType.APPLICATION_JSON;

@Path("/menu/")
@ApplicationScoped
@RequiredArgsConstructor
public class MenuResource extends BaseResource {
    
    private final MenuService menuService;
    
    @Path("category/{identifier}")
    @RolesAllowed("manager")
    @DELETE
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    public Response deleteCategoryFromMenu(@PathParam("identifier") String identifier) {
        return Response.accepted(menuService.removeCategory(identifier)).build();
    }
    
    @Path("{identifier}")
    @RolesAllowed("manager")
    @DELETE
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    public Response deleteExistingMenu(@PathParam("identifier") String identifier) {
        return Response.accepted(menuService.removeExistingMenu(identifier)).build();
    }
    
    @Path("category/section/item/{identifier}")
    @RolesAllowed("manager")
    @DELETE
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    public Response deleteItemFromSection(@PathParam("identifier") String identifier) {
        return Response.accepted(menuService.removeItem(identifier)).build();
    }
    
    @Path("category/section/{identifier}")
    @RolesAllowed("manager")
    @DELETE
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    public Response deleteSectionFromCategory(@PathParam("identifier") String identifier) {
        return Response.accepted(menuService.removeSection(identifier)).build();
    }
    
    @Path("{identifier}")
    @GET
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    public Response getExistingMenu(@PathParam("identifier") String identifier) {
        return Response.ok(menuService.findExistingMenu(identifier)).build();
    }
    
    @Path("")
    @RolesAllowed("manager")
    @GET
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    public Response getExistingMenus(@QueryParam("count") Integer count, @QueryParam("start") Integer start) {
        return Response.ok(menuService.findExistingMenus(getPage(count, start))).build();
    }
    
    @Path("{identifier}/category")
    @RolesAllowed("manager")
    @POST
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    public Response postFreshCategoryInMenu(@PathParam("identifier") String identifier, CategoryFresh categoryFresh) {
        return Response.accepted(menuService.storeFreshCategoryInMenu(identifier, categoryFresh)).build();
    }
    
    @Path("category/section/{identifier}/item")
    @RolesAllowed("manager")
    @POST
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    public Response postFreshItemInSection(@PathParam("identifier") String identifier, ItemFresh itemFresh) {
        return Response.accepted(menuService.storeFreshItemInSection(identifier, itemFresh)).build();
    }
    
    @Path("")
    @RolesAllowed("manager")
    @POST
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    public Response postFreshMenu(MenuFresh menuFresh) {
        return Response.created(getPath("/menu/%s", menuService.storeFreshMenu(menuFresh).identifier())).build();
    }
    
    @Path("category/{identifier}/section")
    @RolesAllowed("manager")
    @POST
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    public Response postFreshSectionInCategory(@PathParam("identifier") String identifier, SectionFresh sectionFresh) {
        return Response.accepted(menuService.storeFreshSectionInCategory(identifier, sectionFresh)).build();
    }
}