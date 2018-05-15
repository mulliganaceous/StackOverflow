package m2MAY;

public class ObjectMethod {
	public static void method(Object obj) {
		if (obj instanceof String)
			System.out.println("I am a String!");
		if (obj instanceof Integer)
			System.out.println("I am an Integer!");
		System.out.println(obj.getClass());
	}
	
	public static void main(String[] args) {
		method("ABC");
	}
}
