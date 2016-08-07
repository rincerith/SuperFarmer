package superfarmer.thescypion;

import java.util.HashMap;
import java.util.Map;

public class Player {
	private Map<Animals, Integer> animals;
	private String name;
	
	public Player() {
		animals = new HashMap<Animals, Integer>();
		for(Animals animal : Animals.values()) {
			animals.put(animal, 0);
		}
		name = new String("Brak");
	}
	
	@Override
	public String toString() {
		String result = new String();
		result += "Imię: " + name + "\n";
		result += animals.toString();
		return result;
	}
	
	public void processRoll(Animals[] rollResult) {
		if(rollResult[0] == Animals.WOLF || rollResult[1] == Animals.WOLF) {
			Integer bigDogNumber = animals.get(Animals.BIGDOG);
			if(bigDogNumber > 0) {
				animals.put(Animals.BIGDOG, bigDogNumber-1);
			} else {
				animals.put(Animals.RABBIT, 0);
				animals.put(Animals.SHEEP, 0);
				animals.put(Animals.PIG, 0);
				animals.put(Animals.COW, 0);
			}
		}
		else if(rollResult[0] == Animals.FOX || rollResult[1] == Animals.FOX) {
			Integer smallDogNumber = animals.get(Animals.SMALLDOG);
			if(smallDogNumber > 0) {
				animals.put(Animals.BIGDOG, smallDogNumber-1);
			} else {
				animals.put(Animals.RABBIT, 0);
			}
		} 
		else if(rollResult[0] != rollResult[1]){
			for(Animals animal : rollResult) {
				Integer numberOfAnimals = animals.get(animal);
				Integer factor = Math.floorDiv(numberOfAnimals+1, 2);
				animals.put(animal, numberOfAnimals+factor);
			}
		}
		else {
			Integer numberOfAnimals = animals.get(rollResult[0]);
			Integer factor = Math.floorDiv(numberOfAnimals+2, 2);
			animals.put(rollResult[0], numberOfAnimals+factor);
		}
	}
}
