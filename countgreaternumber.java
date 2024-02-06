
// write a program which will count the number of elements strictly gretaer than the value x,


import java.util.Scanner;

public class countgreaternumber {

    // write a method which will return greater number than x;

    static int greaterNumber(int[] arr, int x){
        int count =0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] >x){
                count ++;

            }
        }
        return count;
    }
    public static void main(String[] args) {

        Scanner sj = new Scanner(System.in);
        System.out.println("Enter the size of aaray: ");
        int n = sj.nextInt();

        int [] arr= new int[n];

        System.out.println("Enter the elements of array: ");

        for(int i =0; i<arr.length; i++){
            arr[i] = sj.nextInt();
        }
        System.out.println("Enter value of x: ");
        int x= sj.nextInt();



        System.out.println("The number of elements greater than " + x + "is" + greaterNumber(arr, x));
    }
}
