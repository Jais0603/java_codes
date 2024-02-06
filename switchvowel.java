//write program to check vowel or consonant using switch case 

import java.util.Scanner;

public class switchvowel {
    public static void main(String[] args) {
        System.out.println("Enter the vowels and consonant of alphabets");
        Scanner scan= new Scanner(System.in);
        char ch;
        ch=scan.next().charAt(0);
        switch(ch)
        {
            case 'a':
            System.out.println(ch  +  "is a vowel");
            break;
            case 'e':
            System.out.println(ch  + "is a vowel");
            break;
            case 'i':
            System.out.println(ch + "is a vowel");
            break;
            case 'o':
            System.out.println(ch + "is a vowel");
            break;
            case 'u':
            System.out.println(ch + "is a vowel");
            break;
            case 'A':
            System.out.println(ch + "is a vowel");
            break;
            case 'E':
            System.out.println(ch + "is a vowel");
            break;
            case 'I':
            System.out.println(ch + "is a vowel");
            break;
            case 'O':
            System.out.println(ch + "is a vowel");
            break;
            case 'U':
            System.out.println(ch + "is a vowel");
            break;
            default:
            System.out.println(ch + "is a consonant");
            break;
        }


    }
}
