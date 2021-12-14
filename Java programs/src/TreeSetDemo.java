import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet t=new TreeSet(new Mycomparator());
		
		t.add("R");
		//t.add(1);
		t.add("S");
		t.add("K");
		t.add("J");
		System.out.println(t);

	}

}
