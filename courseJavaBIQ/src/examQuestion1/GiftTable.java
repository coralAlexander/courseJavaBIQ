package examQuestion1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class GiftTable implements Iterable<Occasion> {

	private static List<Occasion> occationsList = new ArrayList<>();
	private static Map<Occasion, Float> mapOfRemainders = new HashMap<>();
	
	public List<Occasion> getOpenOccasions() {
		List<Occasion> list = new ArrayList<>();
		for (Occasion currOccasion : occationsList) {
			if (currOccasion.isPresentBougth()) {
				list.add(currOccasion);
			}	
		}
		return list;
	}

	public List<Occasion> getClosedOccasions() {
		List<Occasion> list = new ArrayList<>();
		for (Occasion currOccasion : occationsList) {
			if (!currOccasion.isPresentBougth()) {
				list.add(currOccasion);
			}
		}
		return list;
	}

	public List<Occasion> getMoneyLeftOccasions() {

		
		return null;
	}
	
	public void addOccasion(Occasion occation) {
		occationsList.add(occation);
	}

	@Override
	public Iterator<Occasion> iterator() {
		return null;
	}

}
