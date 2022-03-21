
public class Person2 {

	// 이름
	private String name;
	// 나이
	private int age;
	// 키
	private int tall;
	// 몸무게
	private int weight;
	
//	public Person2() { =====> defalut 생성자! (눈에는 보이지 않음)
//									  클래스를 만들 떄 자동으로 만들어 지는 녀석
//									  새로운 생성자를 만들어 주는 순간 없어짐!
//									  새로운 생성자를 만든뒤에 사용하고 싶다면 사용자 임의로 만들어 줘야 한다!		
//	}
	
	
	// 생성자(특별한 메소드다!) ---> 클래스 만큼의 공간을 할당한다!
	/* 1. 메소드 이름이 무조건! 클래스 이름과 같아야 한다. -> Person2 이라고 하는 메소드를 만듬
	 * 2. 반환 타입이 없음!! 존재 자체를 하지 않는다!
	 */
	
	
	// 데이터를 받는 새로운 생성자 선언!!
	// 생성자 --> 특이한 메소드다!(리턴자체가 없기 때문에!)
	// 생성자 오버로딩!!!

		
	public Person2(String name, int age, int tall, int weight) {
		super();
		this.name = name;
		this.age = age;
		this.tall = tall;
		this.weight = weight;
	}
	// 생성자 오버로딩을 하는 순간 기존에 있던 디폴트 생성자는 사용할 수 없다.
	
	public Person2() {
		
	}
	// 데이터를 받아서 name 이라는 필드값에 저장시키는 기능을 함!
	


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getTall() {
		return tall;
	}

	public void setTall(int tall) {
		this.tall = tall;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	public void getData() {
		System.out.println(name + "," + age + "," + tall + "," + weight);
	}
}
