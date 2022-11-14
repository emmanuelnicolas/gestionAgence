package com.inti.model;

public class Destination {
	private long idDestination;
	private long longtitude;
	private long latitude;
	
	public Destination(long idDestination, long longtitude, long latitude) {
		this.idDestination = idDestination;
		this.longtitude = longtitude;
		this.latitude = latitude;
	}

	public long getIdDestination() {
		return idDestination;
	}

	public void setIdDestination(long idDestination) {
		this.idDestination = idDestination;
	}

	public long getLongtitude() {
		return longtitude;
	}

	public void setLongtitude(long longtitude) {
		this.longtitude = longtitude;
	}

	public long getLatitude() {
		return latitude;
	}

	public void setLatitude(long latitude) {
		this.latitude = latitude;
	}

	@Override
	public String toString() {
		return "Destination [idDestination=" + idDestination + ", longtitude=" + longtitude + ", latitude=" + latitude
				+ "]";
	}
	
	
	
	
}
