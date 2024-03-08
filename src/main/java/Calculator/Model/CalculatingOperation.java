package Calculator.Model;

import java.util.logging.*;

public abstract class CalculatingOperation {
    Calculator calculator = new Calculator();
    Logger logger = Logger.getLogger(CalculatingOperation.class.getName());
    private double result;


    public abstract double getResult();

    public double getResult(double num1, String operator, double num2) {
        switch (operator) {
            case "+":
                calculator.calculatorOperation(new Addition());
                this.result = calculator.calculate(num1, num2);
                logger.info("Сложение чисел " + num1 + " и " + num2);
                break;
            case "-":
                calculator.calculatorOperation(new Subtraction());
                this.result = calculator.calculate(num1, num2);
                logger.info("Вычитание из числа " + num1 + " числа " + num2);
                break;
            case "*":
                calculator.calculatorOperation(new Multiplication());
                this.result = calculator.calculate(num1, num2);
                logger.info("Умножение чисел " + num1 + " и " + num2);
                break;
            case "/":
                calculator.calculatorOperation(new Divide());
                this.result = calculator.calculate(num1, num2);
                logger.info("Деление числа "+num1 + " на " + num2);
                break;
        }
        return this.result;
    }
}

