package ru.x5.testing.calc;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class CarRegistrationServiceTest {

    private CarRegistrationService service;
    private DataBase repository;

    @Before
    public void initAccountService(){
        repository = Mockito.mock(DataBase.class);
        service = new CarRegistrationService(repository);
    }

    @Test(expected = RuntimeException.class)
    public void testRegisterThrowRuntimeExceptionWhenCarIsNull(){
        Mockito.doThrow(new RuntimeException()).when(repository).insert(null);
        service.register(null);
    }

    @Test(expected = RuntimeException.class)
    public void testDeregisterThrowRuntimeExceptionWhenCarIsNull(){
        Mockito.doThrow(new RuntimeException()).when(repository).delete(null);
        service.deregister(null);
    }

    @Test
    public void testRegisterCar(){
        service.register("car");
        Mockito.verify(repository,Mockito.times(1)).insert("car");
    }



}
