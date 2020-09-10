package ru.x5.Behavioral.Visitor;

public class Circle extends Shape {
  public Circle(String name, int square) {
    super(name, square);
  }

  @Override
  void draw() {
    System.out.println("Draw cicle");
  }

  @Override
  String accept(Visitor visitor) {
    return visitor.visitCircle(this);
  }
}

