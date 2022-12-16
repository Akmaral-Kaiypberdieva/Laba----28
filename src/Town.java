import java.util.Random;

public enum Town {
    TOWN_A,
    TOWN_B,
    TOWN_C,
    TOWN_D,
    TOWN_E;

    public static Town getRandom() {
        return values()[(int) (Math.random() * values().length)];
    }
    public static void printTown(){
        Random random = new Random();
        int league = random.nextInt(49) + 50;
        System.out.println(Town.getRandom() + "Расстояние: " + league);
    }
}
