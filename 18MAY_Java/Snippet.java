package m2MAY;

public class Snippet {
	private static final int[] ARRAY = { 1,2,0,3};

	// {1,2,4,5,6,8,7,9,3}
	int getMissingElem() {
		int XOR = 0;
		for (int i = 0; i < ARRAY.length; i++) {
			if (ARRAY[i] != 0)
				XOR ^= ARRAY[i];
			XOR ^= (i + 1);
		}
		return XOR;
	}

	public static void main(String[] args) {
		Snippet s = new Snippet();
		System.out.println(s.getMissingElem());
	}
}