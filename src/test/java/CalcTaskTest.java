import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class CalcTaskTest {

    private static final double DELTA = 1e-10;
    @Test
    public void getCalculatedResult() {
        ArrayList<CalcModel> calcModelArrayList = new ArrayList<>();
        calcModelArrayList.add(new CalcModel(4.2, 2));
        //calcModelArrayList.add(new CalcModel(2, "multiply"));
        //calcModelArrayList.add(new CalcModel(2, "divide"));
        CalcTask calcTask = new CalcTask(calcModelArrayList, 10);
        assertEquals(14.2, calcTask.getCalculatedResult(), DELTA);
    }
}