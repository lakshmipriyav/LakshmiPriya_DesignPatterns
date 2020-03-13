package creationaldesignpatterns;

public class BuilderAccess {
public Choclate getChoco(String s)
{
	if(s.equals("Bournville"))
	{
		return new Bournville();
	}
	if(s.equals("Dairymilk"))
	{
		return new Dairymilk();
	}
	else {
		return null;
	}
	
}
}
