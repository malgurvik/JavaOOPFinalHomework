package Calculator.Controller;

import Calculator.Model.CalculatingOperation;
import Calculator.View.Print;
import Calculator.View.UserInputNum;
import Calculator.View.UserInputOperator;

import java.util.Scanner;

public class Controller extends CalculatingOperation implements UserInputNum, UserInputOperator {
    private final Scanner scanner;
    Print print = new Print();

    public Controller() {
        this.scanner = new Scanner(System.in);
    }


    @Override
    public double inputNum1() {
        System.out.println("Введите первое число: ");
        return scanner.nextDouble();
    }

    @Override
    public double inputNum2() {
        System.out.println("Введите второе число: ");
        return scanner.nextDouble();
    }

    @Override
    public String inputOperator() {
        System.out.println("Введите оператор (+, -, *, /): ");
        return scanner.next();
    }
    @Override
    public double getResult() {
        return super.getResult(inputNum1(),inputOperator(), inputNum2());
    }

    public void printResult(){
        print.print(getResult());
    }

}
