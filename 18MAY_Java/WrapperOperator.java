package m2MAY;

import java.util.ArrayList;
import java.util.Comparator;

public class WrapperOperator {
	class Grade implements Comparable<Grade> {
		public int compareTo(Grade oth) {
			// TODO Auto-generated method stub
			return 0;
		}
	}
	
	class Rank implements Comparator<Rank> {
		public int compare(Rank arg0, Rank arg1) {
			// TODO Auto-generated method stub
			return 0;
		}
	}
	
	public static void main(String[] args) {
		Integer a = 15;
		Integer b = 0;
		Double x = 7.5;
		Double y = 15.000000000000000000000000001; // Decimal part discarded
		Character ch = 'A';
		
		System.out.println(x + " < " + a + " is " + (x < a));
		System.out.println(x + " < " + b + " is " + (x < b));
		System.out.println(a + " > " + b + " is " + (a > b));

		System.out.println(ch + " <= " + 65 + " is " + (ch <= 64)); // 'A' has ASCII code 65
		System.out.println(ch + " <= " + 65 + " is " + (ch <= 65));
		System.out.println(a + " >= " + b + " is " + (a >= b));
		
		ArrayList<Integer> vector = new ArrayList<Integer>();
		vector.add(1); // int literal '1' is boxed to an Integer
		int n = vector.get(0); // The returned value, otherwise an Integer, unboxed to int.
		System.out.println(n);
	}
}
