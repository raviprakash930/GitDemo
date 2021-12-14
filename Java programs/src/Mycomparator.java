import java.util.Comparator;

public class Mycomparator implements Comparator {

	
	public int compare(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		String s1=(String)arg0;
		String s2=(String)arg1;
		return -s1.compareTo(s2);
	}

}
