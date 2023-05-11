package pro.sky.calculatorwithtests.service;

import org.springframework.stereotype.Service;
import pro.sky.calculatorwithtests.exeption.InvalidValueException;

@Service
public class CalculatorService {
    public int sum(int num1, int num2) {
        return num1 + num2;
    }

    public int minus(int num1, int num2) {
        return num1 - num2;
    }

    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public double divide(int num1, int num2) throws IllegalArgumentException {
           if (num2 == 0 ) {
           throw new InvalidValueException("НА НОЛЬ ДЕЛИТЬ НЕЛЬЗЯ!!!");
        }
        return num1 / num2;
    }

}
