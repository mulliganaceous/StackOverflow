package m2APR;

public class CountCode {
	public static int countCode(String str) {
		int count = 0;
		String result = "";
		boolean yes = true;
		for (int i = 0; i < str.length() - 3; i++) {
			char c1 = str.charAt(i);
			char c2 = str.charAt(i + 1);
			char c4 = str.charAt(i + 3);
			
			if (c1 == 'c' && c2 == 'o' && c4 == 'e')
				count++;
		}
		return (count);
	}
	
	public static void main(String[] args) {
		String s1 = "aaacodebbb";
		String s2 = "codexxcode";
		String s3 = "xxcozeyycop";
		String s = s3;
		System.err.printf("%d %s\n", countCode(s), s);
	}
}
