package com.foobarcompany.vehicleabstractfactory;

import java.awt.Window;

import com.foobarcompany.vehiclecomponents.Body;
import com.foobarcompany.vehiclecomponents.Chassis;
import com.foobarcompany.vehiclecomponents.Windows;

public abstract class AbstractVehicleFactory {
	public abstract Body createBody();
	public abstract Chassis createChassis();
	public abstract Windows createWindows(); 
}
