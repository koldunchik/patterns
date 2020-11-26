package ru.x5.patterns.behavioral.visitor;

public interface Visitor {
    String visitCircle(Circle circle);
    String visitTriangle(Triangle triangle);
    String visitRectangle(Rectangle reactangle);
}
