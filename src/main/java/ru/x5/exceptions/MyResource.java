package ru.x5.exceptions;

public class MyResource implements AutoCloseable {
  @Override
  public void close() throws Exception {
    System.out.println("Закрытие ресурсов класса: " + this.getClass().getName());
  }
}
