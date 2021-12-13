package in.design_patt.prototype;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader; 

public class Clients {
	public static void main(String[] args) throws IOException {
		BufferedReader bReader=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("name: - ");
		String nameString=bReader.readLine();
		System.out.println("department: - ");
		String depString=bReader.readLine();
		
		Student st1=new Student(nameString, depString);
		System.out.println(st1.toString());
		
//		Student st2=new Student(st1.name, st1.dept);//error will be there for dept.
		
		Student st2=(Student)st1.getClone();
		System.out.println(st2.toString());
	}
}
