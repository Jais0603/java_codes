import javax.swing.plaf.synth.SynthPasswordFieldUI;

class algebra{
    // int a= 10; // member varibales , they can be accessed anywhere because they are class level scope.

    // int b =8;
    int add(){
        int p=10; // here p and q are method level scope which are only accessed in the method and not outside the method.
        int q=7;
        return p+q;
        
    }

    int sub(){
        int p=234;
        int q= 67;
        return p-q;
    }

//  void demo(){

//         int a=10;   // this is block level scope which can only be accessed in this block.

//         System.out.println(a);
//         for(int i=0; i<5; i++)
//         {
//             int b=20; // block level scope , here b can't be accessed outside this block.

//             System.out.println(b);
//         }

//         for(int i=0; i<2; i++)
//         {
//         int b=100;
//         System.out.println(b); 
//         }
//     }
}


public class call_method {
    
   static void changeValue(int a){
        a *=100;


        System.out.println("Inside    change value" + a);
    }
public static void main(String[] args) {
//    algebra obj = new algebra();
//    obj.demo();

    int a=10;
    System.out.println("Before changing value" + a);
    changeValue(a);
    System.out.println("After changing value"+ a);

}
     
}


// constructor are special types of methods which are used to intilize a object
// constructors are of two types paratemetrized and default


// scope of varible--- region from where avariable can be accessed.
// in same scope 2 variables name can't be same 
// but in different scope it can be same.
// there are three level of scope 
// 1) class level scope ---- can be accessed anywhere
// 2) block level scope
// 3) method level scope  --- decleared inside the method and cannot be accessed outside the method.
 
