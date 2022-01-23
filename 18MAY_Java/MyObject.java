package m2MAY;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyObject implements Comparator<MyObject> {
	private String name;
	public MyObject(String name) {
		this.name = name;
	}
	
	@Override
	public int compare(MyObject o1, MyObject o2) {
		return o1.name.length() - o2.name.length();
	}
	
	public static void main(String[] args) {
		ArrayList<MyObject> list = new ArrayList<MyObject>();
		list.add(new MyObject("Mulligan"));
		list.add(new MyObject("Samaria"));
		list.add(new MyObject("Ijsbrand"));
		list.add(new MyObject("Tjeerd"));
		list.add(new MyObject("Tr00"));
		
		Collections.sort(list);
	}
}
