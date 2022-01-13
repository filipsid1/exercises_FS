import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

    public class HashSe {
            int methodAddAtEnd(int X) {
                System.out.println("HashSet: ");
                Random rand = new Random();
                HashSet hashSet = new HashSet();
                long start = System.nanoTime();
                for (int i = 0; i < X; i++) {
                    int random = rand.nextInt(9999);
                    hashSet.add(random);
                }
                long elapsedNanos = System.nanoTime() - start;
                //System.out.println(hashSet);
                System.out.println(elapsedNanos);
               return 0;

            }
    }


