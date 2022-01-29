import java.util.*;
public class lfbraket
{
	public static void main(String[] args) 
	{
	//how many pairs present in String of brakets in String first and last one except String .
	Scanner sc=new Scanner(System.in);
	String s=sc.next();
	String ans="";
	int count=0;
	for(int i=0;i<s.length();i++)
	{
	    if(s.charAt(i)=='(')
	    {
	        ++count;
	        if(count>1)
	        {
	            ans=ans+s.charAt(i);
	        }
	    }
	    else
	    {
	        if(count>1)
	        {
	            ans=ans+s.charAt(i);
	        }
	        --count;
	    }
	    
	    
	}
	System.out.println(ans);
}
}