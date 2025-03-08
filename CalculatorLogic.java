public class CalculatorLogic {
    private double num1, num2;
    private String operator;

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String calculate() {
        double result = 0;
        switch (operator) {
            case "+": result = num1 + num2; break;
            case "-": result = num1 - num2; break;
            case "*": result = num1 * num2; break;
            case "/": result = num2 != 0 ? num1 / num2 : 0; break;
            default: result = 0; break;
        }

        if (result == (int) result) {
            return String.valueOf((int) result); 
        } else {
            return String.valueOf(result);
        }
    }

    public void reset() {
        num1 = num2 = 0;
        operator = "";
    }

    public String toggleSign(String number) {
        double num = Double.parseDouble(number);
        num *= -1;
        return String.valueOf(num);
    }

    public String calculateSquareRoot(String number) {
        double num = Double.parseDouble(number);
        if (num >= 0) {
            return String.valueOf(Math.sqrt(num));
        } else {
            return "Error"; 
        }
    }
}