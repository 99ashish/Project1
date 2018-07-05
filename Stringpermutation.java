import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;
public class StringPermutation
{
	static ArrayList<String> recursiveStirng = new ArrayList<String>();
	public static String swap(String str, int strtPos ,int endPos)
	{
	char[] ch =str.toCharArray();
     char tmp=ch[strtPos];
	 ch[strtPos]=ch[endPos];
	 ch[endPos]=tmp;
	 return String.valueOf(ch);
	}
	public static void recursivePermutaion(String tmpString , int strt, int len)
	{
	if(strt==len)
	{
		recursiveStirng.add(tmpString);
		return;
	}
	for(int i=strt;i<len;i++)
	{
	tmpString = swap(tmpString,i,strt);
	recursivePermutaion(tmpString,strt+1,len);
	tmpString= swap(tmpString,i,strt);
	}
	}
	public static ArrayList<String> recursive(String tmpString , int strt, int len)
	{
	  recursivePermutaion(tmpString , strt , len);	
	  return recursiveStirng;
	}
	public static void main(String[] args)
	{
	 System.out.println("Enter the String ");
	 Scanner sc =new Scanner(System.in);
	 String originalString = sc.next();
	 recursive(originalString , 0 , originalString.length());
	 System.out.println("Permutaion string of "+ originalString);
	 for(int i=0; i<recursiveStirng.size();i++)
		 System.out.println(recursiveStirng.get(i));
	}
	
	
}