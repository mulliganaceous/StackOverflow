package m2MAY;

public class Inh {
	public abstract class A {
	    //some fields
	    //constructor
	    //some functions
	}
	public interface B{
	    //some fields
	    //constructor
	    //override functions
	    //some new functions
	}
	public interface C{
	    //some fields
	    //constructor
	    //override functions
	    //some functions
	}
	
	public abstract class D extends A implements C,B {
		
	}
	
	public static void main(String[] args) {
		
	}
}
