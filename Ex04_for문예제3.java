import java.util.Scanner;

public class Ex04_for������3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �� : ");
		int num1 = sc.nextInt();
		System.out.print("������ �� : ");
		int num2 = sc.nextInt();
		int sum = 0;
		
		for(int i = num1; i <= num2; i++) {
			sum += i;
			
		}
		System.out.println("���� : " + sum);
		
		
		
		

	}

}
