// methods are block of code performing same action when runs
// only when it is called!

 // why methods important in java?
 // because we write once the method but we use it many times;
// time save
//duplicate code reduces

// there are two types of methods in java!
// 1)user-defind methods: which are defined by users
// 2)standard library methods: predefined library method in java

//  How to call a method in java

// to call a method in java, we have to write the method's
// name followed by two parentheses() and a simclon;


import java.util.Scanner;

import javax.swing.plaf.synth.SynthPasswordFieldUI;

class algebra{

    algebra(){
        System.out.println("Constructor of algrbra called");
    }

    int add(int a, int b){
        int sum= a+b;
        return sum;
    }
}


public class methods1 {
    public static void main(String[] args) {
        algebra obj= new algebra();
        
        Scanner sj= new Scanner(System.in);

        System.out.println("enter the value of a");
        int a= sj.nextInt();

        System.out.println("enter the value of b");
        int b= sj.nextInt();

        System.out.println("the sum is:" );
        int sum=obj.add(a,b);
        System.out.println(sum);



        System.out.println(Math.sqrt(24));
        System.out.println(Math.sqrt(36));

        System.out.println(Math.floor(24.8));
        System.out.println(Math.floor(81.6));

        
        System.out.println(Math.ceil(24.2));
        System.out.println(Math.ceil(2.2));
        

    }
    
}



// special method used to initialize objects.
// constructor name is same as class name.
// there is no return type of constructor.