package wf;

public class missingNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a []= {0,1,2,4,5,6,7,8,9,10};
		int sum =0;
		
		for(int i=0; i<a.length; i++) {
			sum = sum+a[i];
		}
		System.out.println(sum);
	
	 
	    int sum1 = 0;
	    for(int j = 0; j<=10; j++) {
	    	sum1 = sum1+j;
	    }
	    
	    System.out.println(sum1);
	  
	    System.out.println(sum1-sum);

     }  
  }


	