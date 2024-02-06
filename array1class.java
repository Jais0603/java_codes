public class array1class {

    static int[]  mthAddArray(int[] a1, int[] a2)
    {
        int[] temp = new int[a1.length];
        for(int i=0;i<temp.length;i++)
        temp[i] =a1[i] +a2[i];
        return temp;
        }
     public static void main(String[] args) {
        
     
    int[] arr1= new int[10];
    int[] arr2;
    int[] arr3={1,2,3,4,5,6};
    int[] arr4={10,12,13,34,15,64};
    int[] arr5=mthAddArray(arr3,arr4);
    for(int i=0;i<arr5.length;i++){
        System.out.println(arr5[i]);
    }


    }

}

