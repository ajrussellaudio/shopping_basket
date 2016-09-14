import static org.junit.Assert.*;
import org.junit.*;

public class ShoppingItemTest {

  ShoppingItem item;
  ShoppingItem itemWithDescription;

  @Before
  public void before() {
    item = new ShoppingItem(4.67);
    itemWithDescription = new ShoppingItem(5.0, "foo");
  }

  @Test
  public void canBeNewed() {
    assertNotNull(item);
  }

  @Test
  public void hasPrice() {
    assertEquals( 4.67, item.price(), 0.01 );
  }

  @Test
  public void hasDescription() {
    assertEquals( "foo", itemWithDescription.description() );
  }

}