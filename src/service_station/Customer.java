package service_station;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Customer implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name, address, mobileNumber;
	private Map<String, Vehicle> vehicles = new HashMap<>();

	public Customer(String name, String address, String mobileNumber) {
		this.name = name;
		this.address = address;
		this.mobileNumber = mobileNumber;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public Map<String, Vehicle> getVehicles() {
		return vehicles;
	}

	public void addVehicle(Vehicle vehicle) {
		vehicles.put(vehicle.getVehicleNumber(), vehicle);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Customer customer = (Customer) o;
		return mobileNumber.equals(customer.mobileNumber);
	}

	@Override
	public int hashCode() {
		return Objects.hash(mobileNumber);
	}

	@Override
	public String toString() {
		return "Customer{" + "name='" + name + '\'' + ", address='" + address + '\'' + ", mobileNumber='" + mobileNumber
				+ '\'' + ", vehicles=" + vehicles + '}';
	}
}
