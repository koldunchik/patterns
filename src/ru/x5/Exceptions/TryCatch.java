package ru.x5.Exceptions;

public class TryCatch {
  public static void main(String[] args) {
    try {
      int x = 10;
      int y =  0;
      System.out.println(x/y);
    } catch (Exception e) {
      e.printStackTrace();
    }

    System.out.println("Мы здесь");
  }
}
