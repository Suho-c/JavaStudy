	public class Student {

	// 학생이란??
	
	// 이름
	String name;
	// 학번
	String number;
	// 나이
	int age;
	//Java 점수
	int javaScore;
	// Web 점수
	int webScore;
	// Android 점수
	int androidScore;
	
	
	// 평균 구하는 기능
	// 다른 클래스에서 메소드를 만들때 static 을 굳이 적어주지 않아도 된다!
	public void studentAvg() {
		
		// 출력까지 같이 해주고 싶어요		
		// javaScore webScore androidScore
		int result = (javaScore + webScore + androidScore) /3 ;
		System.out.println("평균 : " + result);
		}
		

	
}
