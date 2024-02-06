import java.util.Scanner;

public class array {
   
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("enter the values: ");
        int arr[][]= new int[4][4];

        for(int i=0; i<arr.length;i++)
        {
            for(int j=0;j<arr[1].length; j++)
            {
                
            }
            System.out.println();
        }


        // 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
        System.out.println("the entered array is: ");
        for(int i=0; i<4;i++){
            for(int j=0;j<4; j++)
            {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    
    }

}
