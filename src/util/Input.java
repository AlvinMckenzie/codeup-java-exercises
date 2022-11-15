package util;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Input myInput = new Input(new Scanner(System.in));
        System.out.println("myInput.getString() = " + myInput.getString());
        System.out.println("myInput.yesNo() = " + myInput.yesNo());
    }

    private Scanner scanner;


    public Input (Scanner scanner){
        this.scanner = scanner;
    }

    public String getString(){
        return scanner.nextLine();
    }

    public boolean yesNo(){
        String nextLine = this.scanner.nextLine();
        return (nextLine.equalsIgnoreCase("y") || nextLine.equalsIgnoreCase("yes") || nextLine.equalsIgnoreCase("true"));
    }











}
