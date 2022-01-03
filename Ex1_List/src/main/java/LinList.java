import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class LinList {
    int methodAddAtEnd(int X)
    {
        System.out.println("LinkedList: (add on begining)");
        Random rand = new Random();

        List<Integer> linkedList = new LinkedList<Integer>();
        for(int i=0;i<X;i++){
            int random = rand.nextInt(9999);
            linkedList.add(random);
        }
        System.out.println(linkedList);
        return 0;
    }
    boolean methodAddOnBeg(int X){
        System.out.println("LinkedList: (add on begining)");
        Random rand = new Random();
        List<Integer> linkedList = new LinkedList<Integer>();

        for (int i = 0; i < X; i++) {
            int random = rand.nextInt(9999);
            linkedList.add(0,random);
        }
        System.out.println(linkedList);
        return true;
    }
    boolean methodAddOnBegRandom(int X){
        System.out.println("LinkedList: (add on random index)");
        Random rand = new Random();
        List<Integer> linkedList = new LinkedList<Integer>();
        for (int i = 0; i < X; i++) {
            int random = rand.nextInt(9999);
            int random_index = rand.nextInt(X-1); //nie dzialalo z .size-1
            linkedList.add(0,random);
        }
        System.out.println(linkedList);
        return true;
    }
}
