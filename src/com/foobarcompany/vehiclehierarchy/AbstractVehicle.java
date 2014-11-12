package com.foobarcompany.vehiclehierarchy;

import com.foobarcompany.enginehierarchy.Engine;

public abstract class AbstractVehicle implements Vehicle {

	private Engine engine;
	private Vehicle.Colour colour;

	public AbstractVehicle(Engine engine) {
		this(engine, Vehicle.Colour.UNPAINTED);
	}

	public AbstractVehicle(Engine engine, Vehicle.Colour colour) {
		// TODO Auto-generated constructor stub
		super();
		this.engine = engine;
		this.colour = colour;
	}

	@Override
	public Engine getEngine() {
		// TODO Auto-generated method stub
		return this.engine;
	}

	@Override
	public void paint(Vehicle.Colour colour) {
		// TODO Auto-generated method stub
		this.colour = colour;
	}

	@Override
	public Vehicle.Colour getColour() {
		// TODO Auto-generated method stub
		return this.colour;
	}

	public String toString() {
		return (this.getClass().getSimpleName() + "[" + "engine="
				+ this.getEngine().toString() + ",colour=" + this.getColour() + "]");
	}

	public boolean equals(Object other) {
		if (this == other)
			return true;
		if (!(other instanceof Vehicle))
			return false;
		Vehicle otherEngine = (Vehicle) other;
		return (this.toString().equals(otherEngine.toString()));
	}

	public int hashCode() {
		return this.toString().hashCode();
	}
}
