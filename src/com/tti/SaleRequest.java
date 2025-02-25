package com.tti;

public class SaleRequest implements ISaleRequest {
	
	private static int idCounter = 0;
	
	private int ticketID;
	private Object client; 
	private String typeOfSale;
	private Object vehicle;
	
	SaleRequest(Object client, String typeOfSale, Object vehicle) {
		this.ticketID = createID();
		this.setClient(client);
		this.setTypeOfSale(typeOfSale);
		this.setVehicle(vehicle);
	}

	public int getTicketID() {
		return ticketID;
	}

	public Client getClient() {
		return (Client) client;
	}

	public void setClient(Object client) {
		this.client = client;
	}

	public String getTypeOfSale() {
		return typeOfSale;
	}

	public void setTypeOfSale(String typeOfSale) {
		this.typeOfSale = typeOfSale;
	}

	public Vehicle getVehicle() {
		return (Vehicle) vehicle;
	}

	public void setVehicle(Object vehicle) {
		this.vehicle = vehicle;
	}
	
	private static int createID() {
	    return idCounter += 1;
	}
}
