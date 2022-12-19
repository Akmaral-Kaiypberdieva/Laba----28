import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ProductDetail {
    static Random rnd = new Random();
    private int weight;
    private Product product;
    private QualityProduct qualityProduct;
    private int price;

    public static Random getRnd() {
        return rnd;
    }

    public static void setRnd(Random rnd) {
        ProductDetail.rnd = rnd;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public QualityProduct getQualityProduct() {
        return qualityProduct;
    }

    public void setQualityProduct(QualityProduct qualityProduct) {
        this.qualityProduct = qualityProduct;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}