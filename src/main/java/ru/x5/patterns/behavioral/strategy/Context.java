package ru.x5.patterns.behavioral.strategy;

public class Context {

  private Strategy strategy;

  public Context() {
  }

  public void setStrategy(Strategy strategy) {
    this.strategy = strategy;
  }

  public void sort(int[] arr) {
    strategy.sortIntArray(arr);
  }

}