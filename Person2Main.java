import java.util.ArrayList;

public class Person2Main {
	public static void main(String[] args) {
	
		// Person() : ������
		// Ŭ������ŭ�� ������ ��ü(p1)�� �Ҵ����ش�!!
		
		
		Person2 p1 = new Person2("��ȯ", 20, 173, 70);
		// p1�� ���� ��ȯ�� '��¥��'���� �����ϰ� �ͽ��ϴ�!
		
		p1.setName("��¥��");
		System.out.println("�̸� : " + p1.getName());
		
//		p1.name = "��ȯ";
//		p1.age = 20;
//		p1.tall = 173;
//		p1.weight = 70;
		// ��¥�� ������ ������ �����͸� �־��ٰ�
		// ������ ��������鼭 �����͵� ���� ������ ���� �� ���ڴ�!
//		System.out.println("�̸� : " + p1.name);
		// ���� ��ü
		Person2 p2 = new Person2();
		p2.setName("����");
		System.out.println("�̸� 2 : " + p2.getName());
		
		// ���ܿ� ���� ��ü�� �ϼ��� �ּ���! --> ������ �ʵ尪�� �����͸� ���� �־��ּ���!
		
		p2.setAge(25);
		p2.setTall(180);
		p2.setWeight(60);
		System.out.println("���� 2 : " + p2.getAge());
		System.out.println("Ű  2 : " + p2.getTall());
		System.out.println("������ 2 : " + p2.getWeight());
		p2.getData();
		
		
		// p1 - ��ȯ��
		// p2 - ����
		// p3 - ��� ������ ��ü�� ����� �;��!
		Person2 p3 = new Person2("������", 30, 175, 60);
		
		// p4 ��� ���ν� ��ü�� ����� �;��
		Person2 p4 = new Person2("���ν�", 21, 160, 40);
		
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
		
		// �����͸� �ѹ��� �ٷ� �� �ִ� ���! -> �迭
		// (��ü) �迭 ����
		// ������ Ÿ��[] �迭�� = new ������Ÿ��[3];
		
		Person2[] pArray = new Person2[4];
		
		pArray[0] = p1;
		pArray[1] = p2;
		pArray[2] = p3;
		pArray[3] = p4;
		
		// pArray �� ����ؼ� ��ȯ���� Ű�� ��� ��Ű�� �;��!
		// pArray[0] ==> p1
		p1.getTall();
		pArray[0].getTall();
		System.out.println("��ȯ�� Ű : " + pArray[0].getTall());

		// pArray �� ����ؼ� ������ ���̸� ���!
		pArray[1].getAge();
		System.out.println("���� ���� : " + pArray[1].getAge());
		
		// pArray �� ����ؼ� �����Ե��� ��� ���̸� ��� �����ּ���!
		pArray[0].getAge(); // 20 
		pArray[1].getAge(); // 25
		pArray[2].getAge(); // 30
		pArray[3].getAge(); // 21
		
		
		// System.out.println((pArray[0].getAge() + pArray[1].getAge() + pArray[2].getAge() + pArray[3].getAge()) /4);
		
		int sum = 0;
		for(int i = 0; i < pArray.length; i++) {
			sum += pArray[i].getAge();
		}
		System.out.println("���� ��� : " + sum / pArray.length);
		
		// �����Ե��� �̸��� ���� ������ּ���!
		
		for(int i = 0; i < pArray.length; i++) {
			System.out.println(pArray[i].getName());
		}
		
		// ��ȯ��, ����, ������, ���ν� --pArray
		// �ڿ��� --> pArray �� �߰� �ϰ� �ͽ��ϴ�!!
		
		// �迭�� �Ѱ� : �̹� ũ�⸦ ������ ������ �����͸� �߰��ϰų� �迭�� ũ�⸦ �ٲ� �� ����!
		// �迭�� �Ѱ踦 �پ� �Ѵ� �迭 : ArrayList
		// �����Ե��� ��ü�� ���� �� �ִ� ArrayList
		
		ArrayList<Person2> pArrayList = new ArrayList<Person2>();
		pArrayList.add(p1);
		pArrayList.add(p2);
		pArrayList.add(p3);
		pArrayList.add(p4);
		
		// ��Ȳ�ܿ� ���� ������ ����ϰ� �;��!
		// �̸�: ��ȯ
		// ���� : 20
		// Ű: 173
		// ������ : 70
		// ��ü ArrayList
		
		System.out.println("�̸� : " + pArrayList.get(0).getName());
		System.out.println("���� : " + pArrayList.get(1).getAge());
		System.out.println("Ű : " + pArrayList.get(2).getTall());
		System.out.println("������ : " + pArrayList.get(3).getWeight());
		
		// pArrayList �� ����ؼ� �����Ե鿡 ���� ������ ���� ��½����ּ���!
		// for�� ��� �ʼ�!
		
		for(int i = 0; i < pArrayList.size(); i++) {
			System.out.println("�̸� : " + pArrayList.get(i).getName());
			System.out.println("���� : " + pArrayList.get(i).getAge());
			System.out.println("Ű : " + pArrayList.get(i).getTall());
			System.out.println("������ : " + pArrayList.get(i).getWeight());
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
	}
		
		
	
}
