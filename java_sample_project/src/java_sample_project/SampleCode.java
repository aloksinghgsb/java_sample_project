package java_sample_project;

public class SampleCode {
	
	int id;
	String name;
	public void display() {
		System.out.println(id+" "+ name);	}

	public static void main(String[] args) {
		SampleCode s1 = new SampleCode();
		SampleCode s2 = new SampleCode();
		s1.display();
		s2.display();
		

	}

}
