package problem6;

public class EvennoMod {
static boolean isEven(int n)
{
	boolean isEven = true;
	
	for (int i = 1; i <= n; i++)
		isEven=!isEven;
	
	return isEven;

}
public static void main(String[] args) {
	int n = 101;
	if(isEven(n))
		System.out.println("Even");
	else
		System.out.println("Odd");
		
}
}
