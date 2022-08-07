package by.training.exproject.state;

import java.util.ArrayList;
import java.util.List;

/*Создать объект класса Государство, используя классы Область, Район, Город. 
Методы: вывести на консоль столицу, количество областей, площадь, областные центры.*/

public class Main {

	public static void main(String[] args) {
		
		State wonderland = new State();		
		
		City capital = new City("WonderYork");
		City city1 = new City("MiracleYork");
		City city2 = new City("FairyYork");
		City city3 = new City("AmazYork");
		City city4 = new City("PrincessYork");
		City city5 = new City("PrinceYork");
		City city6 = new City("BlablaYork");
		City city7 = new City("Blablapol");
		
		District distr1 = new District("Distr1", 345.67, capital);
		District distr2 = new District("Distr2",577.67, city1);
		District distr3 = new District("Distr3",77.567, city2);
		District distr4 = new District("Distr4",797.7, city3);
		District distr5 = new District("Distr5",797.7, city4);
		District distr6 = new District("Distr6",1797.7, city5);
		District distr7 = new District("Distr7",597.7, city6);
		District distr8 = new District("Distr8",1696.7, city7);
		
		Region region1 = new Region();
		region1.addDistrict(distr1);
		region1.addDistrict(distr2);
		region1.addDistrict(distr3);
		
		Region region2 = new Region();
		region2.addDistrict(distr4);
		region2.addDistrict(distr5);
		
		Region region3 = new Region();
		region3.addDistrict(distr6);
		region3.addDistrict(distr7);
		region3.addDistrict(distr8);
		
		wonderland.addRegion(region1);
		wonderland.addRegion(region2);
		wonderland.addRegion(region3);
		
		StateLogic logic = new StateLogic();
		OutPrint print = new OutPrint();
		
		City stateCapital = new City();
		stateCapital = logic.stateCapital(wonderland, distr1);
		print.printCapital(stateCapital);
		
		/*
		 * double region1Square = logic.regionSquare(region1);
		 * 
		 * print.printSquareOfRegion(region1Square);
		 */
		
		int regionQuantity = logic.countRegion(wonderland);
		print.regionQuantity(regionQuantity);
		
		double stateSquare = logic.stateSquare(wonderland);
		
		print.printSquareOfState(stateSquare);
		
		List<City> regionCenters = logic.regionCityCenters(wonderland);
		print.printRegionCenters(regionCenters);

		

	}

}
