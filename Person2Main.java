import java.util.ArrayList;

public class Person2Main {
	public static void main(String[] args) {
	
		// Person() : 생성자
		// 클래스만큼의 공간에 객체(p1)에 할당해준다!!
		
		
		Person2 p1 = new Person2("승환", 20, 173, 70);
		// p1에 대한 승환을 '임짜장'으로 개명하고 싶습니다!
		
		p1.setName("임짜장");
		System.out.println("이름 : " + p1.getName());
		
//		p1.name = "승환";
//		p1.age = 20;
//		p1.tall = 173;
//		p1.weight = 70;
		// 어짜피 각각의 공간에 데이터를 넣어줄거
		// 공간이 만들어지면서 데이터도 같이 가지고 가면 더 좋겠다!
//		System.out.println("이름 : " + p1.name);
		// 형쌤 객체
		Person2 p2 = new Person2();
		p2.setName("형쌤");
		System.out.println("이름 2 : " + p2.getName());
		
		// 형쌤에 대한 객체를 완성해 주세요! --> 각각의 필드값에 데이터를 전부 넣어주세요!
		
		p2.setAge(25);
		p2.setTall(180);
		p2.setWeight(60);
		System.out.println("나이 2 : " + p2.getAge());
		System.out.println("키  2 : " + p2.getTall());
		System.out.println("몸무게 2 : " + p2.getWeight());
		p2.getData();
		
		
		// p1 - 승환쌤
		// p2 - 형쌤
		// p3 - 라는 동원쌤 객체를 만들고 싶어요!
		Person2 p3 = new Person2("동원쌤", 30, 175, 60);
		
		// p4 라는 수민쌤 객체를 만들고 싶어요
		Person2 p4 = new Person2("수민쌤", 21, 160, 40);
		
		//
		//
		//
		//
		//
		//
		//
		
		
		//
		// p100
		
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		int [] numArray = {10,20,30};
		
		// 데이터를 한번에 다룰 수 있는 방법! -> 배열
		// (객체) 배열 선언
		// 데이터 타입[] 배열명 = new 데이터타입[3];
		
		Person2[] pArray = new Person2[4];
		
		pArray[0] = p1;
		pArray[1] = p2;
		pArray[2] = p3;
		pArray[3] = p4;
		
		// pArray 를 사용해서 승환쌤의 키를 출력 시키고 싶어요!
		// pArray[0] ==> p1
		p1.getTall();
		pArray[0].getTall();
		System.out.println("승환쌤 키 : " + pArray[0].getTall());

		// pArray 를 사용해서 형썜의 나이를 출력!
		pArray[1].getAge();
		System.out.println("형쌤 나이 : " + pArray[1].getAge());
		
		// pArray 를 사용해서 선생님들의 평균 나이를 출력 시켜주세요!
		pArray[0].getAge(); // 20 
		pArray[1].getAge(); // 25
		pArray[2].getAge(); // 30
		pArray[3].getAge(); // 21
		
		
		// System.out.println((pArray[0].getAge() + pArray[1].getAge() + pArray[2].getAge() + pArray[3].getAge()) /4);
		
		int sum = 0;
		for(int i = 0; i < pArray.length; i++) {
			sum += pArray[i].getAge();
		}
		System.out.println("나이 평균 : " + sum / pArray.length);
		
		// 선생님들의 이름을 전부 출력해주세요!
		
		for(int i = 0; i < pArray.length; i++) {
			System.out.println(pArray[i].getName());
		}
		
		// 승환쌤, 형쌤, 동원쌤, 수민쌤 --pArray
		// 자연쌤 --> pArray 에 추가 하고 싶습니다!!
		
		// 배열의 한계 : 이미 크기를 정해져 버려서 데이터를 추가하거나 배열의 크기를 바꿀 수 없다!
		// 배열의 한계를 뛰어 넘는 배열 : ArrayList
		// 선생님들의 객체를 담을 수 있는 ArrayList
		
		ArrayList<Person2> pArrayList = new ArrayList<Person2>();
		pArrayList.add(p1);
		pArrayList.add(p2);
		pArrayList.add(p3);
		pArrayList.add(p4);
		
		// 승황쌤에 대한 정보를 출력하고 싶어요!
		// 이름: 승환
		// 나이 : 20
		// 키: 173
		// 몸무게 : 70
		// 객체 ArrayList
		
		System.out.println("이름 : " + pArrayList.get(0).getName());
		System.out.println("나이 : " + pArrayList.get(1).getAge());
		System.out.println("키 : " + pArrayList.get(2).getTall());
		System.out.println("몸무게 : " + pArrayList.get(3).getWeight());
		
		// pArrayList 를 사용해서 선생님들에 대한 정보를 전부 출력시켜주세요!
		// for문 사용 필수!
		
		for(int i = 0; i < pArrayList.size(); i++) {
			System.out.println("이름 : " + pArrayList.get(i).getName());
			System.out.println("나이 : " + pArrayList.get(i).getAge());
			System.out.println("키 : " + pArrayList.get(i).getTall());
			System.out.println("몸무게 : " + pArrayList.get(i).getWeight());
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
	}
		
		
	
}
