import java.util.Scanner;

public class 연습 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int total = 0;
		int num = 0;
		
//		while(num != -1) {
//			total += num;
//			System.out.print("입력 : ");
//			num = sc.nextInt();
//			
		
//		while(true) {
//			total += num;
//			System.out.print("입력 : ");
//			num = sc.nextInt();
//			if (num == -1) {
//				break;
//			}
		do {			
			total += num;
			System.out.print("입력 : ");
			num = sc.nextInt();
						
		} while ( num != -1);
		System.out.println("결과 : " + total);
	}

}
