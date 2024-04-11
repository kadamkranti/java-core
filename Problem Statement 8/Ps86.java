package practice;

import java.util.Map;
import java.util.TreeMap;

public class Ps86 {
	  public static void main(String[] args) {
	        // Creating a TreeMap to store car details with names as keys
	        TreeMap<String, Car> carMap = new TreeMap<>();

	        // Adding predefined information of four car details
	        carMap.put("Bugatti", new Car("Bugatti", 80050.0));
	        carMap.put("Swift", new Car("Swift", 305000.0));
	        carMap.put("Audi", new Car("Audi", 60100.0));
	        carMap.put("Benz", new Car("Benz", 90000.0));


	        // Retrieving and printing the car details
	        System.out.println("Car Details:");
	        for (Map.Entry<String, Car> entry : carMap.descendingMap().entrySet()) {
	            System.out.println(entry.getKey() + ": $" + entry.getValue().getPrice());
	        }
	    }
	
}
