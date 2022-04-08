package interview;

import java.math.BigInteger;

public class QuestionThree {
    public static String g(String str) {
        int i = 0;
        char[] arrStr = str.toCharArray();
        StringBuilder new_str = new StringBuilder();

        while (i < arrStr.length - 1) {
            new_str.append(arrStr[i + 1]);
            i = i + 1;
        }
        return new_str.toString();
    }

    public static String f(String str) {
        char[] arrStr = str.toCharArray();

        if (arrStr.length == 0) {
            return "";
        } else if (arrStr.length == 1) {
            return str;
        }
        return f(g(str)) + arrStr[0];
    }

    public static String h(long n, String str) {
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3*n + 1;
            }
            str = f(str);
        }
        return str;
    }

    public static String h(BigInteger n, String str) {
        while (!n.equals(BigInteger.valueOf(1))) {
            if (n.mod(BigInteger.valueOf(2)).equals(BigInteger.valueOf(0))) {
                n = n.divide(BigInteger.valueOf(2));
            } else {
                n = n.multiply(BigInteger.valueOf(3)).add(BigInteger.ONE);
            }
            str = f(str);
        }
        return str;
    }

    public static BigInteger pow(int x, BigInteger y) {
        if (y.equals(new BigInteger("0"))) {
            return BigInteger.ONE;
        } else {
            return BigInteger.valueOf(x).multiply(pow(x, y.subtract(BigInteger.ONE)));
        }
    }

    public static void main(String[] args) {
        System.out.print(h(1, "fruits"));
        System.out.print(h(2, "fruits"));
        System.out.print(h(5, "fruits"));
        System.out.print(h(pow(2, BigInteger.valueOf(1000000000000000l)), "fruits"));
        System.out.print(h(pow(2, BigInteger.valueOf(9831050005000007l)), "fruits"));
    }
}

