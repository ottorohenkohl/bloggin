package de.ottorohenkohl.bloggin;

import de.ottorohenkohl.bloggin.file.FileService;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/")
public class Test {
    public FileService fileService;
    
    @GET
    public String returnTest() {
        return "Hello World!";
    }
}
