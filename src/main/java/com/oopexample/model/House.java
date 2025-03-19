package com.oopexample.model;

/**
 * The House class represents a general real estate property.
 * It includes attributes such as type, price, area, number of rooms, and living rooms.
 */
public class House {
    private String type;      // Type of the house (e.g., House, Villa, SummerHouse)
    private double price;     // Price of the house
    private double area;      // Total area in square meters
    private int rooms;        // Number of rooms
    private int livingRooms;  // Number of living rooms

    /**
     * Constructor to initialize a House object with specified attributes.
     *
     * @param type        Type of the house
     * @param price       Price of the house
     * @param area        Total area of the house
     * @param rooms       Number of rooms
     * @param livingRooms Number of living rooms
     */
    public House(String type, double price, double area, int rooms, int livingRooms) {
        this.type = type;
        this.price = price;
        this.area = area;
        this.rooms = rooms;
        this.livingRooms = livingRooms;
    }

    /**
     * @return The price of the house.
     */
    public double getPrice() { return price; }

    /**
     * @return The total area of the house.
     */
    public double getArea() { return area; }

    /**
     * @return The number of rooms in the house.
     */
    public int getRooms() { return rooms; }

    /**
     * @return The number of living rooms in the house.
     */
    public int getLivingRooms() { return livingRooms; }

    /**
     * @return The type of the house.
     */
    public String getType() { return type; }
}
