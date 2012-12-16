import static org.junit.Assert.*;

import org.junit.Test;


public class RomanNumeralUnitTests {

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
	@Test
	public void return9to39Xtests()
	{
		assertEquals("IX",number.toRoman(9));
		assertEquals("X",number.toRoman(10));
		assertEquals("XI",number.toRoman(11));
		assertEquals("XII",number.toRoman(12));
		assertEquals("XIII",number.toRoman(13));
		assertEquals("XIV",number.toRoman(14));
		assertEquals("XV",number.toRoman(15));
		assertEquals("XVI",number.toRoman(16));
		assertEquals("XVII",number.toRoman(17));
		assertEquals("XVIII",number.toRoman(18));
		assertEquals("XIX",number.toRoman(19));
		assertEquals("XX",number.toRoman(20));
		assertEquals("XXI",number.toRoman(21));
		assertEquals("XXII",number.toRoman(22));
		assertEquals("XXIII",number.toRoman(23));
		assertEquals("XXIV",number.toRoman(24));
		assertEquals("XXV",number.toRoman(25));
		assertEquals("XXVI",number.toRoman(26));
		assertEquals("XXVII",number.toRoman(27));
		assertEquals("XXVIII",number.toRoman(28));
		assertEquals("XXIX",number.toRoman(29));
		assertEquals("XXX",number.toRoman(30));
		assertEquals("XXXI",number.toRoman(31));
		assertEquals("XXXII",number.toRoman(32));
		assertEquals("XXXIII",number.toRoman(33));
		assertEquals("XXXIV",number.toRoman(34));
		assertEquals("XXXV",number.toRoman(35));
		assertEquals("XXXVI",number.toRoman(36));
		assertEquals("XXXVII",number.toRoman(37));
		assertEquals("XXXVIII",number.toRoman(38));
		assertEquals("XXXIX",number.toRoman(39));
	}
	@Test
	public void return40to49Ltests()
	{
		assertEquals("XL",number.toRoman(40));
		assertEquals("XLI",number.toRoman(41));
		assertEquals("XLII",number.toRoman(42));
		assertEquals("XLIII",number.toRoman(43));
		assertEquals("XLIV",number.toRoman(44));
		assertEquals("XLV",number.toRoman(45));
		assertEquals("XLVI",number.toRoman(46));
		assertEquals("XLVII",number.toRoman(47));
		assertEquals("XLVIII",number.toRoman(48));
		assertEquals("XLIX",number.toRoman(49));
	}
	@Test
	public void return50to89Ltests()
	{
		assertEquals("L",number.toRoman(50));
		assertEquals("LI",number.toRoman(51));
		assertEquals("LII",number.toRoman(52));
		assertEquals("LIII",number.toRoman(53));
		assertEquals("LIV",number.toRoman(54));
		assertEquals("LV",number.toRoman(55));
		assertEquals("LVI",number.toRoman(56));
		assertEquals("LVII",number.toRoman(57));
		assertEquals("LVIII",number.toRoman(58));
		assertEquals("LIX",number.toRoman(59));

		assertEquals("LX",number.toRoman(60));
		assertEquals("LXI",number.toRoman(61));
		assertEquals("LXII",number.toRoman(62));
		assertEquals("LXIII",number.toRoman(63));
		assertEquals("LXIV",number.toRoman(64));
		assertEquals("LXV",number.toRoman(65));
		assertEquals("LXVI",number.toRoman(66));
		assertEquals("LXVII",number.toRoman(67));
		assertEquals("LXVIII",number.toRoman(68));
		assertEquals("LXIX",number.toRoman(69));

		assertEquals("LXX",number.toRoman(70));
		assertEquals("LXXI",number.toRoman(71));
		assertEquals("LXXII",number.toRoman(72));
		assertEquals("LXXIII",number.toRoman(73));
		assertEquals("LXXIV",number.toRoman(74));
		assertEquals("LXXV",number.toRoman(75));
		assertEquals("LXXVI",number.toRoman(76));
		assertEquals("LXXVII",number.toRoman(77));
		assertEquals("LXXVIII",number.toRoman(78));
		assertEquals("LXXIX",number.toRoman(79));

		assertEquals("LXXX",number.toRoman(80));
		assertEquals("LXXXI",number.toRoman(81));
		assertEquals("LXXXII",number.toRoman(82));
		assertEquals("LXXXIII",number.toRoman(83));
		assertEquals("LXXXIV",number.toRoman(84));
		assertEquals("LXXXV",number.toRoman(85));
		assertEquals("LXXXVI",number.toRoman(86));
		assertEquals("LXXXVII",number.toRoman(87));
		assertEquals("LXXXVIII",number.toRoman(88));
		assertEquals("LXXXIX",number.toRoman(89));

	}

	@Test
	public void return90to190Ctests()
	{

		assertEquals("XC",number.toRoman(90));
		assertEquals("XCI",number.toRoman(91));
		assertEquals("XCII",number.toRoman(92));
		assertEquals("XCIII",number.toRoman(93));
		assertEquals("XCIV",number.toRoman(94));
		assertEquals("XCV",number.toRoman(95));
		assertEquals("XCVI",number.toRoman(96));
		assertEquals("XCVII",number.toRoman(97));
		assertEquals("XCVIII",number.toRoman(98));
		assertEquals("XCIX",number.toRoman(99));
		assertEquals("C",number.toRoman(100));

		assertEquals("CXC",number.toRoman(190));
	}
	@Test
	public void return400to499Dtests()
	{
		assertEquals("CD",number.toRoman(400));
		assertEquals("CDXLII",number.toRoman(442));
		assertEquals("CDXXXVII",number.toRoman(437));
		assertEquals("CDLXXXVIII",number.toRoman(488));
		assertEquals("CDLXXXIX",number.toRoman(489));
		assertEquals("CDXCI",number.toRoman(491));
		assertEquals("CDXCIX",number.toRoman(499));
		assertEquals("CDXCIV",number.toRoman(494));

	}
	@Test
	public void return500to890Dtests()
	{
		assertEquals("D",number.toRoman(500));
		assertEquals("DI",number.toRoman(501));
		assertEquals("DL",number.toRoman(550));
		assertEquals("DXXX",number.toRoman(530));
		assertEquals("DCCVII",number.toRoman(707));
		assertEquals("DCCCXC",number.toRoman(890));

	}

	@Test
	public void returnMoreThan900Mtests()
	{
		assertEquals("CM",number.toRoman(900));
		assertEquals("CMXCVIII",number.toRoman(998));
		assertEquals("MDCCXII",number.toRoman(1712));
		assertEquals("MCMXC",number.toRoman(1990));
		assertEquals("MCMXCI",number.toRoman(1991));
		assertEquals("MCMXCII",number.toRoman(1992));
		assertEquals("MCMXCIII",number.toRoman(1993));
		assertEquals("MCMXCIV",number.toRoman(1994));
		assertEquals("MCMXCV",number.toRoman(1995));
		assertEquals("MCMXCVI",number.toRoman(1996));
		assertEquals("MCMXCVII",number.toRoman(1997));
		assertEquals("MCMXCVIII",number.toRoman(1998));
		assertEquals("MCMXCIX",number.toRoman(1999));
		assertEquals("MM",number.toRoman(2000));
		assertEquals("MMI",number.toRoman(2001));
		assertEquals("MMII",number.toRoman(2002));
		assertEquals("MMIII",number.toRoman(2003));
		assertEquals("MMIV",number.toRoman(2004));
		assertEquals("MMV",number.toRoman(2005));
		assertEquals("MMVI",number.toRoman(2006));
		assertEquals("MMVII",number.toRoman(2007));
		assertEquals("MMVIII",number.toRoman(2008));
		assertEquals("MMIX",number.toRoman(2009));
		assertEquals("MMX",number.toRoman(2010));
		assertEquals("MMXI",number.toRoman(2011));
		assertEquals("MMXII",number.toRoman(2012));
		assertEquals("MMXIII",number.toRoman(2013));
		assertEquals("MMXIV",number.toRoman(2014));
		assertEquals("MMXV",number.toRoman(2015));
		assertEquals("MMXVI",number.toRoman(2016));
		assertEquals("MD",number.toRoman(1500));
		assertEquals("MDCCC",number.toRoman(1800));
		assertEquals("MMCMXCIX",number.toRoman(2999));
		assertEquals("MMM",number.toRoman(3000));
		assertEquals("MMCMXLIX",number.toRoman(2949));
		assertEquals("MMDXLIX",number.toRoman(2549));
		assertEquals("MMCDXLIX",number.toRoman(2449));
	}

}