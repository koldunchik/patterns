package ru.x5.testing.calc;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

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
        service.unregister(null);
    }

    @Test
    public void testRegisterCar(){
        service.register("car");
        Mockito.verify(repository, Mockito.times(1)).insert("car");
    }


    @Test
    public void tesCreateCar(){
        service.create("car");
        Mockito.verify(repository, Mockito.times(1)).create("car");
    }


    @Test
    public void whenNotUseMockAnnotation_thenCorrect() {
        List mockList = Mockito.mock(ArrayList.class);

        mockList.add("one");
        Mockito.verify(mockList).add("one");
        assertEquals(0, mockList.size());

        Mockito.when(mockList.size()).thenReturn(100);
        assertEquals(100, mockList.size());
    }


    @Test
    public void whenNotUseSpyAnnotation_thenCorrect() {
        List<String> spyList = Mockito.spy(new ArrayList<String>());

        spyList.add("one");
        spyList.add("two");

        Mockito.verify(spyList).add("one");
        Mockito.verify(spyList).add("two");

        assertEquals(2, spyList.size());

        Mockito.doReturn(100).when(spyList).size();
        assertEquals(100, spyList.size());
    }



}
