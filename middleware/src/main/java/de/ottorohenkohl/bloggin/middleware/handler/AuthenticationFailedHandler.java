package de.ottorohenkohl.bloggin.middleware.handler;

import io.quarkus.logging.Log;
import io.quarkus.security.AuthenticationFailedException;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;

import java.util.HashMap;

import static jakarta.ws.rs.core.MediaType.APPLICATION_JSON;

@Provider
public class AuthenticationFailedHandler implements ExceptionMapper<AuthenticationFailedException> {
    
    @Override
    public Response toResponse(AuthenticationFailedException exception) {
        Log.debug("An error occurred: ", exception);
        
        var content = new HashMap<String, Object>();
        
        content.put("error", "Not Authorized");
        content.put("type", "The current user could not be authenticated or is not authorized for this action");
        
        return Response.status(Response.Status.FORBIDDEN).header("Content-Type", APPLICATION_JSON).entity(content).build();
    }
}