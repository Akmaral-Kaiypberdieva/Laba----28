import java.util.Random;

public class EventClass {
    static TownClass townClass = new TownClass();
    static MerchantAndCart merchantAndCart = Simulator.merchantAndCart;
    static  Simulator simulator = new Simulator();
    public static void hitTheRoad() {
        Random rnd = new Random();
        int randomEvent = rnd.nextInt(9) + 1;
        Eventble usualDay = new UsualDay();
        Eventble rain = new Rain();
        Eventble smoothRoad = new SmoothRoad();
        Eventble wheelBroke = new WheelBroke();
        Eventble river = new River();
        Eventble metLocal = new MetLocal();
        Eventble bigRoadRogues  = new BigRoadRogues();
        Eventble roadsideInn = new RoadsideInn();
        Eventble itemIsBroken = new ItemIsBroken();


        switch (randomEvent) {
            case 1:
                usualDay.doAction(merchantAndCart);
                break;
            case 2:
                rain.doAction(merchantAndCart);
                break;
            case 3:
                smoothRoad.doAction(merchantAndCart);
                break;
            case 4:
                wheelBroke.doAction(merchantAndCart);
                break;
            case 5:
                river.doAction(merchantAndCart);
                break;
            case 6:
                metLocal.doAction(merchantAndCart);
                break;
            case 7:
                bigRoadRogues.doAction(merchantAndCart);
                break;
            case 8:
                roadsideInn.doAction(merchantAndCart);
                break;
            case 9:
                itemIsBroken.doAction(merchantAndCart);
                break;
            default:
                System.out.println("День закончился");
        }
    }


    public static void isWayOfHuman() {
        Simulator.fillTheCart();
       do{
            hitTheRoad();
       } while(townClass.getDistance() >= 0);
    }

}