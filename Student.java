	public class Student {

	// �л��̶�??
	
	// �̸�
	String name;
	// �й�
	String number;
	// ����
	int age;
	//Java ����
	int javaScore;
	// Web ����
	int webScore;
	// Android ����
	int androidScore;
	
	
	// ��� ���ϴ� ���
	// �ٸ� Ŭ�������� �޼ҵ带 ���鶧 static �� ���� �������� �ʾƵ� �ȴ�!
	public void studentAvg() {
		
		// ��±��� ���� ���ְ� �;��		
		// javaScore webScore androidScore
		int result = (javaScore + webScore + androidScore) /3 ;
		System.out.println("��� : " + result);
		}
		

	
}
