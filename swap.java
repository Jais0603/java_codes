public class swap {
    static void printswap(int x,int y){
    
        int temp=x;
        x=y;
        y=temp;
        System.out.print("After swap => "+x+" "+y);
        System.out.println();
    }
    public static void main(String[] args) {
        printswap(3,6);
        printswap(7,9);
    }
    
}
