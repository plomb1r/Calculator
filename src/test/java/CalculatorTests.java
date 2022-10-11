import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTests {
    @Test
    public void convertArabicNumberTest() throws Exception {
        int testInt = 4;
        String result = RomanNumbers.convertArabicNumber(testInt);
        assertThat(result).isEqualTo("IV");
    }
    @Test
    public void isIntegerAndArabicNumbersTest() throws Exception {
       boolean integerValue = Main.isInteger("1");
       boolean success = true;
       assertThat(integerValue).isEqualTo(success);
    }
    @Test
    public void isIntegerAndRomanNumbersTest() throws Exception {
        boolean integerValue = Main.isInteger("IV");
        boolean success = false;
        assertThat(integerValue).isEqualTo(success);
    }
    @Test
    public void calculateArabicNumbers() throws Exception {
        var addition = Operator.convert("+").calculate(4,3);
        assertThat(addition).isEqualTo(7);
        var subtraction = Operator.convert("-").calculate(4,3);
        assertThat(subtraction).isEqualTo(1);
        var multiplication = Operator.convert("*").calculate(4,3);
        assertThat(multiplication).isEqualTo(12);
        var division = Operator.convert("/").calculate(4,3);
        assertThat(division).isEqualTo(1);
    }
    @Test
    public void calculateAdditionRomanNumbers() throws Exception {
        int a = 5;
        int b = 3;
        String aToRoman = RomanNumbers.convertArabicNumber(a);
        String bToRoman = RomanNumbers.convertArabicNumber(b);
        String resultAddition = RomanNumbers.convertArabicNumber(a) + RomanNumbers.convertArabicNumber(b);
        assertThat(resultAddition).isEqualTo("VIII");
    }
}
