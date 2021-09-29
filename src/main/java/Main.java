public class Main {

    public static void main(String[] args) {
        int numItems = 6;
        Item[] items = new Item[numItems];

        // create new items
        for (int i = 0; i < numItems; i++) {
            items[i] = new Item("item" + i);
        }

        // create an Item Collection and iterator
        List<Item> itemCollection = new ItemCollection(items);
        Iterator<Item> iterator = itemCollection.iterator();

        while (iterator.hasNext()) {
            Item currentItem = iterator.currentItem();
            System.out.println("current item: " + currentItem.getItemName());
            iterator.next();
        }

    }
}

