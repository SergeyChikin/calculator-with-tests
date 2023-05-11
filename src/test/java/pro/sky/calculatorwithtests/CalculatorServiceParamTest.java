package pro.sky.calculatorwithtests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.boot.test.context.SpringBootTest;
import pro.sky.calculatorwithtests.service.CalculatorService;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.platform.commons.util.ReflectionUtils.*;

@SpringBootTest
class CalculatorServiceParamTest {
    CalculatorService calculatorService = new CalculatorService();

    @ParameterizedTest
    @MethodSource
    public void sumTest(int num1, int num2, int result) {
        assertEquals(result, calculatorService.sum(num1, num2));
    }

    private static Stream<Arguments> sumTest() {
        return Stream.of(
                Arguments.of(5, 5, 10),
                Arguments.of(0, 5, 5),
                Arguments.of(-2, -3, -5)
        );
    }


    @ParameterizedTest
    @MethodSource
    public void minusTest(int num1, int num2, int result) {
        assertEquals(result, calculatorService.minus(num1, num2));
    }

    private static Stream<Arguments> minusTest() {
        return Stream.of(
                Arguments.of(5, 5, 0),
                Arguments.of(-5, -5, 0),
                Arguments.of(0, -3, 3)
        );
    }

    @ParameterizedTest
    @MethodSource
    public void multiplyTest(int num1, int num2, int result) {
        assertEquals(result, calculatorService.multiply(num1, num2));
    }

    private static Stream<Arguments> multiplyTest() {
        return Stream.of(
                Arguments.of(5, 5, 25),
                Arguments.of(-5, 5, -25),
                Arguments.of(0, -3, 0)
        );
    }

    @ParameterizedTest
    @MethodSource
    public void divideTest(int num1, int num2, int result) {
        assertEquals(result, calculatorService.divide(num1, num2));
    }

    private static Stream<Arguments> divideTest() {
        return Stream.of(
                Arguments.of(5, 5, 1),
                Arguments.of(-25, 5, -5),
                Arguments.of(0, -3, 0)
        );
    }

}
