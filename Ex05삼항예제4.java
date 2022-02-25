import java.util.Scanner;

public class Ex05삼항예제4 {

	public static void main(String[] args) {
		
//		// 1. 스캐너 임포트
//		Scanner sc = new Scanner(System.in);
//		// 2. 노동시간을 입력하라는 출력문
//		System.out.print("노동시간을 입력하세요 : ");
//		// 3. 노동시간을 입력
//		int hr = sc.nextInt();
//		// 4. 7시간 까지는 9000원의 기본시급 받고, 8시간부터는 1시간 마다 1.5배의 수당받기!
//		int money = (hr > 8) ? (int)(8 * 9000 + (hr-8) * 9000 * 1.5) : (hr * 9000);
//		System.out.println("총 임금은 " + money + " 원 입니다.");
		
		// if ~ else 문으로 이용해서 풀어주세요
		
		
		Scanner sc = new Scanner(System.in);

		System.out.print("노동시간을 입력하세요 : ");

		int hr = sc.nextInt();
		int money = 0;
				
		if (hr > 8) {
			money = (int)(8 * 9000 + (hr-8) * 9000 * 1.5);
		}else {
			money = hr * 9000;
		}
		System.out.println("총 임금은 " + money + " 원 입니다.");
			
		
	}

}
