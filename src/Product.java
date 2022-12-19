import java.util.Random;

public enum Product {
    MEAT,
    DRIED,
    FRUITS,
    GRAIN,
    FLOUR,
    FABRICS,
    PAINT;

    public static Product getRandom() {
        return values()[(int) (Math.random() * values().length)];
    }

}
