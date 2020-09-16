package ru.x5.Patterns.Creational.FactoryMethod;

public class TCKFactory extends StoreFactory {
  @Override
  public Store createStore() {
    return new TCK();
  }
}
