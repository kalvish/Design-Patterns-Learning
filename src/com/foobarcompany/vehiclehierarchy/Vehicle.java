package com.foobarcompany.vehiclehierarchy;

import com.foobarcompany.enginehierarchy.Engine;

public interface Vehicle {
	public enum Colour {
		UNPAINTED, BLUE, BLACK, GREEN, RED, SILVER, WHITE, YELLOW
	};

	public Engine getEngine();

	public void paint(Vehicle.Colour colour);

	public Vehicle.Colour getColour();
}
