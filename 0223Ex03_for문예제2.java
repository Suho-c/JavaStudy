import java.util.Scanner;

public class Ex03_for문예제2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if (num1 > num2) {
			for(int i = num2; i<=num1 ; i++) {
			System.out.print(i+ " ");
		}
		}else if(num2 > num1) {
				for(int i = num1; i<=num2 ; i++) {
			System.out.print(i+ " ");
		}
		}
		
		// 다 푼경우 삼항연산자로 활용해서 반복문 하나로 줄일 수 있음!
		// 조건문? 참: 거짓
		int big = (num1 > num2) ? num1 : num2;
		int small = (num2 > num1) ? num1 : num2;
		
		for (int i = small ; i <= big; i++) {
			System.out.println(i);
		}
		
		
		
//		
//		for(int i = num1; i<=num2 ; i++) {
//			System.out.print(i+ " ");
//		}
//		for(int i = num2; i<=num1 ; i++) {
//			System.out.print(i+ " ");
//		}
//		
		
	}
}
		
		
	
