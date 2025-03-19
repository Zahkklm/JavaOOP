package com.oopexample.model;

/**
 * The SummerHouse class represents a specific type of house, categorized as a summer house.
 * It extends the House class and sets the type as "SummerHouse".
 */
public class SummerHouse extends House {

    /**
     * Constructor for the SummerHouse class.
     * It initializes a summer house with the specified price, area, number of rooms, and living rooms.
     *
     * @param price       Price of the summer house.
     * @param area        Total area of the summer house in square meters.
     * @param rooms       Number of rooms in the summer house.
     * @param livingRooms Number of living rooms in the summer house.
     */
    public SummerHouse(double price, double area, int rooms, int livingRooms) {
        super("SummerHouse", price, area, rooms, livingRooms); // Calls the constructor of the parent House class
    }
}
