package Backjun;

import java.util.Scanner;

public class Backjun_10798 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String a = " ";
		char[][] d = new char[5][15];
		
		
		for (int b = 0; b < 5 ; b ++) {
			
			a = sc.nextLine();
			for (int c = 0; c < 15 ; c++ ) {
				if( c < a.length()) {
				d[b][c] = a.charAt(c); 
				}
			}
		}
		for (int i = 0; i < 15 ; i ++) {
			for (int j = 0; j < 5 ; j++) {
				if(d[j][i] != '\0')
				System.out.print(d[j][i]);
			}
		}
		
		
		

		
	}

}
