import java.util.Scanner;

public class arrayclass {
    public static void main(String[] ag)
     {
        // for(int i=0; i<ag.length; i++){
        //    System.out.println(ag[i]);
    
        // }
        
        // int[] arr = new int[10];
        // for(int i=0; i<arr.length; i++)
        // arr[i] = i+10;
        // for(int i=0; i<arr.length; i++)
        //     System.out.println( "the array is:" + " "+arr[i]);
        Scanner scan= new Scanner(System.in);
        System.out.println("enter the number of subjects:");
        int a= scan.nextInt();
        int arr[]= new int[9];
        
        for(int i= 0; i<arr.length; i++){

            System.out.println("the marks is:"  );
            arr[i] = scan.nextInt();
        }
        System.out.println("printing the value of marks in array ");
        for(int j=0; j<arr.length; j++){
            System.out.print(arr[j]+" " );
        }

    }
}
