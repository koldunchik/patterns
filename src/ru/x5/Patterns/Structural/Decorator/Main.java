package ru.x5.Patterns.Structural.Decorator;

public class Main {
  public static void main(String[] args) {

    Item pizza = new Pizza();
    pizza.prepare();

    System.out.println();

    Item pizza1 = new DeepFried(new Pizza());
    pizza1.prepare();

    System.out.println();

    Item pizza2 = new Spicy(new DeepFried(new Pizza()));
    pizza2.prepare();

    System.out.println();

    Item pizza3 = new DoubleCheese(new Pizza());
    pizza3.prepare();

  }
}
