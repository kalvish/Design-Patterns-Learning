package com.foobarcompany.vehiclehierarchy;

import com.foobarcompany.enginehierarchy.Engine;

public abstract class AbstractVan extends AbstractVehicle {

	public AbstractVan(Engine engine) {
		super(engine);
		// TODO Auto-generated constructor stub
	}
	
	public AbstractVan(Engine engine, Vehicle.Colour colour) {
		super(engine, colour);
		// TODO Auto-generated constructor stub
	}

}
