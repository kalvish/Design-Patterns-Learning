package com.foobarcompany.enginehierarchy;

public abstract class AbstractEngine implements Engine {

	private int size;
	private boolean turbo;

	public AbstractEngine(int size, boolean turbo){
		this.size = size;
		this.turbo = turbo;
	}
	
	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return this.size;
	}

	@Override
	public boolean isTurbo() {
		// TODO Auto-generated method stub
		return this.turbo;
	}

	public String toString() {
		return (this.getClass().getSimpleName() + "[" + "size="
				+ this.getSize() + ",turbo=" + this.isTurbo() + "]");
	}

	public boolean equals(Object other) {
		if (this == other)
			return true;
		if (!(other instanceof Engine))
			return false;
		Engine otherEngine = (Engine) other;
		return (this.toString().equals(otherEngine.toString()));
	}
	
	public int hashCode(){
		return this.toString().hashCode();
	}
}
