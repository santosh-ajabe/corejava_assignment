package service_station;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Set;

class ServiceStation implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Set<Customer> customers = new HashSet<>();
	public LinkedList<Bill> bills = new LinkedList<>();
	private Set<Part> availableParts = new HashSet<>();

	public void addCustomer(Customer customer) {
		customers.add(customer);
	}

	public void removeCustomer(Customer customer) {
		customers.remove(customer);
	}

	public Set<Customer> getCustomers() {
		return customers;
	}

	public void addBill(Bill bill) {
		bills.add(bill);
	}

	public LinkedList<Bill> getBills() {
		return bills;
	}

	public void addPart(Part part) {
		availableParts.add(part);
	}

	public Set<Part> getAvailableParts() {
		return availableParts;
	}

	public double calculateTodaysBusiness() {
		double total = 0.0;
		SimpleDateFormat fmt = new SimpleDateFormat("dd-MM-yyyy");
		String today = fmt.format(new Date());
		for (Bill bill : bills) {
			if (fmt.format(bill.getServiceDate()).equals(today)) {
				total += bill.getFinalAmount();
			}
		}
		return total;
	}

	public double calculateBusinessForDate(Date date) {
		double total = 0.0;
		SimpleDateFormat fmt = new SimpleDateFormat("dd-MM-yyyy");
		String targetDate = fmt.format(date);
		for (Bill bill : bills) {
			if (fmt.format(bill.getServiceDate()).equals(targetDate)) {
				total += bill.getFinalAmount();
			}
		}
		return total;
	}
}

