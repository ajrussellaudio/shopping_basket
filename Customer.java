class Customer {

  boolean hasLoyaltyCard;
  Basket basket;

  public Customer() {
    this.hasLoyaltyCard = false;
  }

  public Customer(boolean hasLoyaltyCard) {
    this.hasLoyaltyCard = hasLoyaltyCard;
  }

  public boolean hasLoyaltyCard() {
    return hasLoyaltyCard;
  }

  public void setBasket(Basket basket) {
    this.basket = basket;
  }

  public Basket basket() {
    return basket;
  }

  public double balanceDue() {
    double discount = 0.02;
    double total = basket.total();
    if(hasLoyaltyCard()) {
      total -= (total * discount);
    }
    return total;
  }

}