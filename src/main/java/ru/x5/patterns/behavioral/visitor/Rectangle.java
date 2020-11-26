package ru.x5.patterns.behavioral.visitor;

public class Rectangle extends Shape {
  public Rectangle(String name, int square) {
    super(name, square);
  }

  @Override
  void draw() {
    System.out.println("Draw rectangle");
  }

  @Override
  String accept(Visitor visitor) {
    return visitor.visitRectangle(this);
  }
}
