package ru.x5.patterns.behavioral.visitor;

public class Triangle extends Shape{
  public Triangle(String name, int square) {
    super(name, square);
  }

  @Override
  void draw() {
    System.out.println("Draw triangle");
  }

  @Override
  String accept(Visitor visitor) {
    return visitor.visitTriangle(this);
  }
}