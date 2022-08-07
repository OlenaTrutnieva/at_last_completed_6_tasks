package by.training.exproject.state;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/*Создать объект класса Государство, используя классы Область, Район, Город. 
Методы: вывести на консоль столицу, количество областей, площадь, областные центры.*/

public class State {
	private String stateName;
	private List<Region> state;
	
	public State() {
		stateName = "";
		state = new ArrayList<Region>();
	}
	
	public State(String stateName, List<Region> state) {
		this.stateName = stateName;
		this.state = new ArrayList<Region>();
		this.state.addAll(state);
	}
	
	public boolean addRegion(Region region) {
		state.add(region);
		return true;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public List<Region> getState() {
		return state;
	}

	public void setState(List<Region> state) {
		this.state = state;
	}

	@Override
	public int hashCode() {
		return Objects.hash(state, stateName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		State other = (State) obj;
		return Objects.equals(state, other.state) && Objects.equals(stateName, other.stateName);
	}
	
	
	
	

}
