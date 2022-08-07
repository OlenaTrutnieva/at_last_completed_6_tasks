package by.training.exproject.airline;

import java.util.Arrays;
import java.util.List;

/*Создать классAirline, спецификация которого приведена ниже. 
Определить конструкторы,set- иget- методы и методtoString(). 
Создать второй класс, агрегирующий массив типаAirline, с подходящими конструкторами и методами. 
Задать критерии выбора данных и вывести эти данные на консоль.

Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
Найти и вывести:
a) список рейсов для заданного пункта назначения;
b) список рейсов для заданного дня недели;
c) список рейсов для заданного дня недели, время вылета для которых больше заданного.*/

public class OutPrint {

	public static void printSelectedFlights(List<Airline> airln) {
		for (Airline a : airln) {
			System.out.println("Destination: " + a.getDestination() + "   FlightId: " + a.getFlightId()
					+ "   AircraftType: " + a.getAircraftType() + "   DepartureTime: " + a.getDepartureTime() + "   DapartureDay: " + Arrays.toString(a.getDapartureDay()));
			
		}
		System.out.println();
	}
}
