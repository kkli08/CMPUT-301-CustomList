package com.example.simpleparadox.listcity;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;

    @BeforeEach
    public void creatList(){
        list = new CustomList(null, new ArrayList<City>());
        list.addCity(new City("Edmonton", "AB"));

    }

    @Test
    public void addCityTest(){
        int listSize = list.getCount();
        list.addCity(new City("Halifax", "NS"));
        assertEquals(list.getCount(), listSize+1);
    }

    @Test
    public void delete(){
        int listSize = list.getCount();
        list.delete((listSize-1));
        assertEquals(list.getCount(), listSize-1);
    }

}
