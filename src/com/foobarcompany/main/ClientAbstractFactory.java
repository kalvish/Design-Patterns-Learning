package com.foobarcompany.main;

import com.foobarcompany.vehicleabstractfactory.AbstractVehicleFactory;
import com.foobarcompany.vehicleabstractfactory.CarFactory;
import com.foobarcompany.vehicleabstractfactory.VanFactory;
import com.foobarcompany.vehiclecomponents.Body;
import com.foobarcompany.vehiclecomponents.Chassis;
import com.foobarcompany.vehiclecomponents.Windows;

public class ClientAbstractFactory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String whatToMake = "van"; // or van
		AbstractVehicleFactory factory = null;
		
		//Create the correct factory...
		if(whatToMake.equals("car")){
			factory = new CarFactory();
		}else if(whatToMake.equals("van")){
			factory = new VanFactory();
		}
		
		//Create the vehicle's component parts...
		//These will either be all car parts or van parts.
		Body vehicleBody = factory.createBody();
		Chassis vehicleChassis = factory.createChassis();
		Windows vehicleWindows = factory.createWindows();
		
		//Show what we've created
		System.out.println(vehicleBody.getBodyParts());
		System.out.println(vehicleChassis.getChassisParts());
		System.out.println(vehicleWindows.getWindowParts());
	}

}
