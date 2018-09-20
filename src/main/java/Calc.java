import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calc {
    public static void main(String[] args) {
        boolean stop = false;
        ArrayList<CalcModel> calcModelArrayList = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(!stop) {
            try {
                String input = br.readLine();
                CalcModel calc = parser(input);
                if (calc.getMethod() == CalcModel.APPLY){
                    stop = true;
                    CalcTask calcTask = new CalcTask(calcModelArrayList, calc.getNumber());
                    double result = calcTask.getCalculatedResult();
                    System.out.println(result);
                } else {
                    calcModelArrayList.add(calc);
                }
                //System.out.println(calc.toString());
            } catch (IOException e) {
                e.printStackTrace();
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            }
        }
    }

    public static CalcModel parser(String input){
        Pattern pattern = Pattern.compile("(apply|add|subtract|multiply|divide)\\s+([-+]?\\d*\\.?\\d*)", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(input);
        if (matcher.find()) {
            return new CalcModel(Double.parseDouble(matcher.group(2)), matcher.group(1));
        } else {
            throw new IllegalArgumentException("Pattern not found");
        }
    }
}
