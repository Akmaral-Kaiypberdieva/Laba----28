public class MetLocal implements Eventble{

    @Override
    public void doAction(MerchantAndCart merchantAndCart) {
        System.out.println("Встретил местного");
         merchantAndCart.getTown().setDistance(merchantAndCart.getTown().getDistance() - (merchantAndCart.getSpeed() + 3));
        System.out.println("Сокраил путь");
    }
}
