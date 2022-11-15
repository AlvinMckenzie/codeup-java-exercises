import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
//        add(2,4);
//        sub(4,2);
//        multi(2,8);
//        div(4,2);
//        modulus(4,2);
//        exercise2(1, 10);
        factorial();
    }

    public static double add(double num1, double num2){
        System.out.println(num1 + num2);
        return num1 + num2;
    }

    public static double sub(double num1, double num2){
        System.out.println(num1 - num2);
        return num1 - num2;
    }

    //(Ex 1 Bonus A)
    public static double multi(double num1, double num2){
        double result = 0;
        for (int i = 1; i <= num2; i++){
            result += num1;
        } System.out.println(result);
        return result;
    }

    public static double div (double num1, double num2){
        System.out.println(num1 / num2);
        return num1 / num2;
    }

    public static double modulus(double num1, double num2){
        System.out.println(num1 % num2);
        return num1 % num2;
    }

    // Ex. 2
    public static int ex2(int min, int max) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Choose a # between 1 and 10");
        int userNumber = myScanner.nextInt();

        if (userNumber >= min && userNumber <= max){
            return userNumber;
        } else {
            ex2(min, max);
        }
        return userNumber;
    }

    //Ex. 3
    public static void factorial() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a # between 1 and 10:");
        int userNum = scanner.nextInt();
        scanner.nextLine();

        if(userNum < 1 || userNum > 10){
            factorial();
        } else {
            int result = 1;
            System.out.printf(userNum + "! = ");
            for (int i = 1; i <= userNum; i++) {
                result *= i;
                System.out.printf("%d %s", i, i == userNum ? "" : "x ");
            } System.out.printf("= " + result + "\n");
            System.out.print("\nDo you want to continue? [y/n] ");
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("y")){
                factorial();
            } else {
                System.exit(0);
            }
        }
    }
}