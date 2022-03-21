
public class StudentMain_과제 {

	public static void main(String[] args) {
		
		Student_과제 csh = new Student_과제();
		
		csh.name = "최수호";
		csh.number = "12345678";
		csh.age = 35;
		csh.scoreJava = 100;
		csh.scoreWeb = 100;
		csh.scoreAndroid = 100;
		
		System.out.println("이름 : " + csh.name);
		System.out.println("학번 : " + csh.number);
		System.out.println("나이 : " + csh.age);
		System.out.println("Java 점수 : " + csh.scoreJava);
		System.out.println("Web 점수 : " + csh.scoreWeb);
		System.out.println("Android 점수 : " + csh.scoreAndroid);
		

	}

}
