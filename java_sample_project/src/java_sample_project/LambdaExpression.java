package java_sample_project;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpression {

	public static void main(String[] args) {
		List<String> name=new ArrayList<String>();
		name.add("Alok");
		name.add("Sonu");
		name.add("Babu");
		name.forEach(eachName->System.out.println(eachName));
		

	}

}
