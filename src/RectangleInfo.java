import java.util.Scanner;
public class RectangleInfo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double width = 0.0;
        double height = 0.0;
        double area = 0.0;
        double perimeter = 0.0;
        double diagonal = 0.0;
        String trash = "";
        boolean done = false;
        do {
            System.out.println("Enter the width of the rectangle: ");
            if(in.hasNextDouble()) {
                width = in.nextDouble();
                in.nextLine();
                if (width > 0) {break;}
                if (width >0) {done = true;}
                else {
                    System.out.println("Please enter a value greater than 0!");
                }
            }
            else {
                trash = in.nextLine();
                System.out.println("Please enter a valid number, not: " + trash);
            }
        }
        while (!done);
        do {
            System.out.println("Enter the height of the rectangle: ");
            if(in.hasNextDouble()) {
                height = in.nextDouble();
                in.nextLine();
                if (height > 0) {break;}
                if (height > 0) {done = true;}
                else {
                    System.out.println("Please enter a value greater than 0!");
                }
            }
            else {
                trash = in.nextLine();
                System.out.println("Please enter a valid number, not: " + trash);
            }
        }
        while (!done);
        area = width * height;
        perimeter = 2 * (width + height);
        diagonal = Math.sqrt(width * width + height * height);
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Diagonal: " + diagonal);
    }
}