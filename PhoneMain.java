
public class PhoneMain {

	public static void main(String[] args) {
					
		// Ŭ������??
		// �ڷ� + ��� ����� ������ �ڷ���
		Phone lollipop = new Phone(); // ��ü ���� -> Ŭ������ �ִ� �����Ϳ� ����� ��� �� �� �ִ�!
										//* ��ƴ� �� ���� ���� *
		System.out.println("�귣�� : " + lollipop.brand);
		lollipop.Call();
		
		
		// lollipop ���� ��ȭ�� �ް� �;��!
		lollipop.Send();
		
		System.out.println("��ȭ��ȣ : " + lollipop.number);
		
		
		// ��ȣ �ٲ�, �귣�嵵 �ٲ�
		Phone magic = new Phone();
		magic.brand = "�ִ���";
		magic.number = "01098765432";
		System.out.println("�귣��2 : " + magic.brand);
		System.out.println("��ȭ ��ȣ : " + magic.number);
		
		// �������� �޴����� ��ü�� ���� ��� ���� �ּ���
		
		Phone apple = new Phone();
		apple.brand = "����";
		apple.number = "01087662341";
		System.out.println("�귣��3 : " + apple.brand);
		System.out.println("��ȭ ��ȣ : " + apple.number);
				
		
		

	}

}
