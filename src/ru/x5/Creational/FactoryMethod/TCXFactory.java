package ru.x5.Creational.FactoryMethod;

public class TCXFactory extends StoreFactory {
  @Override
  public Store createStore() {
    return new TCX();
  }
}
