package ru.x5.patterns.creational.builder;

public class CarBuilder {
  private String name;
  private int speed;
  private int weight;
  private String engine;

  public CarBuilder withName(String name){
    this.name = name;
    return this;
  }

  public CarBuilder withSpeed(int speed){
    this.speed = speed;
    return this;
  }

  public CarBuilder withWeight(int weight) {
    this.weight = weight;
    return this;
  }

  public CarBuilder withEngine(String engine) {
    this.engine = engine;
    return this;
  }

  public Car build() {
    return new Car(name, speed, weight, engine);
  }

}
