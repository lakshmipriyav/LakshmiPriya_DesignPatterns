package creationaldesignpatterns;

public class BuilderPattern {
	public static void main(String[] args)
	{
		Choclate c1=new BuilderAccess().getChoco("Bournville");
		System.out.println(c1.pack()+" "+c1.price());

		Choclate c2=new BuilderAccess().getChoco("Dairymilk");
		System.out.println(c2.pack()+" "+c2.price());
	}
}
