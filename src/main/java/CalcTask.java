import java.util.ArrayList;

public class CalcTask {

    private ArrayList<CalcModel> calcModelArrayList;
    private double firstNo;
    private double calculatedResult;

    public double getCalculatedResult() {
        return calculatedResult;
    }

    public CalcTask() {
    }

    public CalcTask(ArrayList<CalcModel> calcModelLinkedList, double firstNo) {
        this.calcModelArrayList = calcModelLinkedList;
        this.firstNo = firstNo;
        calculatedResult = calculateResult();
    }

    private double add(double number0, double number1){
        return number0 + number1;
    }

    private double subtract(double number0, double number1){
        return number0 - number1;
    }

    private double multiply(double number0, double number1){
        return number0 * number1;
    }

    private double divide(double number0, double number1){
        if(number1 == 0){
            throw new IllegalArgumentException("Cannot divide by 0");
        } else {
            return number0 / number1;
        }
    }

    private double calculateResult(){
        double result = firstNo;
        for(CalcModel calcModel : calcModelArrayList){
            switch(calcModel.getMethod()){
                case CalcModel.ADD:
                    result = add(result, calcModel.getNumber());
                    break;
                case CalcModel.SUBSTRACT:
                    result = subtract(result, calcModel.getNumber());
                    break;
                case CalcModel.MULTIPLY:
                    result = multiply(result, calcModel.getNumber());
                    break;
                case CalcModel.DIVIDE:
                    result = divide(result, calcModel.getNumber());
                    break;
            }
        }
        return result;
    }
}
