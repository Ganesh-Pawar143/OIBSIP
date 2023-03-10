import java.util.Random;

public class NumberGenerator {
    private Random random;

    public NumberGenerator() {
        random = new Random();
    }

    public int generateNumber(int range) {
        return random.nextInt(range) + 1;
    }
}
