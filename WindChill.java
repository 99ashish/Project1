import java.util.Scanner;
import java.lang.Math;
public class WindChill
{
	public static void main(String[] args)
	{
	 System.out.println("Enter the value of temprature t and wind speed v ");
	 Scanner sc =new Scanner(System.in);
	 float t=Integer.valueOf(sc.next());
	 float v=Integer.valueOf(sc.next());
	 float ans = (float)(35.74 + 0.6215*t + (((0.4275*t)-35.75)*Math.pow(v,0.16))) ;
	 System.out.println("Effective temprature is " + ans );
	}
	
	
}