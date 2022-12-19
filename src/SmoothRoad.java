public class SmoothRoad implements Eventble{
    TownClass townClass = new TownClass();
    MerchantAndCart merchantAndCart = Simulator.merchantAndCart;
    @Override
    public void doAction(MerchantAndCart merchantAndCart) {
        System.out.println("Ровная дорога");
        merchantAndCart.getTown().setDistance(merchantAndCart.getTown().getDistance() - (merchantAndCart.getSpeed() + 2));
        System.out.println("Скорость телеги повысилась на 2 лиги в день");
    }
}
