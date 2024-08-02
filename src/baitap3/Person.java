package baitap3;

public class Person {
	protected String name;
	protected int age;
	protected String adddress;

	public Person() {
	}

	public Person(String name, int age, String address) {
		this.setName(name);
		this.setAge(age);
		this.setAdddress(address);
	}

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

	public String getAdddress() {
		return adddress;
	}

	public void setAdddress(String adddress) {
		this.adddress = adddress;
	}

	public void displayInfo(String person) {
		String str = "Person";
		if (person != null) {
			str = person;
		}
		System.out.printf("------ %s Info ------%n", str);
		System.out.printf("%-18s: %s%n", "Name", this.getName());
		System.out.printf("%-18s: %d%n", "Age", this.getAge());
		System.out.printf("%-18s: %s%n", "Address", this.getAdddress());
	}

}
