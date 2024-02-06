public class matrixmultiply {
    public static void main(String[] args) {
        int a[][]= {{4,5,6},{4,5,6},{4,5,6}};
        int b[][]= {{4,5,6},{4,5,6},{4,5,6}};
        int c[][]=new int[3][3];
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a.length; j++){
                for(int k=0; k<a.length; k++){
                c[i][j] = c[i][j] + a[i][k]* b[k][j];
            }

        }
        }
        for(int u[]: c){
            for(int w: u){
                System.out.print(w+"  ");
            }
            System.out.println();
        }
    }
}

