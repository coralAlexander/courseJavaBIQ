package examQuestion1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.print.attribute.HashAttributeSet;

public class Occasion {

	private Person celebPerson;
	private Celebration celebration;
	private float AdditionalMoney;
	private int totalMoney = 0;
	private boolean presentBougth;
	private int presentCost = 0;
	private List<Person> listOfPersonWhoPaid = new ArrayList<>();
	private static Map<Occasion, Float> mapOfRemainders;
	private static List<Occasion> occationsList ;

	public Occasion() {
		this.celebPerson = celebPerson;
		this.celebration = celebration;
		occationsList.add(this);
	}

	public void collectMoney(Person person) {
		listOfPersonWhoPaid.add(person);
		totalMoney += 50;
	}

	public void buyPresent(Present present) {
		int price = present.getPresentPrice();
		if (totalMoney < price) {
			presentBougth = true;
			AdditionalMoney= totalMoney-price;
			presentCost= price;
			addReminders(AdditionalMoney);
		}
		else {
			throw new Error("Not enoth money !!!");
		}
	}

	public boolean isPresentBougth() {
		return presentBougth;
	}
	
	private Map<Occasion, Float> addReminders(float AdditionalMoney){
		if (AdditionalMoney>0) {
			mapOfRemainders.put(this, AdditionalMoney);
		}	
		return mapOfRemainders;	
	}
}
