package Q13;

public class triangle {

	
		public static void main(String args[]){
			for(int i=1;i<=4;i++){ //loop within a loop, one for 1 and the other for 0
				for(int j=1;j<=i;j++){
					System.out.print(((i+j)%2)+" "); 
				} //the location of i and j loop is %2 to print out 1 and 0 and that point
				System.out.print("\n");
			}
		}
	}