package ru.x5.patterns.behavioral.visitor;

public class Main {
  public static void main(String[] args) {
    Shape circle = new Circle("Big Circle", 10000);
    Shape triangle = new Triangle("Small Triangle", 140);
    Shape rectangle = new Rectangle("Normal rectangle", 400);

    XMLVisitor visitor = new XMLVisitor();

    System.out.println(visitor.export(rectangle));

  }
}
