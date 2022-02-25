import java.util.Scanner;

public class Ex04_for문예제3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("시작할 값 : ");
		int num1 = sc.nextInt();
		System.out.print("끝나는 값 : ");
		int num2 = sc.nextInt();
		int sum = 0;
		
		for(int i = num1; i <= num2; i++) {
			sum += i;
			
		}
		System.out.println("총합 : " + sum);
		
		
		
		

	}

}
