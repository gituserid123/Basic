package oct23;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class StrngRvrseCollcnTwo {

	public static void main(String[] args) {
		String s = "gpp";

		char[] ch = new char[s.length()];
		ch = s.toCharArray();

		List<Character> li = new LinkedList<>();
		for (char c : ch)
			li.add(c);
		Collections.reverse(li);

		ListIterator il = li.listIterator();
		while (il.hasNext())
			System.out.print(il.next());

	}
}
