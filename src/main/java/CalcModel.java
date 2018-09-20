public class CalcModel {

    final public static int UNKNOWN = 0;
    final public static int APPLY = 1;
    final public static int ADD = 2;
    final public static int SUBSTRACT = 3;
    final public static int MULTIPLY = 4;
    final public static int DIVIDE = 5;

    private double number;
    private int method;

    public CalcModel() {
    }

    public CalcModel(double number, String method) {
        this.number = number;
        this.method = parseMethod(method);
    }

    public CalcModel(double number, int method) {
        this.number = number;
        this.method = method;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(float number) {
        this.number = number;
    }

    public int getMethod() {
        return method;
    }

    public void setMethod(int method) {
        this.method = method;
    }


    private int parseMethod(String input) {
        int method;
        switch (input.toLowerCase()) {
            case "apply":
                method = APPLY;
                break;
            case "add":
                method = ADD;
                break;
            case "subtract":
                method = SUBSTRACT;
                break;
            case "multiply":
                method = MULTIPLY;
                break;
            case "divide":
                method = DIVIDE;
                break;
            default:
                method = UNKNOWN;
        }
        return method;
    }

    public String toString(){
        String s = "Method: " + this.method + " Number: " + this.number;
        return s;
    }
}
