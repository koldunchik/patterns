package ru.x5.patterns.creational.factory_method;

public class TCKFactory extends StoreFactory {
  @Override
  public Store createStore() {
    return new TCK();
  }
}
