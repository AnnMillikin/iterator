package main;

public interface Iterator<E>  {
    /* methods: reset(), next(), currentItem(), and hasNext()

     */


     void reset();

     E next();

     E currentItem();

     boolean hasNext();

}
