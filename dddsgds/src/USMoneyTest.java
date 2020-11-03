import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * JUnit tests for the practice coding exam.
 * 
 * @author Nathan Sprague
 * @version Spring 2016
 */
public class USMoneyTest {

   @Before
   public void setUp() throws Exception {
   }

   @Test
   public void testZeroArgConstructor() {
      USMoney money = new USMoney();
      assertEquals(0, money.getTotalCents());
   }
   
   @Test
   public void testTwoArgConstructorNegativeDollars() {
      USMoney money = new USMoney(-1, 10);
      assertEquals(00, money.getDollars());
   }
   
   @Test
   public void testTwoArgConstructorNegativeCents() {
      USMoney money = new USMoney(1, -10);
      assertEquals(0, money.getCents());
   }
   
   @Test
   public void testTwoArgConstructorNoAdjustment() {
      USMoney money = new USMoney(2, 10);
      assertEquals(2, money.getDollars());
      assertEquals(10, money.getCents());
   }
   
   @Test
   public void testTwoArgConstructorNeedsAdjusting() {
      USMoney money1 = new USMoney(2, 100);
      USMoney money2 = new USMoney(2, 250);
      
      assertEquals(3, money1.getDollars());
      assertEquals(0, money1.getCents());
      
      assertEquals(4, money2.getDollars());
      assertEquals(50, money2.getCents());         
   }
   
   @Test
   public void testGetTotalCentsCentsOnly() {
      USMoney money = new USMoney(0, 10);
      assertEquals(10, money.getTotalCents());
   }
   
   @Test
   public void testGetTotalCentsDollarsOnly() {
      USMoney money = new USMoney(2, 0);
      assertEquals(200, money.getTotalCents());
   }
   
   @Test
   public void testGetTotalCentsDollarsAndCents() {
      USMoney money = new USMoney(2, 10);
      
      assertEquals(210, money.getTotalCents());
   }
   
   @Test
   public void testComareToDollarsOnly() {
      USMoney money1 = new USMoney(2, 0);
      USMoney money2 = new USMoney(3, 0);
      
      assertEquals(0, money1.compareTo(money1));
      assertEquals(-1, money1.compareTo(money2));
      assertEquals(1, money2.compareTo(money1));
   }
   
   @Test
   public void testComareToCentsOnly() {
      USMoney money1 = new USMoney(0, 2);
      USMoney money2 = new USMoney(0, 3);
      
      assertEquals(0, money1.compareTo(money1));
      assertEquals(-1, money1.compareTo(money2));
      assertEquals(1, money2.compareTo(money1));
   }
   
   @Test
   public void testComareToDollarsAndCents() {
      USMoney money1 = new USMoney(2, 10);
      USMoney money2 = new USMoney(1, 205);
      
      assertEquals(0, money1.compareTo(money1));
      assertEquals(-1, money1.compareTo(money2));
      assertEquals(1, money2.compareTo(money1));
   }
   
   @Test
   public void testAddNoAdjustNeeded() {
      USMoney money1 = new USMoney(2, 10);
      USMoney money2 = new USMoney(1, 20);
      USMoney result1 = money1.add(money2);
      USMoney result2 = money2.add(money1);
      
      assertEquals(3, result1.getDollars());
      assertEquals(30, result1.getCents());
      
      assertEquals(3, result2.getDollars());
      assertEquals(30, result2.getCents());
   }
   
   
   @Test
   public void testAddAdjustNeeded() {
      USMoney money1 = new USMoney(2, 80);
      USMoney money2 = new USMoney(1, 30);
      USMoney result1 = money1.add(money2);
      USMoney result2 = money2.add(money1);
      
      assertEquals(4, result1.getDollars());
      assertEquals(10, result1.getCents());
      
      assertEquals(4, result2.getDollars());
      assertEquals(10, result2.getCents());
   }
   
   @Test
   public void testCountMoneyEmpty() {
      USMoney[] allMoney = new USMoney[0];
      
      USMoney result = USMoney.countMoney(allMoney);
   
      assertEquals(0, result.getDollars());
      assertEquals(0, result.getCents());
      
   }
   
   @Test
   public void testCountMoneyNonEmpty() {
      USMoney[] allMoney = new USMoney[3];
      allMoney[0] = new USMoney(1, 80);
      allMoney[1] = new USMoney(0, 30);
      allMoney[2] = new USMoney(2, 00);
      
      USMoney result = USMoney.countMoney(allMoney);
   
      assertEquals(4, result.getDollars());
      assertEquals(10, result.getCents());
      
   }
   
}
