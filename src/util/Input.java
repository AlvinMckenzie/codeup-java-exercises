package util;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Input myInput = new Input(new Scanner(System.in));
        myInput.getString();
        myInput.yesNo();
        myInput.getInt(1,10);
        myInput.getInt();
        myInput.getDouble(1,10);
        myInput.getDouble();
    }

    private Scanner scanner;


    public Input (Scanner scanner){
        this.scanner = scanner;
    }

    public String getString(){
        System.out.println("Enter String here:");
        return scanner.nextLine();
    }

    public boolean yesNo(){
        System.out.println("Enter y or false:");
        String nextLine = this.scanner.nextLine();
        return (nextLine.equalsIgnoreCase("y") || nextLine.equalsIgnoreCase("yes") || nextLine.equalsIgnoreCase("true"));
    }

    public int getInt(int min, int max){
        System.out.println("Enter number between min and max:");
        int num = scanner.nextInt();
        if (num < min || num > max) {
            return getInt(min, max);
        }
        else {
            return num;
        }
    }

    public int getInt (){
        System.out.println("Enter a number:");
        int num = scanner.nextInt();
        System.out.println(num);
        return num;
    }

    public double getDouble(double min, double max){
        System.out.println("Enter number between min and max:");
        double num = scanner.nextDouble();
        if (num < min || num > max) {
            return getDouble(min, max);
        }
        else {
            return num;
        }
    }

    public double getDouble(){
        System.out.println("Enter a number:");
        double num = scanner.nextDouble();
        System.out.println(num);
        return num;
    }


}
