import java.util.Scanner;

public class triangleprogram1 {
    public static void main(String[] args) {
        int a,b,c;
        System.out.println("please enter the sides of triangle");
        Scanner Sc=new Scanner(System.in);
        a=Sc.nextInt();
        b=Sc.nextInt();
        c=Sc.nextInt();
        if(a==b && b==c)
        {
            System.out.println("the triangle is an equilateral triangle");
        }
        else if (a==b || b==c|| a==c)
        {
            System.out.println("the triangle is an isosceles triangle");
        }
        else if (c==Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2)))
        {
            System.out.println("the triangle is right angled triangle");
        }
        else {
            System.out.println("the triangle is scalene triangle");
        }
    }
}
