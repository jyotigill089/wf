package wf;

import java.util.HashSet;
import java.util.Set;

public class FindDup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String names[] = { "java", "javascript", "ruby", "c", "python", "java" };

//		for(int i=0; i<names.length;i++) {
//			System.out.println(names[i]);
//		}

		Set<String> store = new HashSet<String>();
		for (String i : names) {
			if (store.add(i) == false) {
				System.out.println(i);
			}
		}

	}

}
