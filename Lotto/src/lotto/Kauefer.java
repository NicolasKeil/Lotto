package lotto;

import java.util.Scanner;

public class Kauefer {
	
	public void tippen () {
		Scanner sc = new Scanner (System.in);
		int [] wette = new int [6];
		
		System.out.print("Gib deine Wette ein: ");  
		for(int i=0; i<6; i++)  
		{  
		//reading array elements from the user   
		wette[i]=sc.nextInt();  
		}  
		
		System.out.println("Gib die SZ ein: ");
		int sz = sc.nextInt();
		
		System.out.print("Deine Wette : ");
		for(int i=0; i<6; i++)  
		{  
		//reading array elements from the user   
		System.out.print(wette[i] + "  "); 
		}  
		
		System.out.print("Deine Superzahl: " + sz);
		System.out.println();
	}

}
