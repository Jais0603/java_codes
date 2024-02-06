

import java.io.*;
class student implements Serializable
{
    int roll_no;
    String name;
    student (int r,String s)
    {
        roll_no=r;
        name=s;
    }
}
public class IO{


	public static void main(String[] args) throws Exception
	{
		 FileInputStream fos = new FileInputStream("E:\\t.txt");
         ObjectInputStream oos = new ObjectInputStream(fos);
         student s=(student)oos.readObject(); 
         System.out.println(s.roll_no+" "+s.name);  
         oos.close();
	}
}

