package ru.x5.Behavioral.Strategy;

import java.util.Arrays;
import java.util.Collection;

public class Main {
  public static void main(String[] args) {
    int arr[] = {5,2,1,4,9,3,11};

    Context context = new Context();
    context.setStrategy(new QuickSort());

    context.sort(arr);

    System.out.println(Arrays.toString(arr));
  }
}
