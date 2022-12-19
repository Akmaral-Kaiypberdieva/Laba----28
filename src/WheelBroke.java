public class WheelBroke implements Eventble{
    @Override
    public void doAction(MerchantAndCart merchantAndCart) {
        System.out.println("Сломалось колесо! стоим на месте");
    }
}
