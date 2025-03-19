# Real Estate Management System

This project is a simple **Real Estate Management System** implemented in Java using **OOP principles** and **clean code practices**. It allows you to manage different types of properties such as **Houses, Villas, and Summer Houses**, and provides various functionalities like **price calculations, area averages, and filtering based on room count**.

## 📌 Features
- Store and manage **Houses, Villas, and Summer Houses**.
- Calculate **total prices** for each type of property.
- Calculate **total price for all properties**.
- Compute **average area** for each property type.
- Compute **overall average area**.
- **Filter** properties by number of rooms and living rooms.

## 🛠 Technologies Used
- **Java 11+**
- **Object-Oriented Programming (OOP)**
- **Stream API**
- **Collections Framework**

## 🚀 Installation & Usage
1. Clone this repository:
   ```sh
   git clone https://github.com/your-username/real-estate-management.git
   cd real-estate-management
2. Compile the Java files:


```shell
javac *.java
```
Run the program:
```sh
java Main
```

Class Structure

House → Base class representing any house.

Villa → Subclass of House, representing villas.

SummerHouse → Subclass of House, representing summer houses.

HouseRepository → Stores predefined property lists.

HouseService → Provides operations such as price calculation, area computation, and filtering.

Main → Runs the program and prints results.

Example Output


Total House Price: $1550000.0
Total Villa Price: $2950000.0
Total Summer House Price: $2250000.0
Total Property Price: $6750000.0

Average House Area: 120.0 m²
Average Villa Area: 210.0 m²
Average Summer House Area: 155.0 m²
Overall Average Property Area: 160.0 m²

Properties with 3 rooms and 1 living room:
House - Price: $500000.0, Area: 120.0 m²
SummerHouse - Price: $700000.0, Area: 150.0 m²