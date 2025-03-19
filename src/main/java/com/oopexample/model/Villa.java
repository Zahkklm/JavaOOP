package com.oopexample.model;

/**
 * The Villa class represents a specific type of house, categorized as a villa.
 * It extends the House class and sets the type as "Villa".
 */
public class Villa extends House {

    /**
     * Constructor for the Villa class.
     * It initializes a villa with the specified price, area, number of rooms, and living rooms.
     *
     * @param price       Price of the villa.
     * @param area        Total area of the villa in square meters.
     * @param rooms       Number of rooms in the villa.
     * @param livingRooms Number of living rooms in the villa.
     */
    public Villa(double price, double area, int rooms, int livingRooms) {
        super("Villa", price, area, rooms, livingRooms); // Calls the constructor of the parent House class
    }
}
