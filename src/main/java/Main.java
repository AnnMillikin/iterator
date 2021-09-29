package main.java;

public class Main {

    public static void main(String[] args) {
        int numItems = 6;
        main.java.Item[] items = new main.java.Item[numItems];

        // create new items
        for (int i = 0; i < numItems; i++) {
            items[i] = new main.java.Item("item" + i);
        }

        // create an Item Collection and iterator
        List<main.java.Item> itemCollection = new main.java.ItemCollection(items);
        Iterator<main.java.Item> iterator = itemCollection.iterator();

        while (iterator.hasNext()) {
            main.java.Item currentItem = iterator.currentItem();
            System.out.println("current item: " + currentItem.getItemName());
            iterator.next();
        }

    }
}

