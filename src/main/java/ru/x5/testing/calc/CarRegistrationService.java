package ru.x5.testing.calc;


public class CarRegistrationService {
    private DataBase repository;


    public CarRegistrationService(DataBase repository){
        this.repository = repository;
    }

    public void register(String car){
        repository.insert(car);
    }

    public void deregister(String car){
        repository.delete(car);
    }

}
