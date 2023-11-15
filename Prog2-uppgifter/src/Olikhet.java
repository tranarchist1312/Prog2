import java.util.Random;

public class Olikhet {
    public static void main(String[] args){
        int kontroll = 5;
        Random rand = new Random();
        int n = rand.nextInt(10);
        System.out.println(n);
        if (kontroll == n){
            System.out.println("lika");
        } else if (n < kontroll){
            System.out.println("mindre");
        } else if (n > kontroll){
            System.out.println("större");
        }
    }
}
