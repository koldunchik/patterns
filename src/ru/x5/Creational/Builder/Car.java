package ru.x5.Creational.Builder;

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
}
