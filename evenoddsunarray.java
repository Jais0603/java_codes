//Write a program to calculate sum of all even numbers and sum of all odd numbers. 
//Numbers are entered through keyboard and stored in an array.


//import java.util.Scanner;

public class evenoddsunarray {
    public static void main(String[] args) {
        //Scanner scan= new Scanner(System.in);
        //System.out.println("enter the number of array u wanna entered: ");
        int arr[]= {78,21,96,31,45,67,88,63,46,76,89,23};
        int sum=0;
        //int odd=0
        for(int i=1; i<=arr.length; i++){
            if(i%2==0)
            sum  = sum+ arr[i];
            else
            sum = sum + arr[i];
        }
        System.out.println("the sum of even numbers is:" + " "+ sum);
        System.out.println("the sum of odd numbers is:" + " "+ sum);

    }
}
