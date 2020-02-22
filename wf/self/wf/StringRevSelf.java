package wf;

public class StringRevSelf {

	public static void main(String[] args) {

		String s = "jyoti";
		int len = s.length();

		String rev = " ";

		for (int i = len - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println(rev);

//	2nd method 
		StringBuffer Sf = new StringBuffer(s);
		
		System.out.println(Sf.reverse());

	}

}
