package ru.x5.patterns.creational.builder;

public class Car {
  private String name;
  private int speed;
  private int weight;
  private String engine;

  public Car(String name, int speed, int weight, String engine) {
    this.name = name;
    this.speed = speed;
    this.weight = weight;
    this.engine = engine;
  }

  @Override
  public String toString() {
    return "Car{" +
        "name='" + name + '\'' +
        ", speed=" + speed +
        ", weight=" + weight +
        ", engine='" + engine + '\'' +
        '}';
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setSpeed(int speed) {
    this.speed = speed;
  }

  public void setWeight(int weight) {
    this.weight = weight;
  }

  public void setEngine(String engine) {
    this.engine = engine;
  }
}
