import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;
/**
 * Tdd training on 31.01.18.
 */
@RunWith(JUnitParamsRunner.class)

public class StringCalculatorTest {

    @Test
    public void shouldCreateObject() throws Exception {
        StringCalculator testedObject = new StringCalculator();
        assertThat(testedObject).isNotNull();
        assertThat(testedObject.Add("")).isEqualTo(0);
    }

    @Test
    public void shouldReturnOneWhenOnePassed() {
        StringCalculator testedObject = new StringCalculator();
        assertThat(testedObject).isNotNull();
        assertThat(testedObject.Add("1")).isEqualTo(1);
    }

    @Test
    public void shouldReturnTwoWhenOneAndOnePassed() {
        StringCalculator testedObject = new StringCalculator();
        assertThat(testedObject).isNotNull();
        assertThat(testedObject.Add("1,2")).isEqualTo(3);
    }

    private Object[][] numbersTab() {
        return new Object[][]{
                {"1",1},
                {"1,2",3},
                {"10,20",30},
                {"",0},
        };
    }

    @Test
    @Parameters(method = "numbersTab")
    public void shouldReturn(String input , int result) {
        StringCalculator testedObject = new StringCalculator();
        int addResult = testedObject.Add(input);
        assertThat(addResult).isEqualTo(result);
    }


}