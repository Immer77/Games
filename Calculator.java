public class Calculator {
    private char operator;
    private double firstNumberInput;
    private double secondNumberInput;

    public Calculator(double firstNumberInput, double secondNumberInput){
        this.firstNumberInput = firstNumberInput;
        this.secondNumberInput = secondNumberInput;
    }

    public void getResult(char operator){
        switch (operator) {
            case '+' -> System.out.println(firstNumberInput + secondNumberInput);
            case '-' -> System.out.println(firstNumberInput - secondNumberInput);
            case '*' -> System.out.println(firstNumberInput * secondNumberInput);
            case '/' -> System.out.println(firstNumberInput / secondNumberInput);
            case '%' -> System.out.println(firstNumberInput % secondNumberInput);
        }
    }
}
