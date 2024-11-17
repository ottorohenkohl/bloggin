package de.ottorohenkohl.bloggin.resource;

import java.net.URI;

public abstract class BaseResource {
    
    protected URI getPath(String path, Object... args) {
        return URI.create(String.format(path, args));
    }
}