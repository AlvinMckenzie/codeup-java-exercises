import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

//        int i = 5;
//        while (i <= 15){
//            System.out.println(i++);
//        }

//        int i = 0;
//        do{
//            System.out.println(i);
//            i += 2;
//        }while (i <= 100);

//        for (int i = 5; i <= 15; i++) {
//            System.out.println(i);
//        }

//        for (int i = 0; i <= 100; i++){
//            if (i % 3 == 0 && i % 5 == 0){
//                System.out.println(i + "FizzBuzz");
//            }else if (i % 3 == 0) {
//                System.out.println(i + "Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println(i + "Buzz");
//            } else System.out.println(i);
//        }

//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter a number: ");
//        int userInput = sc.nextInt();
//        for (int i = 0; i <= userInput; i++){
//            if ( i == 0) {
//                System.out.println("Here is your table!");
//                System.out.println("number  | squared   | cubed");
//            }else {
//                System.out.format("%-6d\t| %-6.0f\t| %-6.0f | \n", i, Math.pow(i, 2), Math.pow(i, 3));
//            }
//        }

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your grade: ");
        int userInput = scanner.nextInt();
        if (userInput >= 88 & userInput <= 100) {
            System.out.println("You got an A " + userInput);
        } else if (userInput >= 80 && userInput <= 87) {
            System.out.println("You got an B " + userInput);
        } else if (userInput >= 67 && userInput <= 79) {
            System.out.println("You got an C " + userInput);
        } else if (userInput >= 60 && userInput <= 66) {
            System.out.println("You got an D " + userInput);
        } else {System.out.println("You got an F " + userInput);}


    }
}
