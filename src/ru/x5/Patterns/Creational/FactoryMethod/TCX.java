package ru.x5.Patterns.Creational.FactoryMethod;

public class TCX implements Store {
  @Override
  public void open() {
    System.out.println("Открываем Перекресток");
  }
}
