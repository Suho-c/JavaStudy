
public class CalculatorMain {

	public static void main(String[] args) {
		
		
		//2개의 매개변수를 넘겨받는 생성자를 이용해서 cal이라는 객체를 만드세요
		
		Calculator cal = new Calculator(10, 20);
		// cal 객체의 num1 과 num2 를 더한 값을 출력해주세요!
		System.out.println("더하기 : " + cal.sum());
		
		// cal 객체의 num1을 75, num2를 5로 수정해 주세요!
		cal.setNum1(70);
		cal.setNum2(5);
		
		// 더하기, 뺴기, 곱하기, 나누기 출력!!
		System.out.println("수정 후 더하기 : " + cal.sum());
		System.out.println("빼기 : " + cal.sub());
		System.out.println("곱하기 : " + cal.mul());
		System.out.println("나누기 : " + cal.div());
		
		
		
	}

}
