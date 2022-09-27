import com.example.generators.RandomStringGenerator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RandomStringGeneratorTest {

    @Test
    public void generateRandomString() {
        // when
        String len1 = RandomStringGenerator.generateRandomString(1);
        String len99 = RandomStringGenerator.generateRandomString(99);

        // then
        Assertions.assertEquals(1, len1.length());
        Assertions.assertEquals(99, len99.length());
    }
}
