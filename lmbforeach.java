import java.util.*;
public class lmbforeach
{
	public static void main(String[] args) 
	{
	 ArrayList<String> list=new ArrayList<String>();  
        list.add("ABC");  
        list.add("DEF");  
        list.add("GHI");  
        list.add("JKL");  
        list.forEach(  
            (n)->System.out.print(n)  
        );  
	}
}