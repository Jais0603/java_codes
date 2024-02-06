import java.util.Scanner;
public class jaggedquestions {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of subject: ");
     
        int subjects = scan.nextInt();
        System.out.print("Enter the number of CAs in each subject: ");
        int cas = scan.nextInt();

        int[][] marks = new int[subjects][cas];
        int[] totalMarks = new int[subjects];
        String[] grades = new String[subjects];

        for (int i = 0; i < subjects; i++) {
            System.out.println("Enter the marks for subject " + (i + 1) + ":");
            int sum = 0;

            for (int j = 0; j < cas; j++) {
                System.out.print("CA " + (j + 1) + ": ");
                marks[i][j] = scan.nextInt();
                sum += marks[i][j];
            }
            totalMarks[i] = sum;
            if (sum >= 80) {
                grades[i] = "A";
            } 
            else if (sum >= 70) {
                grades[i] = "B";
            } 
            else if (sum >= 60) {
                grades[i] = "C";
            } 
            else if (sum >= 50) {
                grades[i] = "D";
            }
             else {
                grades[i] = "F";
            }
        }
        scan.close();
      
        System.out.println("The marks entered are: ");
        for (int i = 0; i < subjects; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            for (int j = 0; j < cas; j++) {
                System.out.print(marks[i][j] + " ");
            }
            System.out.println(" Total: " + totalMarks[i] + " Grade: " + grades[i]);
        }
    }
}





























    //     Scanner scan = new Scanner(System.in);
    //     System.out.println("Enter the number of subjects:" + " ");
    //     int subjects =scan.nextInt();
    //     System.out.println("Enter the number of CAs in each subjects:" + " ");
    //     int cas = scan.nextInt();

    //     int [][]  marks =new int [subjects][cas];
    //     for(int i=0;i<subjects; i++){
    //         {
    //             System.out.println("Enter the marks for each subjects" + (i+1)+ ":");
    //             for(int j=0; j<cas; j++){
    //                 System.out.println("CA"+ (j+1)+ ":");
    //                 marks[i][j]=scan.nextInt();
    //             }
                
    //         }
    //         scan.close();

    //         System.out.println("The marks entered are:");
    //         for(int i=0;i<subjects; i++) {
    //             System.out.println("Subject" + (i+1)+" :");
    //             for(int j=0; i<cas; j++){
    //                 System.out.println(marks[i][j] +" ");
    //             }
    //             System.out.println();
    //         }
    //  }
  


