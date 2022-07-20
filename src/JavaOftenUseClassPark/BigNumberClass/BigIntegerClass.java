package JavaOftenUseClassPark.BigNumberClass;

import java.math.BigInteger;

public class BigIntegerClass {
    public static void main(String[] args) {
        BigInteger bi1 = new BigInteger("123456789");
        BigInteger bi2 = new BigInteger("987654321");

        System.out.println(bi2.add(bi1));
        System.out.println(bi2.subtract(bi1));
        System.out.println(bi2.multiply(bi1));
        System.out.println(bi2.divide(bi1));

        BigInteger[] result=bi2.divideAndRemainder(bi1);
        System.out.println("商:"+result[0]+"\t"+"余数是:"+result[1]);
    }
}
