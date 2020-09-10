package ru.x5.Behavioral.Visitor;

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
