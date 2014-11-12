package com.foobarcompany.main;

import com.foobarcompany.vehiclefactorymethod.CarFactory;
import com.foobarcompany.vehiclefactorymethod.VanFactory;
import com.foobarcompany.vehiclefactorymethod.VehicleFactory;
import com.foobarcompany.vehiclehierarchy.Vehicle;

public class ClientFactoryMethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// I want an economical car, coloured blue...
		VehicleFactory carFactory = new CarFactory();
		Vehicle car = carFactory.build(VehicleFactory.DrivingStyle.ECONOMICAL,
				Vehicle.Colour.BLUE);

		// I am a "white van man"...
		VehicleFactory vanFactory = new VanFactory();
		Vehicle van = vanFactory.build(VehicleFactory.DrivingStyle.POWERFUL,
				Vehicle.Colour.WHITE);

		// Using the make method
		// Create a red sports car...
		Vehicle sporty = VehicleFactory.make(VehicleFactory.Category.CAR,
				VehicleFactory.DrivingStyle.POWERFUL, Vehicle.Colour.RED);
	}

}
