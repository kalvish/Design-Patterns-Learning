package com.foobarcompany.vehicleabstractfactory;

import com.foobarcompany.vehiclecomponents.Body;
import com.foobarcompany.vehiclecomponents.Chassis;
import com.foobarcompany.vehiclecomponents.VanBody;
import com.foobarcompany.vehiclecomponents.VanChassis;
import com.foobarcompany.vehiclecomponents.VanWindows;
import com.foobarcompany.vehiclecomponents.Windows;

public class VanFactory extends AbstractVehicleFactory {

	@Override
	public Body createBody() {
		// TODO Auto-generated method stub
		return new VanBody();
	}

	@Override
	public Chassis createChassis() {
		// TODO Auto-generated method stub
		return new VanChassis();
	}

	@Override
	public Windows createWindows() {
		// TODO Auto-generated method stub
		return new VanWindows();
	}

}
