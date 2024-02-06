import java.io.*;
import java.util.Scanner;
public class printwriter {
    public static void main(String[] args) 
    throws Exception {

Scanner sj = new Scanner("Dummy context");
Scanner sj1 = new Scanner(new File("lcm.java"));
while(sj.hasNext()){
    System.out.println(sj.next());
}
while(sj1.hasNext()){
    System.out.println(sj1.nextLine());
    }
}
}



//     try {
//         PrintWriter pw= new PrintWriter(new File("target,txt"));
//         pw.print("Hi");
//         pw.flush();
//         pw.close();
//     }
//     catch(Exception e)
// {
//     System.out.println(e);
// }   
// } 
// }
	
// 	public static void main(String args[]) throws FileNotFoundException
// 	{

// 	PrintWriter pw= new PrintWriter(new File("deep.txt"));
// pw.println("welcome to writing to file");

// pw.println(23);
// pw.println(5.5);
// pw.println("welcome here");
// pw.flush();

// pw.close();
// }
// }