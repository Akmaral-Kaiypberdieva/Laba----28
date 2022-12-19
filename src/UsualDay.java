public class UsualDay implements Eventble{
    @Override
    public void doAction(MerchantAndCart merchantAndCart) {

        System.out.println("Обычноый день");
        merchantAndCart.getTown().setDistance(merchantAndCart.getTown().getDistance() - merchantAndCart.getSpeed());
    }
}
