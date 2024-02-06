public class infiniteloop {
    public static void main(String[] args) {
        printvalue(8);
    }
    static void printvalue(int x){
        for(int i = 1; i>=7;i++){
            for (int j= 1; j>=i; j++){
                System.out.println("❤️");
            }
        }
        System.out.println();
    }
}
