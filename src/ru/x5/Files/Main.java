package ru.x5.Files;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
  public static void main(String[] args) {

    Path p = Paths.get("/home", "idmitriev", "vpn.sh");
    Path parent = p.getParent() ; // путь /home/ÿÿÿ
    Path file = p.getFileName() ; // путь myprog.properties
    Path root = p.getRoot() ; // путь /

    System.out.println(p);
    System.out.println(parent);
    System.out.println(file);
    System.out.println(root);


    Charset charset = Charset.forName("ISO-8859-1");

    byte[] bytes = new byte[0];
    try {
      bytes = Files.readAllBytes(p);
      String content = new String(bytes, charset);
      System.out.println(content);
    } catch (IOException e) {
      e.printStackTrace();
    }


  }
}
