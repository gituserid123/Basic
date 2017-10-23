package oct23;

public class StrngRvrseWithMthdThree {

	static void StringRvrse(String s) {
		char[] ch = new char[s.length()];
		ch = s.toCharArray();

		for (int i = 0; i < s.length() - 1; i++)
			ch[i] = s.charAt(i);

		for (int i = s.length() - 1; i >= 0; i--)
			System.out.print(ch[i]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "jhoom";
		
		System.out.println("Initial String is: "+s);
		System.out.print("Reversed String is: ");
		StrngRvrseWithMthdThree.StringRvrse(s);
	}

}
