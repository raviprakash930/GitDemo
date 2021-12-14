
public class Construct {

	static
	{
		System.out.println("static block");
	}
	public static void main(String[] args) {
		
		//constructor is mainly used for intialize the instance variable
		
		Constructparent c=new Constructparent(10,"Ravi",30.8);
        System.out.println(c.a);
        System.out.println(c.b);
        System.out.println(c.d);
        
        
	}

}





















































