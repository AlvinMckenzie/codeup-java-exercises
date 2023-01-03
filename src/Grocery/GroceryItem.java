package Grocery;

public class GroceryItem {
    private int amount;
    private String itemName;

    public GroceryItem(int amount, String itemName) {
        this.amount = amount;
        this.itemName = itemName;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public static void main(String[] args) {
        GroceryItem steak = new GroceryItem(4, "steak");
        System.out.println(steak.getAmount());

    }
}