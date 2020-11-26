package ru.x5.patterns.structural.decorator;

public class PizzaDecorator implements Item {
  private Item pizza;

  public PizzaDecorator(Item pizza) {
    this.pizza = pizza;
  }

  public void prepare() {
    pizza.prepare();
  }

}
