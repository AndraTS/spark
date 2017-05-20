package spark;

public class Sensor {
	
	private String greenHouseName;
	private double intTemperature;
	private double extTemperature;
	private double intMoisture;

	
	public double getExtTemperature() {
		return extTemperature;
	}

	public void setExtTemperature(double extTemperature) {
		this.extTemperature = extTemperature;
	}

	public double getIntMoisture() {
		return intMoisture;
	}

	public void setIntMoisture(double intMoisture) {
		this.intMoisture = intMoisture;
	}

	public double getIntTemperature() {
		return intTemperature;
	}

	public void setIntTemperature(double intTemperature) {
		this.intTemperature = intTemperature;
	}

	public String getGreenHouseName() {
		return greenHouseName;
	}

	public void setGreenHouseName(String greenHouseName) {
		this.greenHouseName = greenHouseName;
	}

}
