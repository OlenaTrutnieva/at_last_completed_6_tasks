package by.training.exproject.state;

import java.util.ArrayList;
import java.util.List;

public class StateLogic {

	public City stateCapital(State state, District d) {
		City capital = new City();
		List<Region> regList = state.getState();

		for (int j = 0; j < regList.size(); j++) {
			Region reg = regList.get(j);

			capital = d.getCity();
		}

		return capital;
	}

	public int countRegion(State state) {
		int count = 0;
		List<Region> regList = state.getState();

		for (int j = 0; j < regList.size(); j++) {
			count++;
		}
		return count;
	}

	public double regionSquare(Region region) {
		double regSqr;
		regSqr = 0;

		List<District> distr = region.getRegion();
		for (int i = 0; i < distr.size(); i++) {
			District d = distr.get(i);
			regSqr = regSqr + d.getDistrArea();
		}
		return regSqr;
	}

	public double stateSquare(State state) {
		double stateSqr;
		stateSqr = 0;

		List<Region> regList = state.getState();

		for (int j = 0; j < regList.size(); j++) {
			Region reg = regList.get(j);

			List<District> distr = reg.getRegion();
			for (int i = 0; i < distr.size(); i++) {
				District d = distr.get(i);
				stateSqr = stateSqr + d.getDistrArea();
			}

		}
		return stateSqr;
	}

	public List<City> regionCityCenters(State state) {
		List<City> regionCenter = new ArrayList<City>();

		List<Region> regList = state.getState();

		for (int j = 0; j < regList.size(); j++) {
			Region reg = regList.get(j);

			List<District> distr = reg.getRegion();
			for (int i = 0; i < distr.size(); i++) {
				District d = distr.get(i);
				regionCenter.add(d.getCity());
			}

		}
		return regionCenter;
	}

}
