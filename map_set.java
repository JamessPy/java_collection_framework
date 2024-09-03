package collection_framework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class complexData {

	public static String[] vehicles = { "ambulance", "helicopter", "lifeboat" };

	public static String[][] drivers = { { "Fred", "Sue", "Pete" }, { "Sue", "Richard", "Bob", "Fred" },
			{ "Pete", "Mary", "Bob" } };

	public static void main(String[] args) {

		Map<String, Set<String>> personnel = new HashMap<>();

		for (int i = 0; i < vehicles.length; i++) {
			String vehicle = vehicles[i];
			String[] driverList = drivers[i];

			Set<String> driverSet = new HashSet<String>();

			for (String value : driverList) {
				driverSet.add(value);
			}

			personnel.put(vehicle, driverSet);
		}

		// Example usage
		{// In this bracket used because of can use variable again later
			Set<String> driverList = personnel.get("helicopter");
			for (String value : driverList) {
				System.out.println(value);
			}
		}

		// Iterate through the all data
		for (String key : personnel.keySet()) {

			System.out.print(key + ": ");
			Set<String> driverList = personnel.get(key);

			for (String val : driverList) {
				System.out.print(val + " ");
			}

			System.out.println();
		}

	}

}
