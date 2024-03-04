package view;

import java.util.Scanner;

import controller.ToBinaryController;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ToBinaryController tbc = new ToBinaryController();
		
		int n = 0;
		do {
			n = sc.nextInt();
		} while(n > 2000);
		
		System.out.println(tbc.toBinary(n));
		
		sc.close();

	}

}
