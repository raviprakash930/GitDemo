
public class Employee implements Comparable {
	String emp;
	int id;

	Employee(String emp, int id) {
		this.emp = emp;
		this.id = id;
	}

	public String toString() {
		return emp + "--" + id;
	}

	public int compareTo(Object obj) {
		int id1 = id;
		Employee e = (Employee) obj;
		int id2 = e.id;
		if (id1 < id2) {
			return -1;
		} else if (id1 > id2) {
			return +1;
		} else {
			return 0;
		}

	}

}
