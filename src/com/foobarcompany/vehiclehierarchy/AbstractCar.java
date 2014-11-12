package com.foobarcompany.vehiclehierarchy;

import com.foobarcompany.enginehierarchy.Engine;

public abstract class AbstractCar extends AbstractVehicle {

	public AbstractCar(Engine engine) {
		super(engine);
		// TODO Auto-generated constructor stub
	}
	
	public AbstractCar(Engine engine, Vehicle.Colour colour) {
		super(engine, colour);
		// TODO Auto-generated constructor stub
	}

}
