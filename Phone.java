
public class Phone {

	// 클래스란? 사용자 임의의 자료형이다!
	// --> 현실에 있는 물체를 표현할 수 있는 사용자 임의의 자료형(type)이다!!
	// 클래스를 만들기 위해서는 추상화, 캡슐화 라는 작업을 통해 만들어 진다!
	
	// 휴대폰 하면 어떤게 생각나나요?
	// 1. 전화를 걸다
	// 2. 전화를 받다
	// 3. 브랜드
	// 4. 게임을 하다
	// 5. 전화번호
	// 위의 5가지 역할을 하는 어떤 것이 있다면 그건 휴대폰이라고 칭할 수 있다.

	// data 와 기능 을 따로 분리!
	// data : 브랜드, 전화번호
	
	
	// 타입이랑 타입명만 지정 해주면됨 초기데이터는 필요x
	String brand;
	// 접근제한자 --> 해당 클래스 내에서만 접근이 가능하게끔! 접근을 허용할 거에용!
	String number;
	
	
	
	// 기능을 코드로 표현 --> 메소드로 만들어 주면됨!!
	// 전화 걸다, 받다 , 게임
	// 메인 클래스외 다른 클래스 에서는 메소드를 만들때 static 을 안붙여도 된다!
		
	public void Call() {
		System.out.println("전화를 걸다");
	}
	public void Send() {
		System.out.println("전화를 받다");
	}
	public void Game() {
		System.out.println("모바일배그를 하다");
	}
	
	public String getNumber() {
		return number;
	}
}
