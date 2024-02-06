public class change_array {

    static void change_array2(int []arr){
        for(int i= 0; i<arr.length; i++){
            arr[i] =0;
        }

    }

    // this method is used to print the array 
    
    static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i] + " ");
        }

       System.out.println();
    }
    public static void main(String[] args) {

        int [] arr= new int[3];
        arr[0] = 4;
        arr[1] = 8;
        arr[2] = 6;
        
        change_array2(arr);
        printArray(arr);


    }
    
}
