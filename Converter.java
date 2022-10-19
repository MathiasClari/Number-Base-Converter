import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {

System.out.println();
System.out.println("Hello, this program will convert your number into different bases.");
System.out.println();
System.out.println();
System.out.println();

Scanner input = new Scanner(System.in);
System.out.print("Enter a number: ");
int number = input.nextInt();
System.out.println();
System.out.println();
System.out.println();
System.out.println("Which base would you like to convert to?");
System.out.println("1. Binary");
System.out.println("2. Octal");
System.out.println("3. Hexadecimal");
System.out.println();
System.out.print("Enter your choice: ");
int choice = input.nextInt();
System.out.println();
System.out.println();
System.out.println();

switch (choice) {
    case 1:
        System.out.println("Binary: " + Integer.toBinaryString(number));
        break;
    case 2:
        System.out.println("Octal: " + Integer.toOctalString(number));
        break;
    case 3:
        System.out.println("Hexadecimal: " + Integer.toHexString(number));
        break;
    default:
        System.out.println("Invalid choice.");
        break;
        }
    }

}

