package Doggo;

public class doggo {

	String name;
	int age = 0;
	double weight = 0;
	
	public doggo(String Dname, int Dage, double Dweight) {
		name = Dname;
		age = Dage;
		weight = Dweight;
	}
	
	public void setName(String Dname){
		name = Dname;
	}
	
	public void setAge(int Dage){
		age = Dage;
	}

	
	public void setWeight(double Dweight){
		weight = Dweight;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age*7;
	}
	
	public double getWeight() {
		weight = weight*0.453592;
		return weight;
	}
}
