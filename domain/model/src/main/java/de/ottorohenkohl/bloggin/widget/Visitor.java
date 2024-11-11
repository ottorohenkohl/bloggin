package de.ottorohenkohl.bloggin.widget;

interface Visitor<T> {
    
    T visit(Alignment alignment);
    
    T visit(Expansion expansion);
    
    T visit(Header header);
    
    T visit(Image image);
    
    T visit(Paragraph paragraph);
    
    T visit(Separator separator);
}