package lotto;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Lotto lotto = new Lotto();
		Kauefer kauefer = new Kauefer();
		kauefer.tippen();
		System.out.println("Die Lottozahlen sind: " + Arrays.toString(lotto.zufallsZahlenGenerieren()));
		System.out.println("Superzahl ist: " + lotto.sz());
	}

}
