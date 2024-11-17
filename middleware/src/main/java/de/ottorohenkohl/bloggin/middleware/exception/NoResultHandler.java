package de.ottorohenkohl.bloggin.middleware.exception;

import io.quarkus.logging.Log;
import jakarta.persistence.NoResultException;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;

import java.util.HashMap;

import static jakarta.ws.rs.core.MediaType.APPLICATION_JSON;

@Provider
public class NoResultHandler implements ExceptionMapper<NoResultException> {
    
    @Override
    public Response toResponse(NoResultException exception) {
        Log.debug("An error occurred: ", exception);
        
        var content = new HashMap<String, Object>();
        
        content.put("error", "Not Found");
        content.put("type", "Requested Resource is not available or does not exist");
        
        return Response.status(Response.Status.NOT_FOUND).header("Content-Type", APPLICATION_JSON).entity(content).build();
    }
}