
public class RomanNumerals {

	public String toRoman(int number)
	
	
	{
		String toRoman="";
		
		if(number>8)
		{
			while(number>=10)
			{
				toRoman+="X";
				number-=10;
			}
			if(number==9)
			{
				toRoman+="IX";
				number-=9;
			}
		}
		if(number>3)
		{
			while(number>=5)
			{
				toRoman+="V";
				number-=5;
			}
			if(number== 4)
			{
				toRoman+= "IV";
				number-=4;
			}

		}
		
		if (number <= 3)
		{
			for(int i=0;i<number;i++)
				toRoman+= "I";
		}
		return toRoman;
	}
		if (nmber == 1)
			return "I";
		return "II";
	}

}
