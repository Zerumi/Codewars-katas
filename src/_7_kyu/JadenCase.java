package _7_kyu;

import java.util.regex.Pattern;

/**
 * _7_kyu.Kata #2 -- Jaden Case
 * 7 kyu
 * @see <a href="https://www.codewars.com/kata/526dbd6c8c0eb53254000110">...</a>
 * @author zerumi
 * @since 17/03/2023
 */
public class JadenCase {

    public String toJadenCase(String phrase) {
        return (phrase == null || phrase.isBlank()) ? null : Pattern.compile("(?<=\\s|^).").matcher(phrase).replaceAll(x -> x.group().toUpperCase());
    }

}