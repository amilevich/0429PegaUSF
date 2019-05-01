package test1;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Q2 {
	
	
	public static void main(String args[]) {
		Q2 q = new Q2();
		
		System.out.println(q.fibonacci(6));
		
	}
	//asdadsadsadsadas
	public  int fibonacci(int n) {
		int result;
		if(n==0) {
			return 0;
		}else if(n==1) {
			return 1;
		}else {
			result = fibonacci(n-1)+fibonacci(n-2);
		}
		
		
		return result;
	}

}
