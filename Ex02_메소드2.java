package 메소드;

public class Ex02_메소드2 {

	public static void main(String[] args) {
		int num1 = 50;
		int num2 = 15;
		char op = '+';
		
		System.out.println(cal(num1,num2, op));

		
//		int num1 = 50;
//		int num2 = 15;
//		char op = '*';
//		
//		System.out.println(cal(num1,num2, op));

//		int result = 0;
//		if (op == '+') {
//			result = num1 + num2;
//		}
//		else if(op== '-') {
//			result = num1 - num2;
//		}
//		else if(op == '*') {
//			result = num1 * num2;
//		}
//		else if(op == '/') {
//			result = num1 / num2;
//		}
//		System.out.println("결과 : " + result);
//	}
}
	public static int cal(int num1, int num2, char op) {
		int result = 0;
		if (op == '+') {
			result = num1 + num2;
		}
		else if(op== '-') {
			result = num1 - num2;
		}
		else if(op == '*') {
			result = num1 * num2;
		}
		else if(op == '/') {
			result = num1 / num2;
		}
		return result;
	}	
}

