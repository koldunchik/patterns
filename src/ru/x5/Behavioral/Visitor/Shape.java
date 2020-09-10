package ru.x5.Behavioral.Visitor;

public abstract class Shape {
  private String name;
  private int square;

  public Shape(String name, int square){
    this.name = name;
    this.square = square;
  }

  abstract void draw();

  abstract String accept(Visitor visitor);

  public String getName() {
    return name;
  }

  public int getSquare() {
    return square;
  }

}
