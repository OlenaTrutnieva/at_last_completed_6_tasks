package by.training.exproject.state;

import java.util.Arrays;
import java.util.List;


/*Создать объект класса Государство, используя классы Область, Район, Город. 
Методы: вывести на консоль столицу, количество областей, площадь, областные центры.*/

public class OutPrint {
	
	public static void printCapital(City city) {
		String str = new String();
		str = city.toString();
		System.out.print("State square equals: " + str);
		System.out.println();
	}
	
	public static void regionQuantity(int i) {
		System.out.print("Quantity og Regions: " + i);
		System.out.println();
	}
	
	public static void printSquareOfRegion(double sqr) {
		System.out.print("Region square equals: ");
		System.out.printf("%5.2f", sqr);
		System.out.println();
	}
	
	public static void printSquareOfState(double sqr) {
		System.out.print("State square equals: ");
		System.out.printf("%5.2f", sqr);
		System.out.println();
	}
	
	public static void printRegionCenters(List<City> city) {
		System.out.println("Region centers: " );
		for (City c : city) {
			System.out.print(c.getCity() + ", ");
			
		}
		System.out.println();
	}
	
	

}
