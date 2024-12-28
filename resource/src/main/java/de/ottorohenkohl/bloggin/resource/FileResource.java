package de.ottorohenkohl.bloggin.resource;

import de.ottorohenkohl.bloggin.domain.file.FileService;
import de.ottorohenkohl.bloggin.domain.file.object.FileFresh;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.HttpHeaders;
import jakarta.ws.rs.core.Response;
import lombok.RequiredArgsConstructor;

import static jakarta.ws.rs.core.MediaType.APPLICATION_JSON;
import static jakarta.ws.rs.core.MediaType.WILDCARD;

@Path("/file")
@ApplicationScoped
@RequiredArgsConstructor
public class FileResource extends BaseResource {
    
    private final FileService fileService;
    
    @Path("/{identifier}")
    @DELETE
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
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
    @POST
    @Consumes(WILDCARD)
    @Produces(APPLICATION_JSON)
    public Response postFreshFile(@Context HttpHeaders headers, Byte[] bytes) {
        var newFile = new FileFresh(bytes, headers.getHeaderString("Content-Type"));
        
        return Response.created(getPath("/file/%s", fileService.storeFreshFile(newFile).identifier())).build();
    }
}