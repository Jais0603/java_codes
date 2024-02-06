public class fact {
    public static void main(String[] args) {
        printfact(2);
        printfact(6);
        printfact(7);
        // printfact(8);
        // printfact(10);
        // printfact(11);
        // printfact(12);
        // printfact(22);
        // printfact(24);
    }
    static void printfact(int x){
        int fact = 1;
        for(int i =1; i<=x; i++){
            fact= fact*i;
        }
        System.out.println("the factorial of the number is" +" "+ fact);
    }
}
