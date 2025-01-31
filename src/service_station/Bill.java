package service_station;

import java.io.Serializable;
//import java.sql.Date;

import java.util.*;

class Bill implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ServiceRequest serviceRequest;
	private double finalAmount;
	private Date serviceDate;

	public Bill(ServiceRequest serviceRequest, double finalAmount, Date serviceDate) {
		this.serviceRequest = serviceRequest;
		this.finalAmount = finalAmount;
		this.serviceDate = serviceDate;
	}

	public double getFinalAmount() {
		return finalAmount;
	}

	public Date getServiceDate() {
		return serviceDate;
	}

	public ServiceRequest getServiceRequest() {
		return serviceRequest;
	}
}

