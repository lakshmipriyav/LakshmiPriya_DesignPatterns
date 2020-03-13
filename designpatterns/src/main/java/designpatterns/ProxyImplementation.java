package designpatterns;

public class ProxyImplementation extends RealImplementation{
	public void print()
	{
		System.out.println("Hi this is a proxy class");
		super.print();
	}

}
