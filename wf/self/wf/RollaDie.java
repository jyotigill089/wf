package wf;

import java.util.Random;

public class RollaDie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		int result = 0;
		for(int i =0; i<50; i++) {
			result = r.nextInt(6);
			result++;
		}
		System.out.println(+result);
		
		

	}

}
