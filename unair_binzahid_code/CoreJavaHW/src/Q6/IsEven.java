package Q6;

public class IsEven {

	public static void main(String[] args) {
		
		int number = 5;							//chosen test number
		if((number & 1) == 0){	//bitwise and operator used to compare whether a 0 will be achieved
		    System.out.println("Even number"); //if the number and bitwise and result in 0, syso even
		}
		if((number & 1) != 0){ //if result is not 0, syso not even
		    System.out.println("Not good");
		}

	}

}
