package com.oopexample.repository;

import com.oopexample.model.House;
import com.oopexample.model.SummerHouse;
import com.oopexample.model.Villa;

import java.util.Arrays;
import java.util.List;

public class HouseRepository {

    // List of House objects with predefined values (Type, Price, Area, Rooms, Living Rooms)
    private List<House> houses = Arrays.asList(
            new House("House", 500000, 120, 3, 1),
            new House("House", 600000, 140, 4, 1),
            new House("House", 450000, 100, 2, 1)
    );

    // List of Villa objects with predefined values (Price, Area, Rooms, Living Rooms)
    private List<Villa> villas = Arrays.asList(
            new Villa(900000, 200, 5, 2),
            new Villa(1200000, 250, 6, 2),
            new Villa(850000, 180, 4, 2)
    );

    // List of SummerHouse objects with predefined values (Price, Area, Rooms, Living Rooms)
    private List<SummerHouse> summerHouses = Arrays.asList(
            new SummerHouse(700000, 150, 3, 1),
            new SummerHouse(800000, 160, 3, 2),
            new SummerHouse(750000, 155, 4, 1)
    );

    // Returns the list of houses
    public List<House> getHouseList() { return houses; }

    // Returns the list of villas
    public List<Villa> getVillaList() { return villas; }

    // Returns the list of summer houses
    public List<SummerHouse> getSummerHouseList() { return summerHouses; }
}
