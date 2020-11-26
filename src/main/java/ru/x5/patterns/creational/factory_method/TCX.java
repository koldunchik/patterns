package ru.x5.patterns.creational.factory_method;

public class TCX implements Store {
  @Override
  public void open() {
    System.out.println("Открываем Перекресток");
  }
}
