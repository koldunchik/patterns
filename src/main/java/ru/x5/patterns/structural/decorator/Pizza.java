package ru.x5.patterns.structural.decorator;

public class Pizza implements Item {
  @Override
  public void prepare() {
    System.out.print("Пицца");
  }
}
