import java.util.Scanner;
public class Week5Task24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a letter:");
        String letter = input.nextLine();
        if (letter.length() == 1) {
            char ch = letter.charAt(0);
            if (Character.isLetter(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                        ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                    System.out.println(ch + " is a vowel");
                } else {
                    System.out.println(ch + " is a consonant");
                }
            } else {
                System.out.println(letter + " is an invalid input");
            }
        } else {
            System.out.println(letter + " is an invalid input");
        }
        input.close();
    }
}
