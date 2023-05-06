package Practice;

import java.util.Scanner;

/* program to find area of circle, rectangle, triangle*/
public class Q3_4_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Area to calculate of 1.Circle 2.Rectangle 3.Triangle\n Enter Your Choice: ");
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                System.out.print("Enter value of Radius: ");
                int radius = sc.nextInt();
                System.out.println("Area = "+(int)(3.14*radius*radius)+"unit.sq");
                break;
            case 2:
                System.out.print("Enter value of Length: \n");
                int length = sc.nextInt();
                System.out.print("Enter value of Breadth: ");
                int breadth = sc.nextInt();
                System.out.println("Area = "+(length*breadth)+"unit.sq");
                break;
            case 3:
                System.out.print("Enter value of Base: \n");
                int base = sc.nextInt();
                System.out.print("Enter value of Height: ");
                int height = sc.nextInt();
                System.out.println("Area = "+(int)(0.5*base*height)+"unit.sq");
        }
    }
}