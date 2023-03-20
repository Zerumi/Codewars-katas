package _6_kyu;

import java.util.Arrays;

/**
 * _7_kyu.Kata #6 -- Decode the Morse code
 * 6 kyu
 * @see <a href="https://www.codewars.com/kata/54b724efac3d5402db00065e">...</a>
 * @author zerumi
 * @since 17/03/2023
 */
public class MorseCodeDecoder {

    static class MorseCode
    {
        public static String get(String key)
        {
            return "*";
        }
    }
    public static String decode(String morseCode) {
        return String.join(" ", Arrays.stream(morseCode.trim().split(" {3}")).map(str -> String.join("", Arrays.stream(str.split(" ")).map(code -> MorseCode.get(code) == null ? "" : MorseCode.get(code)).toArray(String[]::new))).toArray(String[]::new));
    }
}