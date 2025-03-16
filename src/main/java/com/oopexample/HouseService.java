package com.oopexample;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class HouseService {
    private HouseRepository repository;

    public HouseService(HouseRepository repository) {
        this.repository = repository;
    }

    public double getTotalHousePrice() {
        return repository.getHouseList().stream().mapToDouble(House::getPrice).sum();
    }

    public double getTotalVillaPrice() {
        return repository.getVillaList().stream().mapToDouble(House::getPrice).sum();
    }

    public double getTotalSummerHousePrice() {
        return repository.getSummerHouseList().stream().mapToDouble(House::getPrice).sum();
    }

    public double getTotalPropertyPrice() {
        return getTotalHousePrice() + getTotalVillaPrice() + getTotalSummerHousePrice();
    }

    public double getAverageHouseArea() {
        return repository.getHouseList().stream().mapToDouble(House::getArea).average().orElse(0);
    }

    public double getAverageVillaArea() {
        return repository.getVillaList().stream().mapToDouble(House::getArea).average().orElse(0);
    }

    public double getAverageSummerHouseArea() {
        return repository.getSummerHouseList().stream().mapToDouble(House::getArea).average().orElse(0);
    }

    public double getTotalAverageArea() {
        List<House> allHouses = getAllProperties();
        return allHouses.stream().mapToDouble(House::getArea).average().orElse(0);
    }

    public List<House> filterHousesByRooms(int rooms, int livingRooms) {
        return getAllProperties().stream()
                .filter(h -> h.getRooms() == rooms && h.getLivingRooms() == livingRooms)
                .collect(Collectors.toList());
    }

    private List<House> getAllProperties() {
        List<House> allProperties = new ArrayList<>(repository.getHouseList());
        allProperties.addAll(repository.getVillaList());
        allProperties.addAll(repository.getSummerHouseList());
        return allProperties;
    }
}

