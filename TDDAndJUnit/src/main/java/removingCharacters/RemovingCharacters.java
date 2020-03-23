package removingCharacters;

public class RemovingCharacters 
{
	public String removeFirstTwoCharacters(String input)
	{
		String result=input;
		
		if(input.charAt(0) == 'A' && input.charAt(1) == 'A')
			result=input.substring(2);
		else if(input.charAt(0) == 'A')
			result=input.substring(1);
		else if(input.charAt(1) == 'A')
			result=input.charAt(0)+input.substring(2);
			
		return result;
	}

}
