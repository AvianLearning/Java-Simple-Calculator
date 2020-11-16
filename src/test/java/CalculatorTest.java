import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator myCalculator = new Calculator();

   @Test
   public void canAdd() {
       assertEquals(12, myCalculator.add(5, 7));
   }

   @Test
   public void canSubtract() {
       assertEquals(5, myCalculator.subtract(12, 7));
   }

   @Test
   public void canMultiply() {
       assertEquals(40, myCalculator.multiply(10, 4));
   }

   @Test
    public void canDivide() {
       assertEquals(2.5, myCalculator.divide(5.0, 2.0), 0.01);
   }
}
