import java.math.BigInteger;

public class Ch1_6 {
    public static void main(String[] args) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= 1000; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        System.out.printf("1000! is: %d\n", result);
    }
}
