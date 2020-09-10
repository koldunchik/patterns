package ru.x5.Creational.FactoryMethod;

public class TC5Factory extends StoreFactory {
  @Override
  public Store createStore() {
    return new TC5();
  }
}
