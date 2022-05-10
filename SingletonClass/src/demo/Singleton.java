package demo;

public class Singleton {

	public static void main(String[] args) {
		Abc obj1 = Abc.getInstance();
	}

}




class Abc
{
	
	static Abc obj = new Abc();
	
	//private constructor so that a new instance of a class can not be created
	private Abc() {
		
	}
	
	
	//method to return only one instance of the class 
	public static Abc getInstance() {
		System.out.println("Returning single instance of the object Abc");
		return obj; 
	}
}
