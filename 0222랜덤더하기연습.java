import java.util.Random;
import java.util.Scanner;

public class ·£´ý´õÇÏ±â¿¬½À {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		
		while(true) {
			int num1 = rd.nextInt(10)+1;
			int num2 = rd.nextInt(10)+1;
			
			System.out.print(num1 + " + " + num2 + " = ");
			int user_ans = sc.nextInt();
			int ans = num1 + num2;
			if (user_int == ans) {
				System.out.println("Success!");
			}else {
				System.out.println("Fail!");
			}
		}
		
		
		
	}

}
