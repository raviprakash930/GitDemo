import java.util.TreeSet;

public class ComparableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee("Ravi", 1);
		Employee e2 = new Employee("Prakash", 2);
		Employee e3 = new Employee("Sang", 3);
		Employee e4 = new Employee("Geetha", 4);
		Employee e5 = new Employee("jarabandi", 5);
		TreeSet<Employee> t = new TreeSet<Employee>();
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.add(e5);
		System.out.println(t);
	}

}
