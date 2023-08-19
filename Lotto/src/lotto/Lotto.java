package lotto;

import java.util.Random;

public class Lotto {

	public int[] zufallsZahlenGenerieren() {
		int[] zahlen = new int[6];

		Random random = new Random();
		for (int i = 0; i < zahlen.length; i++) {
			zahlen[i] = random.nextInt(49) + 1;
		}
		return zahlen;
	}

	public int sz() {
		Random random = new Random();
		int sz = random.nextInt(8) + 1;
		return sz;
	}
	
	public int trefferAngabe () {
		int trefferAnzahl = 0;
		
		
		return trefferAnzahl;
	}

}
