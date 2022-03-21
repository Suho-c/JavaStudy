
public class Ex01_메소드오버로딩2 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		System.out.println("결과1 : " + add(num1, num2));

		double num3 = 10.5;
		double num4 = 21.7;
		System.out.println("결과2 : " + add(num3, num4));

		float num5 = 3.14f;
		float num6 = 5.89f;
		System.out.println("결과3 : " + add(num5, num6));
	
		
		// 메소드 오버로딩
		// 같은 메소드 이름으로 다른 매개변수를 받아서 다른 결과를 얻을 수 있도록 하는 기법!
		// 특징 : ★ 메소드 이름이 같아야 한다! 
		//		 ★ 메소드 이름이 같으면서 ★ 매개변수가 달라야만 한다!
		// 메소드 이름이 같으면서 리턴 타입이 다른경우는 메소드 로버로딩이 아니다!

		System.out.println("Test 결과 : " + add(num1, num3));
//		System.out.println(" Test 결과 : " + add(10, "test")); 안됨!! 
		
	}
	public static int add(int num1, int num2) {
		return num1 + num2;
	}

	
	public static double add(double num3, double num4) {
		return num3 + num4;
	}

	public static float add(float num5, float num6) {
		return num5 + num6;
	}
	public static String add(String str1, String str2) {
		return str1 + str2; 
	}
}
