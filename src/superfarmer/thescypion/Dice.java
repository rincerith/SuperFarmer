package superfarmer.thescypion;

import java.util.Random;

public class Dice {
	private Random generator;
	
	public Dice() {
		generator = new Random();
	}
	
	public Animals[] rollDice() {
		Animals[] result = new Animals[2];
		for(int i=0; i<2; i++) {
			int random = generator.nextInt(12);
			if(random == 0) {
				result[i] = (i == 0) ? Animals.WOLF : Animals.FOX;
			}
			else if(random == 1) {
				result[i] = (i == 0) ? Animals.COW : Animals.HORSE;
			}
			else if(random == 2 || random == 3) {
				result[i] = Animals.PIG;
			}
			else if(random >= 4 && random <= 6) {
				result[i] = Animals.SHEEP;
			}
			else {
				result[i] = Animals.RABBIT;
			}
		}
		return result;
	}
}
