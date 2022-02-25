import java.util.Scanner;

public class Ex10_이중for문2 {

	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("단 입력 : ");
//		int dan = sc.nextInt();
//		
//		for(int i = 1; i < 10; i++) {
//			System.out.println(dan + " * " + i + " = " + dan * i );
//		
//		
//		
//			
//		}
		
		Scanner sc = new Scanner(System.in);
		System.out.print("단수 입력 : ");
		int dan = sc.nextInt();
		System.out.print("어느 수까지 출력 : ");
		int num = sc.nextInt();
		
		for(int i = 1;  i <= num; i++) {
			System.out.println(dan + " * " + i + " = " + dan * i );
		
		}

	}

}
