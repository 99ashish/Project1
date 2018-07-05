import java.util.Scanner;
import java.lang.*;
public class StopWatch
{
	public static void main(String[] args)
	{
	 System.out.println("Enter the 1 to start stopwatch and 2 to stop the stopwatch ");
	 Scanner sc =new Scanner(System.in);
	 
	 long startTime=0,endTime=0;
	 while(true)
	 {
	 int opt=Integer.valueOf(sc.next());
	    if(opt == 1)
	    {
	     startTime = System.nanoTime();
	      break;
	    }
	 }
     while(true)
	 {
	 int opt=Integer.valueOf(sc.next());
	    if(opt == 2)
	    {
	     endTime   = System.nanoTime();
	      break;
	    }
	 }
      endTime   = System.nanoTime();
     long totalTime = endTime - startTime;
     System.out.println("Total elapsed time is " + (float)(totalTime/1000000000.0) + " second");
	}
	
	
}