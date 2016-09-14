import static org.junit.Assert.*;
import org.junit.*;

public class BasketTest {

  ShoppingItem bread = new ShoppingItem(0.89, "Hovis white loaf");
  ShoppingItem milk = new ShoppingItem(0.99, "Whole milk 2L");
  ShoppingItem eggs = new ShoppingItem(1.25, "Free range eggs x 6");
  Basket basket;

  @Before
  public void before() {
    basket = new Basket();
  }

  @Test
  public void canAddItems() {
    basket.add(bread);
    assertEquals(1, basket.itemsCount());
  }

  @Test
  public void canRemoveItems() {
    basket.add(milk);
    basket.add(bread);
    basket.remove(milk);
    assertEquals(1, basket.itemsCount());
  }

  @Test
  public void canEmptyBasket() {
    basket.add(milk);
    basket.add(bread);
    basket.empty();
    assertEquals(0, basket.itemsCount());
  }

  @Test
  public void canGetSubtotal() {
    basket.add(milk);
    basket.add(eggs);
    assertEquals(2.24, basket.subtotal(), 0.01);
  }

}