package by.training.exproject.airline;

import java.util.Arrays;

/*Создать классAirline, спецификация которого приведена ниже. 
Определить конструкторы,set- иget- методы и методtoString(). 
Создать второй класс, агрегирующий массив типаAirline, с подходящими конструкторами и методами. 
Задать критерии выбора данных и вывести эти данные на консоль.

Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
Найти и вывести:
a) список рейсов для заданного пункта назначения;
b) список рейсов для заданного дня недели;
c) список рейсов для заданного дня недели, время вылета для которых больше заданного.*/

public class Airline {
	private String destination;
	private String flightId;
	private String aircraftType;
	private String departureTime;
	private String[] dapartureDay;
	
	public Airline() {
		destination = "";
		flightId = "";
		aircraftType = "";
		departureTime = "";
		dapartureDay = new String[7];
	}
	
	public Airline(String destination, String flightId, String aircraftType, String departureTime, String[] dapartureDay) {
		this.destination = destination;
		this.flightId = flightId;
		this.aircraftType = aircraftType;
		this.departureTime = departureTime;
		this.dapartureDay = dapartureDay;
	}
	
	public Airline(String destination) {
		this.destination = destination;
	}
	
	public Airline(String[] dapartureDay) {
		dapartureDay = new String[7];
	}
	
	public Airline(String departureTime, String[] dapartureDay) {
		this.departureTime = departureTime;
		this.dapartureDay = new String[7];
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getFlightId() {
		return flightId;
	}

	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}

	public String getAircraftType() {
		return aircraftType;
	}

	public void setAircraftType(String aircraftType) {
		this.aircraftType = aircraftType;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	public String[] getDapartureDay() {
		return dapartureDay;
	}

	public String[]  setDapartureDay(String[] dapartureDay) {
		this.dapartureDay = dapartureDay;
		return dapartureDay;
	}

	@Override
	public String toString() {
		return "Airline [destination=" + destination + ", flightId=" + flightId + ", aircraftType=" + aircraftType
				+ ", departureTime=" + departureTime + ", dapartureDay=" + Arrays.toString(dapartureDay) + "]";
	}
	
	
	

}
