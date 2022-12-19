import java.util.*;
import java.util.Arrays;
import java.util.Collections;
public class Simulator {

           static Random random = new Random();
    static MerchantAndCart merchantAndCart = new MerchantAndCart(600, 1500,3);
    public static int printProduct(){
        int league = random.nextInt(200) + 500;
        System.out.println(Product.getRandom() + " Цена: " + league);
        return league;
    }

    public static int weightProduct() {
        int productWeight = random.nextInt(300) + 100;
        System.out.println("Вес продукта " + productWeight);
        return productWeight;
    }


    public static void fillTheCart() {
        ProductDetail productDetail = new ProductDetail();
        List<Product> listOfProducts = new ArrayList<>();
        while (true){
            listOfProducts.add(Product.getRandom());
            System.out.println(listOfProducts);

            System.out.println("Текущее колличество денег " + merchantAndCart.getMoney());
            int remainingMoney = merchantAndCart.setMoney(merchantAndCart.getMoney() - printProduct());
            System.out.println("Текущее состояние телеги " + merchantAndCart.getCapacity());
            int remainingWeight = merchantAndCart.setCapacity(merchantAndCart.getCapacity() - weightProduct());
            System.out.println("+++++++++++++++++++++++++++++++++++");
            if(remainingMoney <= 0) {
                System.out.println("Денег не осталось, отправляемся в путь ");
                System.out.println("+++++++++++++++++++++++++++++++++++");
                break;
            }else if(remainingWeight <= 0){
                System.out.println("Телега полная, отправляемся в путь");
                System.out.println("+++++++++++++++++++++++++++++++++++");
                break;
            }
        }
    }

}