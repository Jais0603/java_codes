// strings are interned wrt java.

public class stringobject {
    public static void main(String[] args)

    {
        // String obj1 ="Sakshi Jaiswal";

        // String obj2 ="Study in LPU";

        // String obj3 = obj1+ obj2;

        // System.out.println(obj1);

        // System.out.println(obj2);
        
        // System.out.println(obj3);

        String s1= new String();

        s1= "hello";

        String s2= new String("hello1");

        char [] arr1= {'a','g','h','r','t','y','u','e','o'};

        String s3 =new String(arr1);

        byte[] barr={65,66,67,68,69,70,71,72,73,74,75,76};

        String s4 = new String(barr);

        String s5= new String (arr1,1,3);

        String s6= new String(barr,2,5);

        System.out.println(s1);

        System.out.println(s2);

        System.out.println(s3);

        System.out.println(s4);

        System.out.println(s5);

        System.out.println(s6);

        int a=20; int b=30;

        System.out.println("hello" + " "+a+b);     // prints hello2030
        
        System.out.println("hello" + " "+(a+b));   // prints hello50

        System.out.println(arr1.length); 

        System.out.println(s3.length()); 

        // concat() : used to concatenate strings! 

        //this method creates a new object that contains the invovking string with th econtent of str appended on the end.
         
        // charAt(): used to obtain the character from the specified index from a string!

        char c1= s6.charAt(4);

        System.out.println(c1);

        String s7= "India";
       
        
        char c2[] =s7.toCharArray();
        
        
        for(int i=0; i<c2.length;i++)

        {
            if(c2[i]>=97 && c2[i]<=122)
            c2[i] += 32;
            System.out.println(s7);

        }

        char [] carr2= s3.toCharArray();

           for(char x:carr2)
        {
            System.out.print(x);
        }
        System.out.println();

        
        String s8= "Welcome to my Darkside ";
        char [] carr3 = new char[12];

        s8.getChars(4,12,carr3,0);

        System.out.println();

        for(char x:carr3)
        {
            System.out.println(x+" ");
        }


       
        
    }
}
