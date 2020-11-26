package ru.x5.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryCatchFinally {
  public static void main(String[] args) {
    FileInputStream inputStream = null;
    try {
      inputStream = new FileInputStream("file.txt");
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException ioe) {
      ioe.printStackTrace();
    } finally {
      try {
        inputStream.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }

  }

}
