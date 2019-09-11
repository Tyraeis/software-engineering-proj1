import java.util.Random;

import static spark.Spark.*;

public class Main {
    private static int RANDOM_MIN = 1;
    private static int RANDOM_MAX = 1000000;

    private static Random rng = new Random();

    private static int getRandomNumber() {
        return RANDOM_MIN + rng.nextInt(RANDOM_MAX - RANDOM_MIN + 1);
    }

    public static void main(String[] argv) {
        port(8081);
        get("/", (req, res) -> Integer.toString(getRandomNumber()));
    }
}
