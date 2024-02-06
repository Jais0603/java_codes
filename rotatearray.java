/*write a program to rotate an array by one element towards right like 

arr = {1,2,3,4,5,6,7}

after rotated

arr ={7,1,2,3,4,5,6} */



public class rotatearray {
    public static void main(String[] args) {
        int arrA[]={4,5,7,8,90,35,89,67,73,28};
        int n= arrA[arrA.length-1];


        System.out.println("original array A ");



        for(int i=0; i<arrA.length;i++){
            System.out.print(arrA[i] + " ");
        }
            System.err.println();


            for(int i =arrA.length-1; i>0;  i--){
                arrA[i]=arrA[i-1]; 
            }
             arrA[0] =n;

// for shifting right side
            System.out.println("Array after right shift rotation:");
            for(int i=0; i<arrA.length; i++)
            System.out.print(arrA[i] + " ");
            // System.out.println("Array after left shifting");
            // for(int i=0 ;i<arrA.length; i-- )
            // System.out.println(arrA[i] + " ");
        }
    }
    

