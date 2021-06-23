package repository;

public class CalculationRepositoryImpl implements CalculationRepository {
    @Override
    public double calculator(Integer num1, Integer num2, String operator) {
        double result = 0;
        switch (operator){
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + operator);
        }
        return result;
    }
}
