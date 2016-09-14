import java.util.*;

class Basket {

  ArrayList<ShoppingItem> items;

  public Basket() {
    this.items = new ArrayList<ShoppingItem>();
  }

  public int itemsCount() {
    return items.size();
  }

  public void add(ShoppingItem item) {
    items.add(item);
  }

  public void remove(ShoppingItem item) {
    items.remove(item);
  }

  public void empty() {
    for( int i = 0; i <= itemsCount(); i++ ) {
      items.remove(0);
    }
  }

  public double subtotal() {
    double subtotal = 0;
    for( ShoppingItem item : items ){
      subtotal += item.price();
    }
    return subtotal;
  }

}