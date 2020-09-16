package ru.x5.Patterns.Creational.FactoryMethod;

public class TCXFactory extends StoreFactory {
  @Override
  public Store createStore() {
    return new TCX();
  }
}
