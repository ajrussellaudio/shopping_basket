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
    ArrayList<ShoppingItem> bogofTracker = new ArrayList<ShoppingItem>();
    double subtotal = 0;
    for( ShoppingItem item : items ){
      if(!bogofTracker.contains(item)){
        bogofTracker.add(item);
        subtotal += item.price();
      }
      else {
        bogofTracker.remove(item);
      }      
    }
    return subtotal;
  }

  public double total() {
    double subtotal = subtotal();
    if(subtotal >= 20){
      return subtotal * 0.9;
    }
    return subtotal;
  }

}