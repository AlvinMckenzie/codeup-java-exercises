package Grocery;

import util.Input;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Stream;

public class GroceryList {

    public static void groceryApp(HashMap <String, ArrayList<GroceryItem>> meat, HashMap <String, ArrayList<GroceryItem>> dairy, HashMap <String, ArrayList<GroceryItem>> veggie,  HashMap <String, ArrayList<GroceryItem>> freezer) {

        Input word = new Input(new Scanner(System.in));

        System.out.println("Please choose a category for the item");
        System.out.println("1. Meat & Fish");
        System.out.println("2. Dairy");
        System.out.println("3. Fruits and Veggies");
        System.out.println("4. Freezer");

        int cat =  word.getInt();
        if (cat == 1) {
            Input words = new Input(new Scanner(System.in));
            System.out.println("What is the name of the item you would like added to the list?");
            String item = words.getString();
            System.out.println("How many of them do you need");
            int num = words.getInt();

            meat.get("Meats").add(new GroceryItem(num, item));

        } else if (cat == 2) {
            Input words = new Input(new Scanner(System.in));
            System.out.println("What is the name of the item you would like added to the list?");
            String item = words.getString();
            System.out.println("How many of them do you need");
            int num = words.getInt();

            dairy.get("Dairy").add(new GroceryItem(num, item));

        } else if (cat == 3) {
            Input words = new Input(new Scanner(System.in));
            System.out.println("What is the name of the item you would like added to the list?");
            String item = words.getString();
            System.out.println("How many of them do you need");
            int num = words.getInt();

            veggie.get("Fruits and Veggies").add(new GroceryItem(num, item));
        } else if (cat == 4) {
            Input words = new Input(new Scanner(System.in));
            System.out.println("What is the name of the item you would like added to the list?");
            String item = words.getString();
            System.out.println("How many of them do you need");
            int num = words.getInt();

            freezer.get("Freezer").add(new GroceryItem(num, item));
        }

        System.out.println("Would you like to add more items?");
        Input input = new Input(new Scanner(System.in));
        boolean check2 = input.yesNo();
        if (!check2) {

        } else if (check2) {
            groceryApp(meat, dairy, veggie, freezer);
        }
    }

    public static void main(String[] args) {

        HashMap <String, ArrayList<GroceryItem>> meat = new HashMap<>();
        meat.put("Meats", new ArrayList<GroceryItem>());
        HashMap <String, ArrayList<GroceryItem>> dairy = new HashMap<>();
        dairy.put("Dairy", new ArrayList<GroceryItem>());
        HashMap <String, ArrayList<GroceryItem>> veggie = new HashMap<>();
        veggie.put("Fruits and Veggies", new ArrayList<GroceryItem>());
        HashMap <String, ArrayList<GroceryItem>> freezer = new HashMap<>();
        freezer.put("Freezer", new ArrayList<GroceryItem>());

        Input word = new Input(new Scanner(System.in));
        System.out.println("Would you like to create a grocery list?");
        boolean check = word.yesNo();
        if (!check) {
            System.out.println("That sucks");
            return;
        } else if (check) {
            groceryApp(meat, dairy, veggie, freezer);

            System.out.println("Here is your Grocery List");
            System.out.println("Meats");
            for (int i = 0; i < meat.get("Meats").size(); i++) {
                System.out.println(meat.get("Meats").get(i).getItemName() + " - " +  meat.get("Meats").get(i).getAmount());
            }
            System.out.println("Dairy");
            for (int i = 0; i < dairy.get("Dairy").size(); i++) {
                System.out.println(dairy.get("Dairy").get(i).getItemName() + " - " +  dairy.get("Dairy").get(i).getAmount());
            }
            System.out.println("Fruits and Veggies");
            for (int i = 0; i < veggie.get("Fruits and Veggies").size(); i++) {
                System.out.println(veggie.get("Fruits and Veggies").get(i).getItemName() + " - " +  veggie.get("Fruits and Veggies").get(i).getAmount());
            }
            System.out.println("Freezer");
            for (int i = 0; i < freezer.get("Freezer").size(); i++) {
                System.out.println(freezer.get("Freezer").get(i).getItemName() + " - " +  freezer.get("Freezer").get(i).getAmount());
            }
        }
    }
}