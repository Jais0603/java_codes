public class squarenatural {
    static void printsum(int x){
        int sum= 0;
        for(int i=1; i<=x; i++){
            sum= sum+(i*i);
        }
        System.out.println("Sum of squares"+ " "+ sum);
    }
    public static void main(String[] args) {
        printsum(5);
        printsum(10);
        printsum(15);
        printsum(25);
        printsum(45);
    }
    
}
