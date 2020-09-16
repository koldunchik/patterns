package ru.x5.Patterns.Creational.Builder;

public class Main {
  public static void main(String[] args) {
    CarBuilder carBuilder = new CarBuilder();

    Car car = carBuilder.withEngine("V8").withSpeed(200).withWeight(800).build();

    System.out.println(car);

    StringBuilder sb = new StringBuilder();

  }

}
