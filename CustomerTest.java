import static org.junit.Assert.*;
import org.junit.*;

public class CustomerTest{

  Customer customer;
  Customer customerWithLoyaltyCard;

  @Before
  public void before() {
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

}