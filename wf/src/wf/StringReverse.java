package wf;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "selenium";
		
		 int len = s.length();
		 String rev =" ";
		 
		 for(int i=len-1;i>=0;i--) {
			 rev = rev+ s.charAt(i);
			 
			 
			 
		 }
		 System.out.println(rev);
		 

	


// 2nd method 

       StringBuffer sf = new StringBuffer(s);
       System.out.println(sf.reverse());
	 
	}
}
  
  