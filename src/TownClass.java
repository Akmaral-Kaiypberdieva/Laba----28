import java.util.Random;

public class TownClass {
    private Town town;
    private int distance;

    public TownClass() {
        this.town = Town.getRandom();
        this.distance = getDistance2();
    }

    public Town getTown() {
          return town;
     }



     public void setTown(Town town) {
          this.town = town;
     }

    public int getDistance() {
        return distance;
    }

    public int getDistance2() {
          Random random = new Random();
          int league = random.nextInt(49) + 50;
          System.out.println(Town.getRandom() + " Расстояние: " + league);
          return league;
     }

     public void setDistance(int distance) {
          this.distance = distance;
     }
}
