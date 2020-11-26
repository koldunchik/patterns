package ru.x5.patterns.creational.factory_method;

public class TCK implements Store {
  @Override
  public void open() {
    System.out.println("Открываем Карусель");
  }
}
