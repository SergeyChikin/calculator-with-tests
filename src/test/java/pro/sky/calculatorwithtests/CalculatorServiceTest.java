package pro.sky.calculatorwithtests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;
import pro.sky.calculatorwithtests.exeption.InvalidValueException;
import pro.sky.calculatorwithtests.service.CalculatorService;



@SpringBootTest
public class CalculatorServiceTest {

  private final CalculatorService calculatorService = new CalculatorService();
  @Test
  public void testPlus() {
    Integer actual = calculatorService.sum(5, 5);
    Integer actual1 = calculatorService.sum(0, 15);
    Assertions.assertEquals(10, actual);
    Assertions.assertEquals(15, actual1);
  }

  @Test
  public void testMinus() {
    Integer actual = calculatorService.minus(5, 5);
    Integer actual1 = calculatorService.minus(2, 5);
    Assertions.assertEquals(0, actual);
    Assertions.assertEquals(-3, actual1);
  }

  @Test
  public void testMultiply() {
    Integer actual = calculatorService.multiply(5, 5);
    Integer actual1 = calculatorService.multiply(15, 15);
    Assertions.assertEquals(25, actual);
    Assertions.assertEquals(225, actual1);
  }

  @Test
  public void testDivide() {
    Double actual = calculatorService.divide(5, 5);
    Double actual1 = calculatorService.divide(45, 5);
    Assertions.assertEquals(1, actual);
    Assertions.assertEquals(9, actual1);
  }

  @Test
  public void testDivideOnZero() {
    Assertions.assertThrows(InvalidValueException.class, ()-> calculatorService.divide(5, 0));
  }
}
