package kr.ac.kookmin.lab02;

public class Pet extends Animal {
	
	private String name;
	private int age;
	private double weight;
	
	public String toString() {
		return ("Name : " + name + " Age : " + age + " years" + "\nWeight : " + weight + " pounds");
	}
	
	public Pet(String initialName, int initialAge, double initialWeight, String iniGender) {
		this.name = initialName;
		this.age = initialAge;
		this.weight = initialWeight;
		this.gender = iniGender;
	}
	
	public Pet(String initialName) {
		name = initialName;
		age = 0;
		weight = 0;
	}
	
	public Pet(int initialAge) {
		name = "No name yet.";
		weight = 0;
		if(initialAge < 0) {
			System.out.println("Error : Negative age.");
			System.exit(0);
		} else
			age = initialAge;
	}
	
	public Pet() {
		name = "No name yet.";
		age = 0;
		weight = 0;
	}
	
	public void set(String newName, int newAge, double newWeight) {
		this.name = newName;
		this.age = newAge;
		this.weight = newWeight;
	}
	
	public void setAge(int newAge) {
		this.age = newAge;
	}
	
	public void setWeight(double newWeight) {
		this.weight = newWeight;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public double getWeight() {
		return weight;
	}
}