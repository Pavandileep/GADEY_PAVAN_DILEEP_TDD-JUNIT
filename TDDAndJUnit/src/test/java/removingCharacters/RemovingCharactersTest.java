package removingCharacters;

import static org.junit.Assert.*;

import org.junit.Test;

public class RemovingCharactersTest {

	@Test
	public void test1() 
	{
		RemovingCharacters removingCharacters=new RemovingCharacters();
		assertEquals(removingCharacters.removeFirstTwoCharacters("ABCD"),"BCD");
	}
	
	
	@Test
	public void test2() 
	{
		RemovingCharacters removingCharacters=new RemovingCharacters();
		assertEquals(removingCharacters.removeFirstTwoCharacters("AACD"),"CD");
	}
	
	
	@Test
	public void test3() 
	{
		RemovingCharacters removingCharacters=new RemovingCharacters();
		assertEquals(removingCharacters.removeFirstTwoCharacters("BACD"),"BCD");
	}
	
	@Test
	public void test4() 
	{
		RemovingCharacters removingCharacters=new RemovingCharacters();
		assertEquals(removingCharacters.removeFirstTwoCharacters("BBAA"),"BBAA");
	}
	
	@Test
	public void test5() 
	{
		RemovingCharacters removingCharacters=new RemovingCharacters();
		assertEquals(removingCharacters.removeFirstTwoCharacters("AABAA"),"BAA");
	}
}
