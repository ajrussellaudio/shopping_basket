import static org.junit.Assert.*;
import org.junit.*;

public class BasketTest {

  ShoppingItem bread = new ShoppingItem(0.89, "Hovis white loaf");
  ShoppingItem milk = new ShoppingItem(0.99, "Whole milk 2L");
  ShoppingItem eggs = new ShoppingItem(1.25, "Free range eggs x 6");
  ShoppingItem ps4 = new ShoppingItem(249.99, "Sony PlayStation 4 500Gb");
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

  @Test
  public void canSubtotal_BOGOF() {
    basket.add(milk);
    basket.add(milk);
    assertEquals(0.99, basket.subtotal(), 0.01);
  }

  @Test
  public void canSeriouslyDidThatTestPass() {
    basket.add(milk);
    basket.add(milk);
    basket.add(milk);
    basket.add(milk);
    assertEquals(1.98, basket.subtotal(), 0.01);
  }

  @Test
  public void canTotalAfterDiscount_noDiscount() {
    basket.add(milk);
    basket.add(eggs);
    assertEquals(2.24, basket.total(), 0.01);
  }

  @Test
  public void canTotalAfterDiscount_discount() {
    basket.add(ps4);
    assertEquals(224.99, basket.total(), 0.01);
  }

}