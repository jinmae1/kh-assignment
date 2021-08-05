package ncs.test2;

public class Test02 {
	public static void main(String[] args) {

		final int gap = 'a' - 'A';
		char[] str = new char[args[0].length()];

		for (int i = 0; i < args[0].length(); i++) {
			str[i] = args[0].charAt(i);
		}

		for (int i = 0; i < str.length; i++) {
			if ('a' <= str[i] && str[i] <= 'z') {
				str[i] -= gap;
			}
		}

		char temp;
		for (int i = 0; i < str.length / 2; i++) {
			temp = str[i];
			str[i] = str[str.length - i - 1];
			str[str.length - i - 1] = temp;
		}

		for (char c : str) {
			System.out.printf("%s", c);
		}

	}

}