package by.tc.task01.main;

import java.util.List;

import by.tc.task01.entity.Appliance;

public class PrintApplianceInfo {

	/**
	 * @param appliances
	 */
	public static void print(List<Appliance> appliances) {
		if (!appliances.isEmpty()) {
			for (Appliance appliance : appliances) {
				System.out.println(appliance.toString());
			}
		}
	}
}
