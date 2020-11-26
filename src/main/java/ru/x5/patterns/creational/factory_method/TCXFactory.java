package ru.x5.patterns.creational.factory_method;

public class TCXFactory extends StoreFactory {
  @Override
  public Store createStore() {
    return new TCX();
  }
}
