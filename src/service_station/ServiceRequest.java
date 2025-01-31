package service_station;

import java.io.Serializable;
import java.util.LinkedList;

class ServiceRequest implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Customer customer;
	private Vehicle vehicle;
	private LinkedList<Service> services = new LinkedList<>();
	private double billAmount;

	public ServiceRequest(Customer customer, Vehicle vehicle) {
		this.customer = customer;
		this.vehicle = vehicle;
	}

	public void addService(Service service) {
		services.add(service);
		billAmount += service.calculateCost();
	}

	public double getBillAmount() {
		return billAmount;
	}

	public LinkedList<Service> getServices() {
		return services;
	}

	public Customer getCustomer() {
		return customer;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}
}
