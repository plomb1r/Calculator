import java.util.Scanner;

public class Main {
    public static boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner console = new Scanner(System.in);
        int a;
        int b;
        var elements = console.nextLine().split("", 3);
        boolean isArabicNumbers = isInteger(elements[0]);
        if (isArabicNumbers) {
            a = Integer.parseInt(elements[0]);
            b = Integer.parseInt(elements[2]);
        } else {
            a = RomanNumbers.valueOf(elements[0]).getValue();
            b = RomanNumbers.valueOf(elements[2]).getValue();
        }
        if (a > 10 || a < 1 || b > 10 || b < 1) {
            throw new Exception("Числа принимаемые на вход больше 10 и не меньше 1");
        }
        var action = Operator.convert(elements[1]);
        int result = action.calculate(a, b);

        System.out.println(isArabicNumbers ? result : RomanNumbers.convertArabicNumber(result));
    }
}