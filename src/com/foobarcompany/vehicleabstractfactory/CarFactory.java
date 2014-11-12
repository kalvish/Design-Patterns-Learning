package com.foobarcompany.vehicleabstractfactory;

import com.foobarcompany.vehiclecomponents.Body;
import com.foobarcompany.vehiclecomponents.CarBody;
import com.foobarcompany.vehiclecomponents.CarChassis;
import com.foobarcompany.vehiclecomponents.CarWindows;
import com.foobarcompany.vehiclecomponents.Chassis;
import com.foobarcompany.vehiclecomponents.Windows;

public class CarFactory extends AbstractVehicleFactory {

	@Override
	public Body createBody() {
		// TODO Auto-generated method stub
		return new CarBody();
	}

	@Override
	public Chassis createChassis() {
		// TODO Auto-generated method stub
		return new CarChassis();
	}

	@Override
	public Windows createWindows() {
		// TODO Auto-generated method stub
		return new CarWindows();
	}

}
