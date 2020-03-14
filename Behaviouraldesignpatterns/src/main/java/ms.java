public class ms implements State {
	public void action( Aclass a) {
	      System.out.println("Intermediate state ");
	      a.setState(this);	
	   }

	   public String toString(){
	      return "in the Intermediate state";
	   }
}