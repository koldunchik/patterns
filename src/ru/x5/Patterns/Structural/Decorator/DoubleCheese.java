package ru.x5.Patterns.Structural.Decorator;

public class DoubleCheese extends PizzaDecorator {
  public DoubleCheese(Item pizza) {
    super(pizza);
  }

  @Override
  public void prepare() {
    super.prepare();
    System.out.print(" + двойной сыр");
  }
}
