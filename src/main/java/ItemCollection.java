public class ItemCollection implements List<Item> {
    private Item[] items;

    public ItemCollection(Item[] items) {
        this.items = items;
    }

    public Iterator<Item> iterator() {
        return new ItemIterator(this.items);
    }
}
