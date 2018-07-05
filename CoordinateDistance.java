import java.util.Scanner;
import java.lang.Math;
public class CoordinateDistance
{
	public static void main(String[] args)
	{
	 System.out.println("Enter the co-ordinate point (x,y) ");
	 Scanner sc =new Scanner(System.in);
	 float x=Float.valueOf(sc.next());
	 float y=Float.valueOf(sc.next());
	 float ans = x*x + y*y ;
	 System.out.println("Distance of (" + x + "," + y + ") is " + Math.sqrt(ans) );
	}
	
	
}