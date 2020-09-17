package ru.x5.Files;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
  public static void main(String[] args) {

    Path p = Paths.get("/home", "idmitriev", "vpn.sh");
    //Path p = Paths.get("/home", "idmitriev", "rus.txt");

    Path parent = p.getParent() ; // путь /home/ÿÿÿ
    Path file = p.getFileName() ; // путь myprog.properties
    Path root = p.getRoot() ; // путь /

    System.out.println(p);
    System.out.println(parent);
    System.out.println(file);
    System.out.println(root);

    Charset charset = Charset.forName("ISO-8859-1");
    //Charset charset = Charset.forName("UTF-8");

    byte[] bytes = new byte[0];
    try {
      bytes = Files.readAllBytes(p);
      String content = new String(bytes, charset);
      System.out.println(content);
    } catch (IOException e) {
      e.printStackTrace();
    }


    try(InputStream in = new FileInputStream(p.toString())){
      int x = -1;
      while ((x = in.read()) != -1){
        System.out.print((char)x);
      }
    }catch(IOException ex){
      ex.printStackTrace();
    }

    try(BufferedReader reader = new BufferedReader(new FileReader(p.toString()))){
      String str = reader.readLine();
      System.out.println(str);
    }catch (IOException ex){
      ex.printStackTrace();
    }



  }

}
