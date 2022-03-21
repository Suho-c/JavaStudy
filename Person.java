
public class Person {

	// 이름
	private String name;
	// 나이
	private int age;
	// 키
	private int height;
	// 몸무게
	private int weight;
	
	// 이름을 저장할수 있는 setName()
	public void setName(String name) {
		// this 클래스 내애 있는 필드를 정확히 짚어줄때 사용하는 키워드!!
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
