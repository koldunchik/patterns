package ru.x5.testing.calc;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
    public List<String> getCars(){
        return new ArrayList<String>();
    }

    public String create(String car){
        return "BMW";
    }

    public void delete(String car){
        if (car == null)
            throw new RuntimeException("You do not have a car");
    }
    public void update(String car){
        if (car.equals("Zaporozhets"))
            throw new RuntimeException("This car is not supported");
    }
    public void insert(String car){
        if (car.equals("") || car == null)
            throw new RuntimeException("There is no car to insert");
    }
}
