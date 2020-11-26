package ru.x5.testing.calc;


public class CarRegistrationService {
    private DataBase repository;


    public CarRegistrationService(DataBase repository){
        this.repository = repository;
    }

    public void register(String car){
        repository.insert(car);
    }

    public void unregister(String car){
        repository.delete(car);
    }

    public void create(String car){
        repository.create(car);
    }


}
