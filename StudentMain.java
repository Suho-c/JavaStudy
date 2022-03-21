
public class StudentMain {

	public static void main(String[] args) {
		
		// new --> 공간을 할당해줄거에요(만들어줄거에요)
		// Student() --> 생성자
		Student st1 = new Student();
		st1.name = "승환쌤";
		st1.number = "12345678";
		st1.age = 35;
		st1.javaScore = 100;
		st1.webScore = 100;
		st1.androidScore = 100;
		st1.studentAvg();
		
		System.out.println("이름 : " + st1.name);
		System.out.println("학번 : " + st1.number);
		System.out.println("나이 : " + st1.age);
		System.out.println("Java 점수 : " + st1.javaScore);
		System.out.println("Web 점수 : " + st1.webScore);
		System.out.println("Android 점수 : " + st1.androidScore);
	
		
		Student st2 = new Student();
		st2.name = "형쌤";
		st2.number = "20210307";
		st2.age = 21;
		st2.javaScore = 99;
		st2.webScore = 100;
		st2.androidScore = 80;
		st2.studentAvg();
		
		System.out.println();
		System.out.println("이름 : " + st2.name);
		System.out.println("학번 : " + st2.number);
		System.out.println("나이 : " + st2.age);
		System.out.println("Java 점수 : " + st2.javaScore);
		System.out.println("Web 점수 : " + st2.webScore);
		System.out.println("Android 점수 : " + st2.androidScore);
	
		
		// st1 과 st2 의 점수 평균을 알고 싶어요!
		// -> 평균 구하는 기능!(메소드로 만들어 주면됨!!)
		// 평균 출력!
	
//		System.out.println();
//		System.out.println("승환쌤 평균 : " + st1.studentAvg());
//		System.out.println("형쌤 평균 : " + st2.studentAvg());
		
		st1.studentAvg();
		st2.studentAvg();
		
		
		
		
	}

//	public static int avg(int java, int web, int android) {
//		int result = (java + web + android) /3 ;
//		return result;
//		}
}
