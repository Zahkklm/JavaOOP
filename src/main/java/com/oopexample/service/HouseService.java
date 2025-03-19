package com.oopexample.service;

import com.oopexample.model.House;
import com.oopexample.repository.HouseRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class HouseService {
    private HouseRepository repository;

    // Constructor to initialize the repository
    public HouseService(HouseRepository repository) {
        this.repository = repository;
    }

    // Calculates the total price of all houses
    public double getTotalHousePrice() {
        return repository.getHouseList().stream().mapToDouble(House::getPrice).sum();
    }

    // Calculates the total price of all villas
    public double getTotalVillaPrice() {
        return repository.getVillaList().stream().mapToDouble(House::getPrice).sum();
    }

    // Calculates the total price of all summer houses
    public double getTotalSummerHousePrice() {
        return repository.getSummerHouseList().stream().mapToDouble(House::getPrice).sum();
    }

    // Calculates the total price of all properties (houses, villas, and summer houses)
    public double getTotalPropertyPrice() {
        return getTotalHousePrice() + getTotalVillaPrice() + getTotalSummerHousePrice();
    }

    // Calculates the average area of all houses
    public double getAverageHouseArea() {
        return repository.getHouseList().stream().mapToDouble(House::getArea).average().orElse(0);
    }

    // Calculates the average area of all villas
    public double getAverageVillaArea() {
        return repository.getVillaList().stream().mapToDouble(House::getArea).average().orElse(0);
    }

    // Calculates the average area of all summer houses
    public double getAverageSummerHouseArea() {
        return repository.getSummerHouseList().stream().mapToDouble(House::getArea).average().orElse(0);
    }

    // Calculates the overall average area of all properties
    public double getTotalAverageArea() {
        List<House> allHouses = getAllProperties();
        return allHouses.stream().mapToDouble(House::getArea).average().orElse(0);
    }

    // Filters properties based on the number of rooms and living rooms
    public List<House> filterHousesByRooms(int rooms, int livingRooms) {
        return getAllProperties().stream()
                .filter(h -> h.getRooms() == rooms && h.getLivingRooms() == livingRooms)
                .collect(Collectors.toList());
    }

    // Retrieves all properties (houses, villas, and summer houses) in a single list
    private List<House> getAllProperties() {
        List<House> allProperties = new ArrayList<>(repository.getHouseList());
        allProperties.addAll(repository.getVillaList());
        allProperties.addAll(repository.getSummerHouseList());
        return allProperties;
    }
}
