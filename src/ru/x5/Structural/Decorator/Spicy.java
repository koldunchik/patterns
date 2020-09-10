package ru.x5.Structural.Decorator;

public class Spicy extends PizzaDecorator {
  public Spicy(Item pizza) {
    super(pizza);
  }

  @Override
  public void prepare() {
    super.prepare();
    System.out.print(" + острая");
  }
}
