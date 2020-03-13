package designpatterns;

public class Factoraccessing {
	public Counting  getSet(String s)
	{
		if(s.equals("vijayawadaarea"))
		{
			return new vijayawadaarea();
			
		}
		else if(s.equals("gunturarea"))
		{
			return new gunturarea();
			
		}
		else if(s.equals("vizagarea"))
		{
			return new vizagarea();
			
		}
		else
		{
			return null;
		}
		
	}

}
