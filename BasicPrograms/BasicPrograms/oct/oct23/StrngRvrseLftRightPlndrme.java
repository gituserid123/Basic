package oct23;

public class StrngRvrseLftRightPlndrme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "GooG";
		char[] ch = new char[s.length()];
		ch = s.toCharArray();

		int left, right = 0;
		right = s.length() - 1;

		for (left = 0; left < right; left++, right--) {
			char temp = ch[left];
			ch[left] = ch[right];
			ch[right] = temp;

		}

		for (char c : ch)
			System.out.print(c);

		String output = new String(ch);

		if (output.equals(s))
			System.out.println("\nPalindrome");
		else
			System.out.println("\nnot Palindrome");
	}

}
