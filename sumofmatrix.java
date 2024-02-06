import java.util.Scanner;
public class sumofmatrix {

    public static void main(String[] args) {
        //System.out.println("enter the values of arr A & arr B");
        Scanner scan= new Scanner(System.in);
        int arrA[][]= new int[3][3];
        int arrB[][]= new int[3][3];
        int arrC[][]= new int[3][3];


        System.out.println("enter the value of Matrix A of 3x3");
        // 1 2 3 4 5 6 7 8 9
        for(int i=0; i<arrA.length;i++){
            for(int j=0;j<arrA[0].length; j++){
                arrA[i][j]=scan.nextInt();
            }
        }


        System.out.println("enter the value of Matrix B of 3x3");
        for(int i=0; i<arrB.length;i++){
            for(int j=0;j<arrB[0].length; j++){
                arrB[i][j]=scan.nextInt();
            }
        }

       
        for(int i=0; i<arrC.length;i++){
            for(int j=0;j<arrC[0].length; j++){
                arrC[i][j]=arrA[i][j] + arrB[i][j];          
            }
        } 


        System.out.println("___________Sum of array is__________");
        for(int i=0; i<arrC.length;i++){
            for(int j=0;j<arrC[0].length; j++){
                System.out.printf("%2d ",arrC[i][j]);
            }
            System.out.println();
        } 
    }
}
//1 2 3 4 5 6 7 8 9