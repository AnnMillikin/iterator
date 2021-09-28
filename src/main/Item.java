package main;

public class Item {
    /* 	Create an Item class which will store the name of an item.
                Create methods for getName() and setName(String name)
                 */
    private String itemName;

    public Item(String itemName) {
        this.itemName = itemName;
    }

    public String getItemName() {
        return this.itemName;
    }

    public void setItemName(String name) {
        this.itemName = name;

    }


}
