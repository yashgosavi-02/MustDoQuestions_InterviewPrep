package Practice;

import java.util.Scanner;

/* program to identify if the character is a vowel or consonant*/
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Character: ");
        char ch = sc.next().charAt(0);
        if(ch == 'A'|| ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            System.out.println("Vowel");
        }else if((ch>='A' && ch <='Z')||(ch>='a' && ch<= 'z')){
            System.out.println("Consonant");
        }else{
            System.out.println("Wrong Input");
        }
    }
}
