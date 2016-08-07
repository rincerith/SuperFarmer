package superfarmer.thescypion;

import java.util.Scanner;

public class SuperFarmer {

	public static void main(String[] args) {
		Player p = new Player();
		System.out.println(p.toString());
		Dice d = new Dice();
		String c = new String("c");
		Scanner in = new Scanner(System.in);
		do{
			Animals[] r = d.rollDice();
			for(Animals a: r) {
				System.out.println(a.toString());
			}
			p.processRoll(r);
			System.out.println(p.toString());
			c = in.nextLine();
		}while(!c.equals("q"));
		in.close();
	}

}
