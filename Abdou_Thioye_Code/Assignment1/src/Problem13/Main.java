package Problem13;

public class Main {

	public static void main(String[] args)
	{
		int bool = 1,
		    counter = 1,
		    appendTimes = 0,
		    levels = 4;
		
		
		// The first level
		String level = "0";
		System.out.println(level);
		
		
		while( counter < levels )
		{
			
			// add component to the left
			if( appendTimes == 0 )
			{
				level = bool + " " + level;
				System.out.println(level);         // print next level	
			}
			
			// add component to the right
			else
			{
				level = level + " " + bool;
				System.out.println(level);         // print next level			
			}
					
			
			// levels-completed
			counter++;
			appendTimes++;
									
			
			// Alternate Triangle Components
			if( bool == 0 && appendTimes > 1)
				bool = 1;
			else if( bool == 1 && appendTimes > 1)
				bool = 0;
								
			
			// ends
			if( appendTimes == 2 )
				appendTimes = 0;
		
					
		}
	}

}