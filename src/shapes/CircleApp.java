package shapes;

import util.Input;

import java.util.Scanner;

public class CircleApp {
    public static void main(String[] args) {
        Input x = new Input(new Scanner(System.in));
        double z = x.getDouble();
        Circle y = new Circle(z);
        System.out.println(y.getArea());
        System.out.println(y.getCircumference());
    }
}
