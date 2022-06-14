/*
    Zadanie
    Dla przykładowych napisów wyznacz te, które posiadają w sobie
    więcej niż 3 cyfry.
*/

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.StringJoiner;

public class App {
    static int countDigits(String expression) {
        return expression == null || expression.isEmpty() ? 0 : expression.replaceAll("\\D+", "").length();
    }

    static String[] getExpressionsWithDigitsNumberGreaterThan(int limit, String[] expressions) {
        if (limit <= 0) {
            throw new IllegalArgumentException("Limit value must be positive");
        }

        var sj = new StringJoiner(" ");
        for (var expression : expressions) {
            if (countDigits(expression) > limit) {
                sj.add(expression);
            }
        }

        return sj.toString().split(" ");
    }
    public static void main(String[] args) {
        final var LIMIT = 3;
        var expressions = new String[] {"KM", "PROG123RA5MS", "2022", "KM22"};
        var expressions2 = getExpressionsWithDigitsNumberGreaterThan(LIMIT, expressions);
        System.out.println(Arrays.toString(expressions2));
    }
}
