public class arraymultiplication {
    public static void main(String[] args) {
        
    
    
    int arrA[][]= {{1,2,3}, {1,2,3},{1,2,3}};
    int arrB[][]= {{1,2,3}, {1,2,3},{1,2,3}};
    int arrC[][]= new int [3][3];

    for(int i=0; i<arrA.length; i++){
        for(int j=0; j<arrA.length;j++){
            for(int k=0; k<arrA.length; k++){
                arrC[i][j]= arrC[i][j]+ arrA[i][k]*arrB[k][j];
            }
        }
    }

    
    // for (int i=0; i<arrC.length; i++){
    //     for(int j=0; j<arrC.length; j++){
    //         System.out.print(arrC[i][j]  + "  ");
    //     }
    //     System.out.println();
    // }

    // for each loop
    for(int x[]: arrC){
        for(int y: x){
            System.out.print(y+"  ");
        }
        System.out.println();
    }
    
}
}
