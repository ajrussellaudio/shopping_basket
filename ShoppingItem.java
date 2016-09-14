class ShoppingItem {

  double price;
  String description;

  public ShoppingItem(double price) {
    this.price = price;
    this.description = null;
  }

  public ShoppingItem(double price, String description) {
    this.price = price;
    this.description = description;
  }

  public double price() {
    return price;
  }

  public String description() {
    return description;
  }

}