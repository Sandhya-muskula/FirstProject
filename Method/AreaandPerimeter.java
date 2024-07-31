package Method;
import java.util.Scanner;
public class AreaandPerimeter {

	// Method to calculate and print the area of a rectangle
    public static void calculateAndPrintArea(int length, int width) {
        int area = length * width;
        System.out.println("Area: " + area);
    }

    // Method to calculate and print the perimeter of a rectangle
    public static void calculateAndPrintPerimeter(int length, int width) {
        int perimeter = 2 * (length + width);
        System.out.println("Perimeter: " + perimeter);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the length
        System.out.print("Enter the length of the rectangle: ");
        int length = scanner.nextInt();

        // Prompt the user for the width
        System.out.print("Enter the width of the rectangle: ");
        int width = scanner.nextInt();

        //   methods to calculate and print area and perimeter
        System.out.println("For a rectangle with length " + length + " and width " + width + ":");
        calculateAndPrintArea(length, width);
        calculateAndPrintPerimeter(length, width);

    }
}
