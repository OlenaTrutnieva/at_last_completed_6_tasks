package by.training.exproject.airline;

import java.util.ArrayList;
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

public class AirlineLogic {

	public List<Airline> flightByDestination(Airline[] flights, String destination) {
		List<Airline> result = new ArrayList<Airline>();

		for (Airline a : flights) {
			if (destination.equals(a.getDestination())) {
				result.add(a);
			}
		}
		return result;
	}

	// выбор рейсов по заданным дням: передаем список рейсов, массив дней -
	// сравниваем с содержимым массива дней в каждом рейсе
	public List<Airline> flightByDay(Airline[] flights, String[] dapartDay) {
		List<Airline> result = new ArrayList<Airline>();

		for (Airline a : flights) {
			for (int i = 0; i < a.getDapartureDay().length; i++) {
				for (int j = 0; j < dapartDay.length; j++) {
					if (dapartDay[j].equals(a.getDapartureDay()[i])) {
						result.add(a);
					}

				}

			}

		}
		return result;
	}

	// выбор рейсов по заданным дням и времени: передаем список рейсов, массив дней
	// - сравниваем с содержимым массива дней в каждом рейсе
	public List<Airline> flightByDayAndTime(Airline[] flights, String departTime, String dapartDay) {
		List<Airline> result = new ArrayList<Airline>();

		for (Airline a : flights) {
			int x = departTime.compareTo(a.getDepartureTime());
			if (x < 0) {
				for (int i = 0; i < a.getDapartureDay().length; i++) {

					if (dapartDay.equals(a.getDapartureDay()[i])) {
						result.add(a);
					}

				}

			}

		}
		return result;
	}
}
