
public class Person {

	// �̸�
	private String name;
	// ����
	private int age;
	// Ű
	private int height;
	// ������
	private int weight;
	
	// �̸��� �����Ҽ� �ִ� setName()
	public void setName(String name) {
		// this Ŭ���� ���� �ִ� �ʵ带 ��Ȯ�� ¤���ٶ� ����ϴ� Ű����!!
		this.name = name;
	}
	public String getName() {
		return name;
		
	}
	public void setAge(int age) {
		
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public void setheight(int height) {
		
		this.height = height;
	}
	public int getheight() {
		return height;
	}
	public void setweight(int weight) {
		
		this.weight = weight;
	}
	public int getweight() {
		return weight;
	}
}
