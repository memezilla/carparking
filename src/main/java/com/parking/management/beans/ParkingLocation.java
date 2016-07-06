/**
 * 
 */
package com.parking.management.beans;

import org.springframework.data.annotation.Id;

import java.util.ArrayList;
import java.util.List;

public class ParkingLocation {

	public ParkingLocation() {}
    @Id
	private String id;
	private String name;
	private double lattitude;
	private double longitude;
	private List<ParkingSlot> slots = new ArrayList();
	private Integer total;
	private Integer available;
    private boolean active;

	public ParkingLocation(String name,
                           double lattitude,
                           double longitude,
                           Integer total,
                           Integer available,
                           boolean active) {
		super();
		this.name = name;
		this.lattitude = lattitude;
		this.longitude = longitude;
		this.total = total;
		this.available = available;
        this.active = active;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getLattitude() {
		return lattitude;
	}

	public void setLattitude(double lattitude) {
		this.lattitude = lattitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public List<ParkingSlot> getSlots() {
		return slots;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Integer getAvailable() {
		return available;
	}

	public void setAvailable(Integer available) {
		this.available = available;
	}

    public String getId() {
        return id;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

	@Override
	public String toString() {
		return "Location { name: " + name + ", lattitude: " + lattitude + ", longitude: " + longitude + ", slots: { " + slots + "}, total: " + total  +", available: " + available +" }";
	}
}
