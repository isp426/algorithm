package Backjun;
import java.util.Scanner;
public class Backjun_9438 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("성적을 입력하세요.");
		int grade = sc.nextInt();
		if (grade >= 90) 
			System.out.print("A");
			else if (grade>=80)
				System.out.print("B");
			else if (grade>=70)
				System.out.print("C");
			else if (grade>=60)
				System.out.print("D");
			else
				System.out.print("F");
	int a = 12 ;
	int b = 6 ;
	System.out.println(12^6);
	int c = -3;
	int abs= 0>c ? -c : c ;
			System.out.println(abs);
	int num = 15;
	if (a > 0  && b > 0 ) 
		System.out.println(num);
	int f = 11;
	float g = 1.1f;
			System.out.println(f/g);
	
		

	}

}
