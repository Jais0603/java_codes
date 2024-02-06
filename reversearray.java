import java.util.Scanner;

public class reversearray {

    static void reverseArray(int arr[], int start, int end) {
        int temp;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner sj = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sj.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sj.nextInt();
        }

        // Reverse the entire array
        reverseArray(arr, 0, n - 1); 

        System.out.println("Array after reversing: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
