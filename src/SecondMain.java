import java.util.Random;

public class SecondMain {

    public static void main(String[] args) {
        Random rnd = new Random();
        boolean rnd1 = rnd.nextBoolean();
        System.out.println("Is it " + rnd1 + " or " + !rnd1 + "?");


    }
}

