package de.ottorohenkohl.bloggin.domain.reference;

interface Visitor<T> {
    
    T visit(External external);
    
    T visit(Internal internal);
}