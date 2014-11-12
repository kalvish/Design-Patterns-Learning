package com.foobarcompany.vehiclefactorymethod;

import com.foobarcompany.enginehierarchy.StandardEngine;
import com.foobarcompany.enginehierarchy.TurboEngine;
import com.foobarcompany.vehiclehierarchy.BoxVan;
import com.foobarcompany.vehiclehierarchy.Pickup;
import com.foobarcompany.vehiclehierarchy.Vehicle;

public class VanFactory extends VehicleFactory {

	@Override
	protected Vehicle selectVehicle(DrivingStyle style) {
		Vehicle selectedVehicle;

		if (style.equals(DrivingStyle.ECONOMICAL)||style.equals(DrivingStyle.MIDRANGE)) {
			selectedVehicle = new Pickup(new StandardEngine(2200));
		}else if (style.equals(DrivingStyle.POWERFUL)) {
			selectedVehicle = new BoxVan(new TurboEngine(2500));
		} else {
			throw new IllegalArgumentException("DrivingStyle not recognised");
		}
		return selectedVehicle;
	}

}
