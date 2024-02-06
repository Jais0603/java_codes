import java.util.Scanner;

public class operators {
    public static void main(String[] args) {

        int a ,b , c, d, e;
        Scanner Sc=new Scanner(System.in);
        System.out.println("please enter the value of integer a b c d e");
        a= Sc.nextInt();
        b= Sc.nextInt();
        c= Sc.nextInt();
        d= Sc.nextInt();
        e= Sc.nextInt();
        int sum=a+b+c+d+e;
        System.out.println("the sum of "+a+" "+b+" "+c+" "+d+" "+e+" is" + sum);
    }
}
