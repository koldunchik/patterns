package ru.x5.patterns.creational.factory_method;

public class TC5Factory extends StoreFactory {
  @Override
  public Store createStore() {
    return new TC5();
  }
}
