//import java.util.Scanner;

public class jaggedarray {
    public static void main(String[] args) {
        // int arr[][]= new int[6][];
        // arr[0]= new int[5];
        // arr[1]= new int[3];
        // arr[2]= new int[1];
        // arr[3]= new int[2];
        // arr[4]= new int[4];
        // arr[5]= new int[8];
        // for(int i=0; i<arr.length; i++){
        //     for(int j=0; j<arr[i].length; j++){
        //         System.out.print(arr[i][j] + "  ");
        //     }
        //     System.out.println();
        // }
 int arr[][] = new int[9][];
            arr[0]= new int[5];
            arr[1]= new int[2];
            arr[2]= new int[8];
            arr[3]= new int[3];
            arr[4]= new int[1];
            arr[5]= new int[6];
            arr[6]= new int[9];
            arr[7]= new int[4];
            arr[8]= new int[7];
            for(int i=0; i<arr.length;i++){
                for(int j=0;j<arr[i].length;j++){
                    System.out.print(arr[i][j] +" ");
                }
                System.out.println();
            }
    }
}
