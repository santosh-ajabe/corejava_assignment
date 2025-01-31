package service_station;

import java.io.Serializable;

class Part implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String partId, partName;
	private double price;

	public Part(String partId, String partName, double price) {
		this.partId = partId;
		this.partName = partName;
		this.price = price;
	}

	public String getPartId() {
		return partId;
	}

	public String getPartName() {
		return partName;
	}

	public double getPrice() {
		return price;
	}
}
