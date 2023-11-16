package com.cg.bean;

import java.time.LocalDate;

public class BusBean {

	public static void main(String[] args) {
	}
		private int busId; 
		private String busType; 
		private LocalDate dateOfJourney; 
		private String fromStop, toStop; 
		private int availableSeats, fare;
		
		public BusBean(int busId, String busType, LocalDate dateOfJourney, String fromStop, String toStop,
				int availableSeats, int fare) {
			super();
			this.busId = busId;
			this.busType = busType;
			this.dateOfJourney = dateOfJourney;
			this.fromStop = fromStop;
			this.toStop = toStop;
			this.availableSeats = availableSeats;
			this.fare = fare;
		}

		public int getBusId() {
			return busId;
		}
	
		public void setBusId(int busId) {
			this.busId = busId;
		}
		public String getBusType() {
			return busType;
		}
		public void setBusType(String busType) {
			this.busType = busType;
		}
		public LocalDate getDateOfJourney() {
			return dateOfJourney;
		}
		public void setDateOfJourney(LocalDate dateOfJourney) {
			this.dateOfJourney = dateOfJourney;
		}
		public String getFromStop() {
			return fromStop;
		}
		public void setFromStop(String fromStop) {
			this.fromStop = fromStop;
		}
		public String getToStop() {
			return toStop;
		}
		public void setToStop(String toStop) {
			this.toStop = toStop;
		}
		public int getAvailableSeats() {
			return availableSeats;
		}
		public void setAvailableSeats(int availableSeats) {
			this.availableSeats = availableSeats;
		}
		public int getFare() {
			return fare;
		}
		public void setFare(int fare) {
			this.fare = fare;
		}
	
		@Override
		public String toString() {
			return "BusBean [busId=" + busId + ", busType=" + busType + ", dateOfJourney=" + dateOfJourney
					+ ", fromStop=" + fromStop + ", toStop=" + toStop + ", availableSeats=" + availableSeats + ", fare="
					+ fare + "]";
		}
	
		public BusBean() {
			super();
			// TODO Auto-generated constructor stub
		} 
	}


