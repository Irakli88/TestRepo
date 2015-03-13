package hello;

public class Person {
	private String firstName;
	private String lastName;
	private int age;

	public Person() {
		firstName = "...";
		lastName = "...";
		age = 0;
	}

	public Person(final String fName, final String lName, final int age) {
		firstName = fName;
		lastName = lName;
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
