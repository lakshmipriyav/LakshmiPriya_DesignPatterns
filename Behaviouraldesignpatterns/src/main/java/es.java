
public class es implements State {
	public void action( Aclass a) {
	      System.out.println("End state ");
	      a.setState(this);	
	   }

	   public String toString(){
	      return " in the End State";
	   }
}