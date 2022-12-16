import java.util.Random;

public class MerchantAndCarts {
    private final double loadCapacity = 600;//Грузоподъемность
    private final int speed = 3;// от одного до 5 лиг в день
    private  int money;//рандом
    private static Random random = new Random();

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public int getSpeed() {
        return speed;
    }

    public static int getMoney() {
        int money = random.nextInt(19991) + 1;
        return money;
    }
    public static void printMoney(){
        System.out.println(getMoney());
    }
}
