
public class StudentMain {

	public static void main(String[] args) {
		
		// new --> ������ �Ҵ����ٰſ���(������ٰſ���)
		// Student() --> ������
		Student st1 = new Student();
		st1.name = "��ȯ��";
		st1.number = "12345678";
		st1.age = 35;
		st1.javaScore = 100;
		st1.webScore = 100;
		st1.androidScore = 100;
		st1.studentAvg();
		
		System.out.println("�̸� : " + st1.name);
		System.out.println("�й� : " + st1.number);
		System.out.println("���� : " + st1.age);
		System.out.println("Java ���� : " + st1.javaScore);
		System.out.println("Web ���� : " + st1.webScore);
		System.out.println("Android ���� : " + st1.androidScore);
	
		
		Student st2 = new Student();
		st2.name = "����";
		st2.number = "20210307";
		st2.age = 21;
		st2.javaScore = 99;
		st2.webScore = 100;
		st2.androidScore = 80;
		st2.studentAvg();
		
		System.out.println();
		System.out.println("�̸� : " + st2.name);
		System.out.println("�й� : " + st2.number);
		System.out.println("���� : " + st2.age);
		System.out.println("Java ���� : " + st2.javaScore);
		System.out.println("Web ���� : " + st2.webScore);
		System.out.println("Android ���� : " + st2.androidScore);
	
		
		// st1 �� st2 �� ���� ����� �˰� �;��!
		// -> ��� ���ϴ� ���!(�޼ҵ�� ����� �ָ��!!)
		// ��� ���!
	
//		System.out.println();
//		System.out.println("��ȯ�� ��� : " + st1.studentAvg());
//		System.out.println("���� ��� : " + st2.studentAvg());
		
		st1.studentAvg();
		st2.studentAvg();
		
		
		
		
	}

//	public static int avg(int java, int web, int android) {
//		int result = (java + web + android) /3 ;
//		return result;
//		}
}
