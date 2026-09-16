package com.example.calculator_server;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @GetMapping("/calculate")
    public String calculate(
            @RequestParam double a,
            @RequestParam double b,
            @RequestParam String operation) {

        double result;

        switch (operation) {
            case "add":
                result = a + b;
                break;

            case "subtract":
                result = a - b;
                break;

            case "multiply":
                result = a * b;
                break;

            case "divide":
                if (b == 0) {
                    return "Cannot divide by zero";
                }
                result = a / b;
                break;

            default:
                return "Invalid operation";
        }

        return "Result: " + result;
    }
}

    
