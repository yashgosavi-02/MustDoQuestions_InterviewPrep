package Practice;

import java.util.Scanner;

/* program to identify if the character is an alphabet or not*/
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character:");
        char ch = sc.next().charAt(0);
        if((ch >= 'A' && ch  <= 'Z') || (ch >= 'a' && ch <= 'z')){
            System.out.println("Alphabet");
        }else{
            System.out.println("Not a Alphabet");
        }
    }
}
