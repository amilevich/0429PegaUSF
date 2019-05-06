package Q18;



public class Q18ChildClass extends Q18ParentClass{
	

	@Override
	public  boolean checkUppercase(String s) {
		
			char ch;
			
				for(int i=0;i<s.length();i++)
				{
					ch=s.charAt(i);
					if(Character.isUpperCase(ch))
					{
						return true;
					}
					
				}
		
		return false;
	}

	@Override
	public String convertLowerToUpperCase(String s) {
		return s.toUpperCase();
	}

	@Override
	public int stringToInteger(String s) {
		int n=0;
		char ch;
			for(int i=0;i<s.length();i++)
			{
				ch=s.charAt(i);
				n= n+(int)ch;
	
			}
			n=n+10;
			return n;
		
	}
	

	
	
	
}
