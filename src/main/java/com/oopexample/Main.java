package com.oopexample;

import com.oopexample.model.House;
import com.oopexample.repository.HouseRepository;
import com.oopexample.service.HouseService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        HouseRepository repository = new HouseRepository();
        HouseService service = new HouseService(repository);

        System.out.println("Total House Price: $" + service.getTotalHousePrice());
        System.out.println("Total Villa Price: $" + service.getTotalVillaPrice());
        System.out.println("Total Summer House Price: $" + service.getTotalSummerHousePrice());
        System.out.println("Total Property Price: $" + service.getTotalPropertyPrice());

        System.out.println("\nAverage House Area: " + service.getAverageHouseArea() + " m²");
        System.out.println("Average Villa Area: " + service.getAverageVillaArea() + " m²");
        System.out.println("Average Summer House Area: " + service.getAverageSummerHouseArea() + " m²");
        System.out.println("Overall Average Property Area: " + service.getTotalAverageArea() + " m²");

        int filterRooms = 3;
        int filterLivingRooms = 1;
        List<House> filteredHouses = service.filterHousesByRooms(filterRooms, filterLivingRooms);
        System.out.println("\nProperties with " + filterRooms + " rooms and " + filterLivingRooms + " living rooms:");
        filteredHouses.forEach(h ->
                System.out.println(h.getType() + " - Price: $" + h.getPrice() + ", Area: " + h.getArea() + " m²")
        );
    }
}
