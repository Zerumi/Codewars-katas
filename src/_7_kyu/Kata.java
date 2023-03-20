package _7_kyu;

import java.util.Arrays;
import java.util.Comparator;

/**
 * _7_kyu.Kata #3 -- Highest and Lowest
 * 7 kyu
 * @see <a href="https://www.codewars.com/kata/554b4ac871d6813a03000035">...</a>
 * @author zerumi
 * @since 17/03/2023
 */
public class Kata {
    public static String highAndLow(String numbers) {
        Integer[] converted = Arrays.stream(numbers.split(" ")).map(Integer::parseInt).toArray(Integer[]::new);
        return Arrays.stream(converted).max(Comparator.naturalOrder()).orElse(0) + " " + Arrays.stream(converted).min(Comparator.naturalOrder()).orElse(0);
    }
}