package ru.x5.Patterns.Creational.FactoryMethod;

public class TCK implements Store {
  @Override
  public void open() {
    System.out.println("Открываем Карусель");
  }
}
