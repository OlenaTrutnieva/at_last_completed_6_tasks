package by.training.exproject.state;

import java.util.Objects;

/*Создать объект класса Государство, используя классы Область, Район, Город. 
Методы: вывести на консоль столицу, количество областей, площадь, областные центры.*/

public class District {
	@Override
	public String toString() {
		return "District [city=" + city + "]";
	}

	private String district;
	private double distrArea;
	private City city;
	
	public District() {
		district = "";
		distrArea = 0;
		city = new City();
	}
	
	public District(String district, double distrArea, City city) {
		this.district = district;
		this.distrArea = distrArea;
		this.city = city;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public double getDistrArea() {
		return distrArea;
	}

	public void setDistrArea(double distrArea) {
		this.distrArea = distrArea;
	}

	@Override
	public int hashCode() {
		return Objects.hash(city, distrArea, district);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		District other = (District) obj;
		return Objects.equals(city, other.city)
				&& Double.doubleToLongBits(distrArea) == Double.doubleToLongBits(other.distrArea)
				&& Objects.equals(district, other.district);
	}

	

}
