package com.oopexample;

import com.oopexample.model.House;
import com.oopexample.repository.HouseRepository;
import com.oopexample.service.HouseService;

import java.util.List;

/**
 * The Main class is the entry point of the application.
 * It demonstrates how to use the HouseRepository and HouseService classes to calculate and display various house-related information.
 */
public class Main {
    public static void main(String[] args) {
        // Initialize the HouseRepository to access the list of houses
        HouseRepository repository = new HouseRepository();

        // Initialize the HouseService to perform operations on the houses
        HouseService service = new HouseService(repository);

        // Print total price for houses, villas, summer houses, and all properties combined
        System.out.println("Total House Price: $" + service.getTotalHousePrice());
        System.out.println("Total Villa Price: $" + service.getTotalVillaPrice());
        System.out.println("Total Summer House Price: $" + service.getTotalSummerHousePrice());
        System.out.println("Total Property Price: $" + service.getTotalPropertyPrice());

        // Print average areas for houses, villas, summer houses, and all properties
        System.out.println("\nAverage House Area: " + service.getAverageHouseArea() + " m²");
        System.out.println("Average Villa Area: " + service.getAverageVillaArea() + " m²");
        System.out.println("Average Summer House Area: " + service.getAverageSummerHouseArea() + " m²");
        System.out.println("Overall Average Property Area: " + service.getTotalAverageArea() + " m²");

        // Define the criteria for filtering properties by rooms and living rooms
        int filterRooms = 3;
        int filterLivingRooms = 1;

        // Retrieve the list of houses that match the filter criteria
        List<House> filteredHouses = service.filterHousesByRooms(filterRooms, filterLivingRooms);

        // Print the filtered list of properties with the specified number of rooms and living rooms
        System.out.println("\nProperties with " + filterRooms + " rooms and " + filterLivingRooms + " living rooms:");
        filteredHouses.forEach(h ->
                // Display each property type, price, and area
                System.out.println(h.getType() + " - Price: $" + h.getPrice() + ", Area: " + h.getArea() + " m²")
        );
    }
}
