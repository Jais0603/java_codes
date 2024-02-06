import java.util.Scanner;

public class arraysum {
     public static void main(String[] args) {
   
        Scanner scan = new Scanner(System.in);
        int num= scan.nextInt();
        int arr[]={1,2,3,4,8,78,109,60,23,79,12,50,60,60,40,80};
        int sum=0;
        // for(int i=1;i<  arr.length;i++){
        //     sum=sum+arr[i];
        // }
        // System.out.println(sum);
        for(int i= 0; i<=arr.length;i++){
            if(num==arr[i]){
                System.out.println(i);
                //break;
            }
         }
        // System.out.println("enter the name u wanna search");
        // String arr[]={"sakshi", "priti", "chanchal", "akanksha", "sans", "sakshi", "jais", "sakshi"};
        //  //String a= scan.nextLine();
        // String a="sakshi";

        for(int i =0; i<arr.length;i++){
        if(num==arr[i])
        System.out.println(i);
        // break;
        // System.out.println(arr[i]);
    }
    }
}

