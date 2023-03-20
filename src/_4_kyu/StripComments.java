package _4_kyu;

import java.util.regex.Pattern;

/**
 * _7_kyu.Kata #5 -- Strip Comments
 * 4 kyu
 * @see <a href="https://www.codewars.com/kata/51c8e37cee245da6b40000bd">...</a>
 * @author zerumi
 * @since 17/03/2023
 */
public class StripComments {

    public static String stripComments(String text, String[] commentSymbols) {
        for (String symbol : commentSymbols) {
            Pattern toRemove = Pattern.compile(" *" + Pattern.quote(symbol) + ".*| +$", Pattern.MULTILINE);
            text = toRemove.matcher(text).replaceAll(value -> "");
        }
        return text;
    }
}
