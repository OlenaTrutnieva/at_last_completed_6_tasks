package by.training.exproject.state;

import java.util.ArrayList;

/*Создать объект класса Государство, используя классы Область, Район, Город. 
Методы: вывести на консоль столицу, количество областей, площадь, областные центры.*/


import java.util.List;
import java.util.Objects;


public class Region {
	private String regionName;
	private List<District> region;
	
	public Region() {
		regionName = "";
		region = new ArrayList<District>();
	}
	
	public Region(String regionName, double regionArea, List<District> region) {
		this.regionName = regionName;
		this.region = new ArrayList<District>();
		this.region.addAll(region);
		
	}
	
	public boolean addDistrict(District distr) {
		region.add(distr);
		return true;
	}

	public String getRegionName() {
		return regionName;
	}

	public void setRegion(String regionName) {
		this.regionName = regionName;
	}

	public List<District> getRegion() {
		return region;
	}

	public void setRegion(List<District> region) {
		this.region = region;
	}

	@Override
	public int hashCode() {
		return Objects.hash(region, regionName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Region other = (Region) obj;
		return Objects.equals(region, other.region) && Objects.equals(regionName, other.regionName);
	}
	
	
	
	

}
