class Customer {

  boolean hasLoyaltyCard;

  public Customer() {
    this.hasLoyaltyCard = false;
  }

  public Customer(boolean hasLoyaltyCard) {
    this.hasLoyaltyCard = hasLoyaltyCard;
  }

  public boolean hasLoyaltyCard() {
    return hasLoyaltyCard;
  }

}