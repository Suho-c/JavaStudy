package 메소드;

import java.security.PublicKey;

public class Ex01_메소드1 {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 20;

		int result = add(num1, num2);
		System.out.println("더하기 : " + result);

		// minus 가능 사용하고 싶어요!
		// 메소드 이름으로 호출 : 메소드를 사용할거에요!
		int result2 = minus(num1, num2);
		System.out.println("빼기 : " + result2);
		
		int result3 = mul(num1,num2);
		System.out.println("곱하기 : " + result3);
		
		int result4 = div(num1,num2);
		System.out.println("나누기: " + result4);
		
		
		int re1 = add(10,30);
		System.out.println("결과2 : " + re1);
		
		int re2 = add(40,50);
		System.out.println("결과3 : " + re2);
		
		
		
		
	}
	// 메소드 : 자주 사용하는 기능을 따로 빼놓는것!!을 의미
	// 필요할 때마다 불러와서 사용하자!!
	// public : 접근 제한자 --> 이 메소드를 어디까지 사용범위를 허용할 것인가?
	// static : 공유하다!
	// int : 리턴 타입!(반환타입)
	// add(int num1, int num2) : 메소드 이름! (필요재료) {
	// 			메소드 실행 로직!
	// return result; --> 데이터를 반환할거에요! ★★★★ 중요!!!
	// } 위에서 약속한 리턴 타입에 맞게 데이터를 반환해줘야한다!!

	public static int add(int num1, int num2) {
		int result = num1 + num2;
		return result*2;
	}
		
	// 빼기 기능을 하는 minus 라는 메소드를 만들거에요!
	
	public static int minus(int num1, int num2) {
		int result = num1 - num2;
		return result;
	}
		
	public static int mul(int num1, int num2) {
		int result = num1 * num2;
		return result;
	}
	public static int div(int num1, int num2) {
		int result = num1 / num2;
		return result;	
	}
	
	
}

