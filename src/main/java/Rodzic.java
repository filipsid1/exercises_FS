import java.util.Collection;
import java.util.Random;

public class Rodzic {
    void methodObject(Collection collection,int X){
        Random rand = new Random();
        long start = System.nanoTime();
        for (int i = 0; i < X; i++) {
            int random = rand.nextInt(9999);
            collection.add(random);
        }
        long elapsedNanos = System.nanoTime() - start;
        System.out.println(collection);
        System.out.println(elapsedNanos);
    }
}
