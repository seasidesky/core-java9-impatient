import java.util.Random;

public class Ch1_10 {
    public static void main(String[] args) {
        Random r = new Random(System.currentTimeMillis());
        long value = r.nextLong();
        System.out.println("" + value + " " + Long.toString(value, 36));
    }
}
