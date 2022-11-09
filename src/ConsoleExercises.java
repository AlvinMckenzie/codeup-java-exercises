import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.println("The value of pi is approximately 3.14");
        System.out.printf("The value of pi is approximately %.2f%n", pi);


//        Scanner scannerIO = new Scanner(System.in);
//        System.out.print("How older were you when you bought your first car: ");
//        int age = Integer.parseInt(scannerIO.next());
//
//        Scanner scannerStr = new Scanner(System.in);
//        System.out.print("Enter three words: ");
//        String str = scannerStr.nextLine();
//
//        System.out.println("You entered:-->\""+ age + "\"<--");
//        System.out.println("You entered:-->\""+ str + "\"<--");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length and width of your room: ");
        float nextString = scanner.nextFloat();
        float nextNString = scanner.nextFloat();
        float total = ((nextString + nextNString) * 2);
        System.out.println("This is the area " + total);


    }
}
