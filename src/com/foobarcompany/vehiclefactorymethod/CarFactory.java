package com.foobarcompany.vehiclefactorymethod;

import com.foobarcompany.enginehierarchy.StandardEngine;
import com.foobarcompany.enginehierarchy.TurboEngine;
import com.foobarcompany.vehiclehierarchy.Coupe;
import com.foobarcompany.vehiclehierarchy.Saloon;
import com.foobarcompany.vehiclehierarchy.Sport;
import com.foobarcompany.vehiclehierarchy.Vehicle;

public class CarFactory extends VehicleFactory {

	@Override
	protected Vehicle selectVehicle(DrivingStyle style) {
		Vehicle selectedVehicle;

		if (style.equals(DrivingStyle.ECONOMICAL)) {
			selectedVehicle = new Saloon(new StandardEngine(1300));
		} else if (style.equals(DrivingStyle.MIDRANGE)) {
			selectedVehicle = new Coupe(new StandardEngine(1600));
		} else if (style.equals(DrivingStyle.POWERFUL)) {
			selectedVehicle = new Sport(new TurboEngine(2000));
		} else {
			throw new IllegalArgumentException("DrivingStyle not recognised");
		}
		return selectedVehicle;
	}

}
