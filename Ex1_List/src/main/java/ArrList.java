import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ArrList {
    int methodAddAtEnd(int X) {
        System.out.println("ArrayList: (add at the end)");
        Random rand = new Random();
        List<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 0; i < X; i++) {
            int random = rand.nextInt(9999);
            arrayList.add(random);
        }
        System.out.println(arrayList);
    return 0;
    }
    boolean methodAddOnBeg(int X){
        System.out.println("ArrayList: (add on begining)");
        Random rand = new Random();
        List<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 0; i < X; i++) {
            int random = rand.nextInt(9999);
            arrayList.add(0,random);
        }
        System.out.println(arrayList);
        return true;
    }
    boolean methodAddOnBegRandom(int X){
        System.out.println("ArrayList: (add on random index)");
        Random rand = new Random();
        List<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 0; i < X; i++) {
            int random = rand.nextInt(9999);
            int random_index = rand.nextInt(X-1); //nie dzialalo z .size-1
            arrayList.add(0,random);
        }
        System.out.println(arrayList);
        return true;
    }
}
