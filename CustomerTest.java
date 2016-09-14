import static org.junit.Assert.*;
import org.junit.*;

public class CustomerTest{

  Basket basket;
  Customer customer;
  Customer customerWithLoyaltyCard;

  @Before
  public void before() {
    basket = new Basket();
    customer = new Customer();
    customerWithLoyaltyCard = new Customer(true);
  }

  @Test
  public void canBeNewed() {
    assertNotNull(customer);
  }

  @Test
  public void hasLoyaltyCard() {
    assertEquals( true, customerWithLoyaltyCard.hasLoyaltyCard() );
  }

  @Test
  public void canBeGivenBasket() {
    customer.setBasket(basket);
    assertNotNull(customer.basket());
  }

  @Test
  public void canHaveLoyaltyDiscount() {
    basket.add(new ShoppingItem(10.0));
    customerWithLoyaltyCard.setBasket(basket);
    assertEquals(9.80, customerWithLoyaltyCard.balanceDue(), 0.01);
  }

  @Test
  public void canHaveLoyaltyDiscount_noCard() {
    basket.add(new ShoppingItem(10.0));
    customer.setBasket(basket);
    assertEquals(10, customer.balanceDue(), 0.01);
  }

}