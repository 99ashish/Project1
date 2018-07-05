import java.util.Scanner;
import java.lang.Math;
public class QuadraticRoot
{
	public static void main(String[] args)
	{
	 System.out.println("Enter the Cofficient a,b,c ");
	 Scanner sc =new Scanner(System.in);
	 int a=Integer.valueOf(sc.next());
	 int b=Integer.valueOf(sc.next());
	 int c=Integer.valueOf(sc.next());
	 int delta = b*b - 4*a*c;
	 if(delta<0)
		 System.out.println("Root are imaginary");
	 else
	 {
		 if(delta==0)
			System.out.println("Roots are equal and is "+ (float)(-b/(2*a))); 
		else
		{
		 float root1 = (float)((float)(-b + Math.sqrt(delta))/ (2*a));
		 float root2 = (float)((float)(-b - Math.sqrt(delta))/ (2*a));
		 System.out.println("Roots are "+ root1 + "," + root2);
		}
	 }
	}
	
	
}