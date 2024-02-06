//Write a function to calculate factorial of a number.(Takes Something, Returns Something)


public class factorailfunctions {
    public static void main(String[] args) {
        System.out.println(" the factorail of numbers is");
        printfactorial(7);
        printfactorial(9);
        printfactorial(23);
        printfactorial(11);
    }
    static void  printfactorial(int x){
        int fact= 1;
        for(int i=1; i<=x; i++)
        {
            fact = fact*i;
        }
        System.out.println(fact);
    }
}
