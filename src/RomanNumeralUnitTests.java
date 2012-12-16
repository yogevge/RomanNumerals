import static org.junit.Assert.*;

import org.junit.Test;


public class RomanNumeralUnitTests 
{

	private RomanNumerals number = new RomanNumerals();

	@Test
	public void return1to3Itests() 
	{
		assertEquals("I", number.toRoman(1));
		assertEquals("II", number.toRoman(2));
		assertEquals("III", number.toRoman(3));

	}
	@Test
	public void return4to8Vtests() 
	{
		assertEquals("IV", number.toRoman(4));
		assertEquals("V", number.toRoman(5));
		assertEquals("VI", number.toRoman(6));
		assertEquals("VII", number.toRoman(7));
		assertEquals("VIII", number.toRoman(8));
	}

}