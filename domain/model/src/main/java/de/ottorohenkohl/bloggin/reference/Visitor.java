package de.ottorohenkohl.bloggin.reference;

interface Visitor<T> {
    
    T visit(External external);
    
    T visit(Internal internal);
}