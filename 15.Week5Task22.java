import java.util.Scanner;
public class Week5Task22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a decimal value (0 to 15):");
        int decimalValue = input.nextInt();
        if (decimalValue >= 0 && decimalValue <= 15) {
            System.out.println("The hex value is " + Integer.toHexString(decimalValue));
        } else {
            System.out.println(decimalValue + " is an invalid input");
        }
        input.close();
    }
}
