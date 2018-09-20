import org.junit.Test;

import static org.junit.Assert.*;

public class CalcTest {

    private static final double DELTA = 1e-10;

    @Test
    public void parser() {
        CalcModel cModel0 = Calc.parser("apply 3.1");
        assertEquals(3.1, cModel0.getNumber(), DELTA);
        assertEquals(cModel0.getMethod(), CalcModel.APPLY);
        CalcModel cModel1 = Calc.parser("divide 3.53");
        assertEquals(3.53, cModel1.getNumber(), DELTA);
        assertEquals(cModel1.getMethod(), CalcModel.DIVIDE);
        CalcModel cModel2 = Calc.parser("add 3.3");
        assertEquals(3.3, cModel2.getNumber(), DELTA);
        assertEquals(cModel2.getMethod(), CalcModel.ADD);

    }
}