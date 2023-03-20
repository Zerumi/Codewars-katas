package _5_kyu;

import java.util.regex.Pattern;

/**
 * _7_kyu.Kata #4 -- Not very secure
 * 5 kyu
 * @see <a href="https://www.codewars.com/kata/526dbd6c8c0eb53254000110">...</a>
 * @author zerumi
 * @since 17/03/2023
 */
public class SecureTester {
    public static boolean alphanumeric(String s)
    {
        return s.length() > 0 && Pattern.compile("[a-z]|[A-Z]|[0-9]").matcher(s).results().count() == s.length();
    }
}
