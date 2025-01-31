package service_station;

import java.io.Serializable;
import java.util.LinkedList;

class Service implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String serviceType;
	private LinkedList<Part> partsReplaced = new LinkedList<>();
	private double laborCharges;

	public Service(String serviceType, double laborCharges) {
		this.serviceType = serviceType;
		this.laborCharges = laborCharges;
	}

	public void addPart(Part part) {
		partsReplaced.add(part);
	}

	public double calculateCost() {
		double partsCost = partsReplaced.stream().mapToDouble(Part::getPrice).sum();
		return partsCost + laborCharges;
	}

	// Add getter methods for serviceType and laborCharges
	public String getServiceType() {
		return serviceType;
	}

	public double getLaborCharges() {
		return laborCharges;
	}

	public LinkedList<Part> getPartsReplaced() {
		return partsReplaced;
	}
}
