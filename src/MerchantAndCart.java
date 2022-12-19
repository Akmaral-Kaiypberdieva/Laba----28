import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MerchantAndCart {
    private static Random random = new Random();
    private int capacity;
    private  int speed;
    private int money;
    private TownClass town;
    private Eventble eventble;

    public void doAction() {
        eventble.doAction(this);
    }

    private List<Product> listOfProduct = new ArrayList<>();

    public MerchantAndCart(int capacity, int money,int speed) {
        this.capacity = capacity;
        this.money = money;
        this.speed = speed;
    }

    public MerchantAndCart(TownClass town) {
        this.town = getTown();
    }

    public static Random getRandom() {
        return random;
    }

    public static void setRandom(Random random) {
        MerchantAndCart.random = random;
    }

    public int getCapacity() {
        return capacity;
    }

    public int setCapacity(int capacity) {
        this.capacity = capacity;
        return capacity;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getMoney() {
        return money;
    }

    public int setMoney(int money) {
        this.money = money;
        return money;
    }

    public TownClass getTown() {
        return town;
    }

    public void setTown(TownClass town) {
        this.town = town;
    }

    public Eventble getEventble() {
        return eventble;
    }

    public void setEventble(Eventble eventble) {
        this.eventble = eventble;
    }

    public List<Product> getListOfProduct() {
        return listOfProduct;
    }

    public void setListOfProduct(List<Product> listOfProduct) {
        this.listOfProduct = listOfProduct;
    }
}