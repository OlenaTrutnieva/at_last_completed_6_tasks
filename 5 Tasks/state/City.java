package by.training.exproject.state;

import java.util.Objects;

/*Создать объект класса Государство, используя классы Область, Район, Город. 
Методы: вывести на консоль столицу, количество областей, площадь, областные центры.*/

public class City {
	private String city;
	
	public City() {
		city = "";
	}
	
	public City(String city) {
		this.city = city;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public int hashCode() {
		return Objects.hash(city);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		City other = (City) obj;
		return Objects.equals(city, other.city);
	}

	@Override
	public String toString() {
		return "City [city=" + city + "]";
	}

}
