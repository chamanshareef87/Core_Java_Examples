package comparable.comparator;

public class Emp_v1 implements Comparable<Emp_v1>{
	
	private String name;
	private int age;
	private double salary;
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Emp_v1 [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	public Emp_v1(String name, int age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	/*
	 * used to sort objects
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(Emp_v1 o) {
		return this.getAge()-o.getAge();
	}
	
	
}
