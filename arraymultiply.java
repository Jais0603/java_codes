public class arraymultiply {
    public static void main(String[] args) {
        

        int arrA[][]={{7,8,9},{7,8,9},{7,8,9}};
        int arrB[][]={{7,8,9},{7,8,9},{7,8,9}};
        int arrC[][]= new int [3][3];

        for(int i=0; i<arrA.length; i++){
            for(int j=0; j<arrA.length; j++){
                for(int k=0; k<arrA.length; k++){
                    arrC[i][j]=arrC[i][j] + arrA[i][k]*arrB[k][j];
                }
            }
        }
        // printing value of array C using for ecah loop;
        for(int u[]: arrC){
            for(int w: u){
                System.out.print(w+"  ");
            }
            System.out.println();

     }
    }
}
