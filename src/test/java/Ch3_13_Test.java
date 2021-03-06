import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Ch3_13_Test {
    private static File[] expected;

    @BeforeAll
    public static void setup() {
        try {
            expected = new File[]{
                    Files.createTempDirectory("a").toFile(),
                    Files.createTempDirectory("z").toFile(),
                    Files.createTempFile("a", "tmp").toFile(),
                    Files.createTempFile("m", "tmp").toFile(),
                    Files.createTempFile("x", "tmp").toFile()
            };
        } catch (IOException ioe) {
        }
    }

    @AfterAll
    public static void teardown() {
        for (File f : expected) {
            try {
                Files.deleteIfExists(f.toPath());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void testFileSort() {
        File[] input = new File[]{
                expected[4], expected[2], expected[0], expected[1], expected[3]
        };
        Ch3_13.sortFiles(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testFileSortDifferentOrder() {
        File[] input = new File[]{
                expected[0], expected[1], expected[2], expected[4], expected[3]
        };
        Ch3_13.sortFiles(input);
        assertArrayEquals(expected, input);
    }
}
