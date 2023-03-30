package Backjun;
import java.util.Scanner;
public class Backjun_2739 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		
		if (a < 10 && 0 < a) {
		for (int i = a; i<=a; i++)
			for (int j=1; j<=9; j++)
			System.out.println(a+" * "+j+" = " + a*j);
		}
	}

}