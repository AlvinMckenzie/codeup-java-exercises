import java.util.Scanner;
import java.lang.Math;


public class HighLow {

    public static int getRandom() {

        double rando = Math.floor(Math.random()*100+1);
        return (int) rando;

    }

    public static void main(String[] args) {

        int rando = getRandom();
        int count = 0;
        do {

            Scanner scanner = new Scanner(System.in);
            System.out.println("You have 5 chances to choose a number between 1 and 100: ");
            int userInput = scanner.nextInt();
            scanner.nextLine();
            if (rando == userInput) {
                System.out.println("You guessed the correct number " + userInput);
                count = 5;
            } else if (rando > userInput) {
                System.out.println("that's too low");
                count++;
            } else if (rando < userInput) {
                System.out.println("That's to high");
                count++;
            }

        } while (count < 5);

    }

}
