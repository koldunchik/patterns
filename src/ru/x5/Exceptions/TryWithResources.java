package ru.x5.Exceptions;

public class TryWithResources {
  public static void myFunction() {
    throw new ExampleException();
  }

  public static void main(String[] args) {
    try(MyResource resource = new MyResource()){
      System.out.println("Выполняем метод.....");
      int x = 0;
      //int y = 1 / x;
      //System.out.println(y);
      myFunction();
    }catch (Exception ex){
      //Что-то пошло не так
      ex.printStackTrace();
    }

  }
}
