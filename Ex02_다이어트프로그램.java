import java.util.Scanner;

public class Ex02_다이어트프로그램 {

	public static void main(String[] args) {
		
		// 1. 스캐너 임포트
		Scanner sc = new Scanner(System.in);
		
		// 2. 현재 몸무게 출력문 제공
		System.out.print("현재 몸무게 : ");
		// 2-1. 현재 몸무게 입력
		int cur = sc.nextInt();
		
		// 3. 목표 몸무게 출력문 제공
		System.out.print("목표 몸무게 : ");
		// 3-1. 현재 몸무게 입력
		int goal = sc.nextInt();
		
		int cnt = 1;
		int weight = 0;
		
		// 4. 반복문을
		// n주차 감량 몸무게 출력문 제공
		// 몸무게를 입력
		while(true) {
			System.out.print(cnt +"주차 감량 몸무게 : ");
			weight = sc.nextInt();
			cnt++;
			// 현재 몸무게를 출력하는 문장 작성(현재 몸무게 - 감량 몸무게)
			cur -= weight;
			System.out.println("현재 몸무게 : " + cur);
			if (cur <= goal) {
				System.out.println("최종 몸무게 : " + cur);
				System.out.println("축하합니다!!!");
				break;
			}

		}
		
	}
}


		

