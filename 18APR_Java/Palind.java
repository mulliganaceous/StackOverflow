package m2APR;

public class Palind {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("nitdin");
		sb.reverse(); // reversed sb
		String rev = sb.toString(); // rev is reversed sb to String
		sb.reverse(); // unreversed sb
		
		System.out.println(rev);
		
		System.out.println(sb);
		System.out.println(rev);
		if (sb.toString().equals(rev)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
}
