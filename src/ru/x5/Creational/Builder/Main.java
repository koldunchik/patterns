package ru.x5.Creational.Builder;

public class Main {
  public static void main(String[] args) {
    CarBuilder carBuilder = new CarBuilder();

    Car car = carBuilder.withName("Toyota").withEngine("V8").withSpeed(200).withWeight(800).build();

    System.out.println(car);
  }

}
