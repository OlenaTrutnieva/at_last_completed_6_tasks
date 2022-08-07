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

public class Main {

	public static void main(String[] args) {
		Airline[] airln = new Airline[10];
		
		airln[0] = new Airline("Berlin", "BRN-456575", "Boing12", "06:15", new String[] {"MON", "WED", "FRI"});
		airln[1] = new Airline("Warsaw", "WR-434675675", "Boing1", "17:00", new String[] {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"});
		airln[2] = new Airline("Chicago", "CH-11123422", "Boing25", "08:00", new String[] {"FRI", "SAT", "SUN"});
		airln[3] = new Airline("Vilnius", "RM-987654", "Boing1", "18:40", new String[] {"TUE", "THU", "SUN"});
		airln[4] = new Airline("Oslo", "OSL-133475", "Boing456", "06:40", new String[] {"MON", "WED", "FRI"});
		airln[5] = new Airline("London", "LDN-456575", "Boing124", "14:00", new String[] {"FRI", "SAT", "SUN"});
		airln[6] = new Airline("Berlin", "BR-4564375", "Boing456", "14:20", new String[] {"SAT", "SUN"});
		airln[7] = new Airline("London", "LDN-456575", "Boing124", "14:00", new String[] {"MON", "TUE", "FRI", "SAT"});
		airln[8] = new Airline("Vilnius", "VLN-111111", "Boing45", "09:15", new String[] {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"});
		airln[9] = new Airline("Moscow", "MSC-458999", "Boing", "16:00", new String[] {"MON", "FRI"});
		
			
		AirlineLogic logic = new AirlineLogic();
		OutPrint viewList = new OutPrint();
		
		List<Airline> flightByDestination = logic.flightByDestination(airln, "Vilnius");
		viewList.printSelectedFlights(flightByDestination);
		
		String[] strDays = new String[] {"MON", "THU"};
		List<Airline> flightByDay = logic.flightByDay(airln, strDays);
		viewList.printSelectedFlights(flightByDay);
		
		
		List<Airline> flightByDayTime = logic.flightByDayAndTime(airln, "15:00", "TUE");
		viewList.printSelectedFlights(flightByDayTime);
		
		

	}

}
