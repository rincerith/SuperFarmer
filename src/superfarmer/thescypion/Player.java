package superfarmer.thescypion;

public class Player {

	public class Animals {
		public Integer rabbits=0;
		public Integer sheeps=0;
		public Integer pigs=0;
		public Integer cows=0;
		public Integer horses=0;
		public Integer smallDog=0;
		public Integer bigDog=0;
		
		public Animals(Integer r, Integer s, Integer p, Integer c, Integer h, Integer sd, Integer bd) {
			rabbits=r;
			sheeps=s;
			pigs=p;
			cows=c;
			horses=h;
			smallDog=sd;
			bigDog=bd;
		}

		
		public Animals() {
		}
		
		@Override
		public String toString() {
			String result = new String();
			result += "Króliki: " + rabbits.toString() + "\n";
			result += "Owce: " + sheeps.toString() + "\n";
			result += "Świnie: " + pigs.toString() + "\n";
			result += "Krowy: " + cows.toString() + "\n";
			result += "Konie: " + horses.toString() + "\n";
			result += "Małe psy: " + smallDog.toString() + "\n";
			result += "Duże psy: " + bigDog.toString() + "\n";
			return result;
		}
		
	}
	
	private Animals animals;
	private String name;
	
	public Player() {
		animals = new Animals();
		name = new String("Brak");
	}
	
	public Player( String n, Animals a) {
		name = n;
		animals = a;
	}
	
	public Player(String n,Integer r, Integer s, Integer p, Integer c, Integer h, Integer sd, Integer bd) {
		name = n;
		animals = new Animals(r,s,p,c,h,sd,bd);
	}
	
	@Override
	public String toString() {
		String result = new String();
		result += "Imię: " + name + "\n";
		result += animals.toString();
		return result;
	}
	
	
}
