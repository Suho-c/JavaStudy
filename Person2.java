
public class Person2 {

	// �̸�
	private String name;
	// ����
	private int age;
	// Ű
	private int tall;
	// ������
	private int weight;
	
//	public Person2() { =====> defalut ������! (������ ������ ����)
//									  Ŭ������ ���� �� �ڵ����� ����� ���� �༮
//									  ���ο� �����ڸ� ����� �ִ� ���� ������!
//									  ���ο� �����ڸ� ����ڿ� ����ϰ� �ʹٸ� ����� ���Ƿ� ����� ��� �Ѵ�!		
//	}
	
	
	// ������(Ư���� �޼ҵ��!) ---> Ŭ���� ��ŭ�� ������ �Ҵ��Ѵ�!
	/* 1. �޼ҵ� �̸��� ������! Ŭ���� �̸��� ���ƾ� �Ѵ�. -> Person2 �̶�� �ϴ� �޼ҵ带 ����
	 * 2. ��ȯ Ÿ���� ����!! ���� ��ü�� ���� �ʴ´�!
	 */
	
	
	// �����͸� �޴� ���ο� ������ ����!!
	// ������ --> Ư���� �޼ҵ��!(������ü�� ���� ������!)
	// ������ �����ε�!!!

		
	public Person2(String name, int age, int tall, int weight) {
		super();
		this.name = name;
		this.age = age;
		this.tall = tall;
		this.weight = weight;
	}
	// ������ �����ε��� �ϴ� ���� ������ �ִ� ����Ʈ �����ڴ� ����� �� ����.
	
	public Person2() {
		
	}
	// �����͸� �޾Ƽ� name �̶�� �ʵ尪�� �����Ű�� ����� ��!
	


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
