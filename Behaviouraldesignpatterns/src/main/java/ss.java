
public class ss implements State {
public void action(Aclass a)
{
	System.out.println("Initial state is instantiated");
	a.setState(this);
}
public String toString(){
    return (" in the Initial State");
 }
}