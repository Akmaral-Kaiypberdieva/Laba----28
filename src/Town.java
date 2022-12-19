import java.util.Random;
public enum Town {
    Paris,
    Marseilles,
    Lyon,
    Toulouse,
    Nantes,
    Strasbourg,
    Montpellier;

    public static Town getRandom() {
        return values()[(int) (Math.random() * values().length)];
    }
}
