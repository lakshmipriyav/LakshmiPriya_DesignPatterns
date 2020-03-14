  
import java.util.Scanner;

public class Strategypattern {
public static void main(String args[])
{Scanner sc=new Scanner(System.in);
System.out.println("Enter the values of a and b");
int a1=sc.nextInt();
int b1=sc.nextInt();

	Afactor a = new Afactor(new Addition());		
    a.accessing(a1,b1);
    Afactor a2 = new Afactor(new Mul());
    a2.accessing(a1,b1);
    Afactor a3 = new Afactor(new Mod());		
    a3.accessing(a1,b1);
    Afactor a4 = new Afactor(new pow());		
    a4.accessing(a1,b1);
    Afactor a5 = new Afactor(new Div());		
    a5.accessing(a1,b1);
   
    sc.close();
	
}
}