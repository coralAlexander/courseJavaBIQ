package classes_Food;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Food {
	private String name;
	private final Nutritions nutritions;
	private final int colories;
	private final int gram = 100 ;
	private double fatPracentage;
	private static Map<Food,Integer> foodMap = new HashMap<>();
	public Food(String name, Nutritions nutritions, int colories) {
		this.name = name;
		this.nutritions = nutritions;
		this.colories = colories;
	}
	
	
	
	public Food totalOfFood(String name) {
		for(Entry<Food, Integer> currFood : foodMap.entrySet()) {
			
			
		}
		return null;	
	}
	
}
