package Backjun;

import java.util.Scanner;

public class Backjun_10818 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		int n = sc.nextInt();
		int[] a = new int[n];
		
		for (int i = 0 ; i <= n-1; i++) {
			a[i] = sc.nextInt();
					
		}int c = a[0];	
		for (int j = 0 ; j <= n-1; j++) {
			if (c < a[j]) {
				c = a[j];
			}else if (c == a[j]) { continue;
				
			}else {
				
			}
		}

		
		int d = a[0];	
		for (int j = 0 ; j <= n-1; j++) {
			if (d > a[j]) {
				d = a[j];
			}else if (d == a[j]) { continue;
				
			}else {
				
			}
		}System.out.println(d+ " ");System.out.println(c);
		
	}

}
