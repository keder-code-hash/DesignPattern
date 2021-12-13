package in.design_patt.prototype;

public class Student implements Prototype{
	private static int idGen=0;
	private int id;
	public String name;
	private String dept;
	
	public Student(String name, String dept) { 
		this.id = ++idGen;
		this.name = name;
		this.dept = dept;
	}

	@Override
	public Prototype getClone() {
		return new Student(name, dept);
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", dept=" + dept + "]";
	}
}
