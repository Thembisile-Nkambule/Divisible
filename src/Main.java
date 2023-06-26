import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how

        Scanner scanner = new Scanner(System.in);

        System.out.print("Number: ");
        int num = scanner.nextInt();


        if (num % 5 == 0 && num % 3 == 0) {
            System.out.println("FizzBuzz");
        } else if (num % 5 == 0) {
            System.out.println("Fizz");
        } else if (num % 3 == 0) {
            System.out.println("Buzz");
        }
        else {
            System.out.println(num);
        }
    }
}