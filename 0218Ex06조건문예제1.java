import java.util.Scanner;

public class Ex06조건문예제1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		
		// 삼항 연산자 이용해서 age 값이 20보다 크면 성인입니다!
		// age값이 20보다 작다면 미성년자 입니다!
		
//		String res =  (age > 20) ? "성인입니다!" : "미성년자입니다!";
//		System.out.println(res);
		
		
		
		
		if(10 <= age && age < 20) {// 조건을 제시 : 입력한 나이가 20세 이상인 경우
			 // {조건에 성립햇을때 실행할 부분의 영역 : 출력문을 통해 성인입니다!
			System.out.println("10대입니다.");
		}
		// 20대 입니다! 출력시키고 싶어요!
		else if(20 <= age && age < 30 ) {
			System.out.println("20대 입니다.");
		}
		// 30대 입니다! 출력시키고 싶어요!
		else if(30 <= age && age < 40 ) {
			System.out.println("30대 입니다.");
			
		}
		else if(40 <= age && age < 50 ) {
			System.out.println("40대 입니다.");
			
		}
		// else -> if문의 조건에서 false가 나왔다면 이 문장을 실행 시켜주세요!
		// 다중 if 문에서 else 구문은 >> 위의 모든 조건이 false 라면 실행 시켜주세요.
		else {
			System.out.println("미성년자입니다.");
		}
		System.out.println("프로그램 종료.");

	}
		
		
}
