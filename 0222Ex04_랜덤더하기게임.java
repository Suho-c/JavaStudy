import java.util.Random;
import java.util.Scanner;

public class Ex04_랜덤더하기게임 {

	public static void main(String[] args) {
		
		// 랜덤숫자 뽑는 방법
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		int suc = 0;
		int fail = 0;
		
		while (true) {
			
			int num1 = rd.nextInt(10)+1; // 1부터 10까지
			int num2 = rd.nextInt(10)+1; 
			System.out.print(num1 + " + " + num2 + " = " );
			int user_ans = sc.nextInt();
			int ans = num1 + num2;
			if (user_ans == ans) {
				System.out.println("Success!");
				suc++;
			}else {
				System.out.println("Fail!");
				fail++;
			}
			System.out.print("계속하시겠습니까? ");
			String ans2 = sc.next();
			if(ans2.equals("Y")) {
				continue;
			}else if (ans2.equals("N")) {
				System.out.println("종료!");
				System.out.println("맞춘 개수 : " + suc);
				System.out.println("틀린 개수 : " + fail);
				break;			
		}
		
		}
	}

}
