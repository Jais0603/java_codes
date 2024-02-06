import java.util.Scanner;

public class lastOccuranceOFarray {
        static int lastOccurance(int[] arr, int x){
        int lastIndex= -1;

    for(int i=0; i<arr.length; i++)
    {
            if (arr[i] == x)
        {
            lastIndex=i;
        }
    }

    return lastIndex;
}

public static void main(String[] args) {
    
    Scanner sj = new Scanner(System.in);
    System.out.println("Enter size of elements");
    int n = sj.nextInt();

    int []  arr= new int[n];
    System.out.println("Enter" + n + " " + "elements : " );
        
        for(int i= 0; i<arr.length; i++){
        arr[i] = sj.nextInt();
    } 
    System.out.println("Enter x");
        int x= sj.nextInt();

    System.out.println("last occurance  of x: " + " " + lastOccurance(arr, x));
}

}


  

