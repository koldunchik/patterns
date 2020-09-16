package ru.x5.Patterns.Structural.Decorator;

public class PizzaDecorator implements Item {
  private Item pizza;

  public PizzaDecorator(Item pizza) {
    this.pizza = pizza;
  }

  public void prepare() {
    pizza.prepare();
  }

}
