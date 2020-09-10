package ru.x5.Behavioral.Visitor;

public interface Visitor {
    String visitCircle(Circle circle);
    String visitTriangle(Triangle triangle);
    String visitRectangle(Rectangle reactangle);
}
