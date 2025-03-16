package com.oopexample;

import java.util.Arrays;
import java.util.List;

public class HouseRepository {
    private List<House> houses = Arrays.asList(
            new House("House", 500000, 120, 3, 1),
            new House("House", 600000, 140, 4, 1),
            new House("House", 450000, 100, 2, 1)
    );

    private List<Villa> villas = Arrays.asList(
            new Villa(900000, 200, 5, 2),
            new Villa(1200000, 250, 6, 2),
            new Villa(850000, 180, 4, 2)
    );

    private List<SummerHouse> summerHouses = Arrays.asList(
            new SummerHouse(700000, 150, 3, 1),
            new SummerHouse(800000, 160, 3, 2),
            new SummerHouse(750000, 155, 4, 1)
    );

    public List<House> getHouseList() { return houses; }
    public List<Villa> getVillaList() { return villas; }
    public List<SummerHouse> getSummerHouseList() { return summerHouses; }
}

