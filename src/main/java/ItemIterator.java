package main.java;

public class ItemIterator implements Iterator<Item> {

    private Item[] items;
    private int pos;

    public ItemIterator(Item[] items) {
        this.items = items;
        this.pos = 0;
    }

    public void reset() {
        this.pos = 0;
    }

    public Item next() {
        return this.items[this.pos++];
    }

    public Item currentItem() {
        return this.items[this.pos];
    }

    public boolean hasNext() {
        if(this.pos >= this.items.length) {
            return false;
        }
        return true;
    }
}
