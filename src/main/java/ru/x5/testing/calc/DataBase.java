package ru.x5.testing.calc;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
    public List<String> getCars(){
        return new ArrayList<String>();
    }
    public String getCar(String car){
        return "Hello";
    }
    public void delete(String car){
        if (car == null)
            throw new RuntimeException("Bad");
    }
    public void update(String car){
        if (car.equals(""))
            throw new RuntimeException("Bad");
    }
    public void insert(String car){
        if (car.equals("") || car == null)
            throw new RuntimeException("Bad");
    }
}
