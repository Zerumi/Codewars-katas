import _4_kyu.StripComments;
import _5_kyu.SecureTester;
import _6_kyu.ASum;
import _6_kyu.MorseCodeDecoder;
import _7_kyu.JadenCase;
import _7_kyu.Kata;

public class Main {
    public static void main(String[] args) {
        System.out.println(ASum.findNb(1071225));
        System.out.println(ASum.findNb(91716553919377L));
        System.out.println(ASum.findNb(55100L*55100*55101*55101/4));

        System.out.println(new JadenCase().toJadenCase(null));

        System.out.println(Kata.highAndLow("1 2 3 4 5"));
        System.out.println(Kata.highAndLow("1 -8 3 246354 5"));
        System.out.println(Kata.highAndLow("1"));

        System.out.println(SecureTester.alphanumeric("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"));
        System.out.println(SecureTester.alphanumeric(""));

        System.out.println(StripComments.stripComments( "apples, pears # and bananas\ngrapes\nbananas !apples", new String[] { "#", "!" }));
        System.out.println(StripComments.stripComments( "a #b\nc\nd $e f g", new String[] { "#", "$" }));
        System.out.println(StripComments.stripComments("a \n b \nc ", new String[] {"#", "$"}));

        System.out.println(MorseCodeDecoder.decode(".... . -.--   .--- ..- -.. ."));
    }
}