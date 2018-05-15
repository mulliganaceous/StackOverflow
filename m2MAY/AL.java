package m2MAY;

import java.util.ArrayList;

public class AL implements Comparable<AL>{
	int g;
	public AL(int x) {
		this.g = x;
	}
	
	@Override
	public int compareTo(AL o) {
		return this.g - o.g;
	}
	
	public static void main(String[] args) {
		AL al = new AL(3);
		ArrayList<AL> a = new ArrayList<AL>();
		a.sort(al);
	}

}
