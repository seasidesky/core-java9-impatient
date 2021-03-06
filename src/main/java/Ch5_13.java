import java.util.Arrays;

public class Ch5_13 {
    public static int min(int[] values) {
        int smallest = values[0];
        for (int i : values) {
            if (i < smallest) {
                smallest = i;
            }
        }
        int finalSmallest = smallest;
        assert Arrays.stream(values).allMatch(i -> i >= finalSmallest);
        return finalSmallest;
    }
}
