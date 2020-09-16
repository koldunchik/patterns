package ru.x5.Patterns.Behavioral.Strategy;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    int arr[] = {5,2,1,4,9,3,11};

    System.out.println(Arrays.toString(arr));

    Context context = new Context();
    context.setStrategy(new MergeSort());

    context.sort(arr);

    System.out.println(Arrays.toString(arr));
  }
}
