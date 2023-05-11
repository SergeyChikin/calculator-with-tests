package pro.sky.calculatorwithtests.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.calculatorwithtests.service.CalculatorService;

@RestController
@RequestMapping("/calculator")

public class CalculatorController {


    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String greeting() {
        return "<b>Добро пожаловать в калькулятор!</b>";
    }

    @GetMapping(path = "/plus")
    public String plus(@RequestParam(required = false) String num1, @RequestParam(required = false) String num2) {
        return num1 + " + " + num2 + " = " + calculatorService.sum(Integer.parseInt(num1), Integer.parseInt(num2));
    }

    @GetMapping(path = "/minus")
    public String minus(@RequestParam(required = false) String num1, @RequestParam(required = false) String num2) {
        return num1 + " - " + num2 + " = " + calculatorService.minus(Integer.parseInt(num1), Integer.parseInt(num2));
    }

    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam(required = false) String num1, @RequestParam(required = false) String num2) {
        return num1 + " * " + num2 + " = " + calculatorService.multiply(Integer.parseInt(num1), Integer.parseInt(num2));
    }

    @GetMapping(path = "/divide")
    public String divide(@RequestParam(required = false) String num1, @RequestParam(required = false) String num2) {
        return num1 + " / " + num2 + " = " + calculatorService.divide(Integer.parseInt(num1), Integer.parseInt(num2));
    }
}
