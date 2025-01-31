package service_station;

import java.io.Serializable;
import java.util.Objects;

class Vehicle implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String manufacturer, model, vehicleNumber;

	public Vehicle(String manufacturer, String model, String vehicleNumber) {
		this.manufacturer = manufacturer;
		this.model = model;
		this.vehicleNumber = vehicleNumber;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public String getModel() {
		return model;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Vehicle vehicle = (Vehicle) o;
		return vehicleNumber.equals(vehicle.vehicleNumber);
	}

	@Override
	public int hashCode() {
		return Objects.hash(vehicleNumber);
	}

	@Override
	public String toString() {
		return "Vehicle{" + "manufacturer='" + manufacturer + '\'' + ", model='" + model + '\'' + ", vehicleNumber='"
				+ vehicleNumber + '\'' + '}';
	}
}
