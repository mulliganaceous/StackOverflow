package m2APR;

public class ArrayParser {
	public static String[] parseArray(String arrayLit) {
		int size = sizeArray(arrayLit);
		if (size < 0)
			return null;
		
		String[] intArray = new String[size];
		String intlit = "";
		int index = 0;
		
		char ch;
		char state = '[';
		for (int k = 0; k < arrayLit.length(); k++) {
			ch = arrayLit.charAt(k);
			
			/* FSM Test Cases */
			/* Regex: [(.,)*.] */
			switch (state) {
			case '[': // Opening bracket
				if (ch == '[') {
					state = 'A';
				}
				else
					state = 99;
				break;
			case 'A': // Main body, can either be text, comma, or closing
				if (ch == ']') // End
					state = ']';
				else if (ch != ',') { // Beginning of body
					size++;
					intlit += ch;
					state = 'B';
				}
				else
					state = 99;
				break;
			case 'B': // Main body,
				if (ch == ',') {
					intArray[index] = intlit;
					index++;
					intlit = "";
					state = ',';
				}
				else if (ch == ']') {
					intArray[index] = intlit;
					index++;
					intlit = "";
					state = ']';
				}
				else {
					intlit += ch;
					state = 'B';
				}
				break;
			case ',': // Comma, must be followed by main body
				if (ch == ']')
					state = 99;
				else if (ch != ',') {
					size++;
					intlit += ch;
					state = 'B';
				}
				else
					state = 99;
				break;
			default:
				return null;
			}
		}
		return intArray;
	}
	
	public static int sizeArray(String arrayLit) {
		int size = 0;
		char ch;
		char state = '[';
		for (int k = 0; k < arrayLit.length(); k++) {
			ch = arrayLit.charAt(k);
			
			/* FSM Test Cases */
			/* Regex: [(.,)*.] */
			switch (state) {
			case '[': // Opening bracket
				if (ch == '[') {
					state = 'A';
				}
				else
					state = 99;
				break;
			case 'A': // Main body, can either be text, comma, or closing
				if (ch == ']') // End
					state = ']';
				else if (ch != ',') { // Beginning of body
					size++;
					state = 'B';
				}
				else
					state = 99;
				break;
			case 'B': // Main body,
				if (ch == ',')
					state = ',';
				else if (ch == ']')
					state = ']';
				else
					state = 'B';
				break;
			case ',': // Comma, must be followed by main body
				if (ch == ']')
					state = 99;
				else if (ch != ',') {
					size++;
					state = 'B';
				}
				else
					state = 99;
				break;
			default:
				return -1;
			}
		}
		if (state != ']') return -1;
		return size;
	}
	
	public static String literal(String[] array) {
		if (array == null)
			return null;
		String str = "";
		str += '[';
		for (int k = 0; k < array.length; k++) {
			str += array[k];
			if (k < array.length - 1)
				str += ',';
		}
		str += ']';
		return str;
	}
}