package de.ottorohenkohl.bloggin.resource;

import org.hibernate.query.Page;

import java.net.URI;
import java.util.Objects;

public abstract class BaseResource {
    
    protected Page getPage(Integer count, Integer start) {
        return Page.page(Objects.isNull(count) ? 10 : count, Objects.isNull(start) ? 1 : start);
    }
    
    protected URI getPath(String path, Object... args) {
        return URI.create(String.format(path, args));
    }
}