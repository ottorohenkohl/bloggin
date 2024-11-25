package de.ottorohenkohl.bloggin.resource;

import de.ottorohenkohl.bloggin.domain.file.FileService;
import de.ottorohenkohl.bloggin.domain.file.object.FileFresh;
import de.ottorohenkohl.bloggin.middleware.interceptor.RequiredRole;
import jakarta.enterprise.context.RequestScoped;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.HttpHeaders;
import jakarta.ws.rs.core.Response;
import lombok.RequiredArgsConstructor;

import static de.ottorohenkohl.bloggin.domain.person.constant.Scope.MANAGER;
import static jakarta.ws.rs.core.MediaType.APPLICATION_JSON;
import static jakarta.ws.rs.core.MediaType.WILDCARD;

@Path("/file")
@RequestScoped
@RequiredArgsConstructor
public class FileResource extends BaseResource {
    
    private final FileService fileService;
    
    @Path("/{identifier}")
    @DELETE
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    @RequiredRole(MANAGER)
    public Response deleteExistingFile(@PathParam("identifier") String identifier) {
        return Response.accepted(fileService.removeExistingFile(identifier)).build();
    }
    
    @Path("/{identifier}")
    @GET
    @Consumes(APPLICATION_JSON)
    @Produces(WILDCARD)
    public Response getExistingFile(@PathParam("identifier") String identifier) {
        return Response.ok(fileService.findExistingFile(identifier).data()).build();
    }
    
    @Path("/")
    @GET
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    @RequiredRole(MANAGER)
    public Response getExistingFiles(@QueryParam("count") Integer count, @QueryParam("start") Integer start) {
        return Response.ok(fileService.findExistingFiles(getPage(count, start))).build();
    }
    
    @Path("/")
    @POST
    @Consumes(WILDCARD)
    @Produces(APPLICATION_JSON)
    @RequiredRole(MANAGER)
    public Response postFreshFile(@Context HttpHeaders headers, Byte[] bytes) {
        return Response.created(getPath("/file/%s", fileService.storeFreshFile(new FileFresh(bytes, headers.getHeaderString("Content-Type"))).identifier())).build();
    }
}