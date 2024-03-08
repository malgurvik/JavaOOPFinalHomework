package Calculator.Model;

public class Calculator {
    private Operations operations;

    public void calculatorOperation(Operations operations) {
        this.operations = operations;
    }
    public double calculate(double num1, double num2){
        return operations.calculateOperations(num1, num2);
    }
}
