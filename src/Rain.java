public class Rain implements Eventble{
    TownClass townClass = new TownClass();
    MerchantAndCart merchantAndCart = Simulator.merchantAndCart;

    @Override
    public void doAction(MerchantAndCart merchantAndCart) {
        System.out.println("Дождь");
        merchantAndCart.getTown().setDistance(merchantAndCart.getTown().getDistance() - (merchantAndCart.getSpeed() - 2));
        System.out.println("Скорость телеги понизилась на 2 лиги в день");
    }
}
