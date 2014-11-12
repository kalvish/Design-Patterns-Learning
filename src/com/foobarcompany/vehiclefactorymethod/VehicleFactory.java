package com.foobarcompany.vehiclefactorymethod;

import com.foobarcompany.vehiclehierarchy.Vehicle;

public abstract class VehicleFactory {
	public enum DrivingStyle {
		ECONOMICAL, MIDRANGE, POWERFUL
	};

	public enum Category {
		CAR, VAN
	};

	public static Vehicle make(Category cat, DrivingStyle style,
			Vehicle.Colour colour) {
		VehicleFactory factory;

		if (cat.equals(Category.CAR)) {
			factory = new CarFactory();
		} else if (cat.equals(Category.VAN)) {
			factory = new VanFactory();
		} else {
			throw new IllegalArgumentException("Category not recognised");
		}

		return factory.build(style, colour);
	}

	public Vehicle build(DrivingStyle style, Vehicle.Colour colour) {
		Vehicle v = this.selectVehicle(style);
		v.paint(colour);
		return v;
	}

	// This is the 'factory method'
	protected abstract Vehicle selectVehicle(DrivingStyle style);
}
