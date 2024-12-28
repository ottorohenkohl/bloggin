package de.ottorohenkohl.bloggin.middleware.handler;

import io.quarkus.logging.Log;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;

import java.util.HashMap;

import static jakarta.ws.rs.core.MediaType.APPLICATION_JSON;

@Provider
public class ClassNotFoundHandler implements ExceptionMapper<ClassNotFoundException> {
    
    @Override
    public Response toResponse(ClassNotFoundException exception) {
        Log.debug("An error occurred: ", exception);
        
        var content = new HashMap<String, Object>();
        
        content.put("error", "Bad Request");
        content.put("type", "The requested type does not exist");
        
        return Response.status(Response.Status.BAD_REQUEST).header("Content-Type", APPLICATION_JSON).entity(content).build();
    }
}