package com.skilldistillery.jets;

public abstract class Jet {
	private String model;
	private double speed;
	private int range;
	private long price;
	
	// fly method
	public void fly() {
		
	}
	
	// getSpeedInMach method
	public double getSpeedInMach() {
		double output = 0;
		
		return output;
	}

	// model getter
	public String getModel() {
		return model;
	}

	// model setter
	public void setModel(String model) {
		this.model = model;
	}

	// speed getter
	public double getSpeed() {
		return speed;
	}

	// speed setter
	public void setSpeed(double speed) {
		this.speed = speed;
	}

	// range getter
	public int getRange() {
		return range;
	}

	// range setter
	public void setRange(int range) {
		this.range = range;
	}

	// price getter
	public long getPrice() {
		return price;
	}

	//price setter
	public void setPrice(long price) {
		this.price = price;
	}

	// hashCode
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + (int) (price ^ (price >>> 32));
		result = prime * result + range;
		long temp;
		temp = Double.doubleToLongBits(speed);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	// equalsCode
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jet other = (Jet) obj;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (price != other.price)
			return false;
		if (range != other.range)
			return false;
		if (Double.doubleToLongBits(speed) != Double.doubleToLongBits(other.speed))
			return false;
		return true;
	}

	// toString
	@Override
	public String toString() {
		return "Jet [model=" + model + ", speed=" + speed + ", range=" + range + ", price=" + price + "]";
	}

	// Jet constructor
	public Jet(String model, double speed, int range, long price) {
		super();
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
	}
	 
}
