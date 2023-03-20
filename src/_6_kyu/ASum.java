package _6_kyu;

/**
 * _7_kyu.Kata #1 -- Build a pile of Cubes
 * 6 kyu
 * @see <a href="https://www.codewars.com/kata/5592e3bd57b64d00f3000047">...</a>
 * @author zerumi
 * @since 17/03/2023
 */
public class ASum {

    public static long findNb(long m) {
        // sum of cubes = n^2*(n+1)^2/4

        long tempres = 0;

        for (long i = 1; tempres < m; i++)
        {
            tempres = i*i*(i+1)*(i+1)/4;
            if (tempres == m)
            {
                return i;
            }
        }
        return -1;
    }

    // another solution
    private long testNb(long m)
    {
        long tempres = 0;

        for (long i = 1; tempres < m; i++)
        {
            tempres += i*i*i;

            if (tempres == m)
            {
                return i;
            }
        }

        return -1;
    }
}