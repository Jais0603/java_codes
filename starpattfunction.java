public class starpattfunction {
    public static void main(String[] args) {
        printstar(6);
    }
    static void printstar(int x){
        for (int i=1;i<=5;i++){
            for(int j=1; j<=+i; j++){
                
                System.out.print("*"+ " ");
            }
            System.out.println();
        }
    }
}
