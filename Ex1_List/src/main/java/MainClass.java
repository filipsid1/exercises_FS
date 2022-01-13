import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainClass {
    public static void main(String[] args) {
        int X= 20000;
            ArrList arrList = new ArrList();
            arrList.methodAddAtEnd(X);
            //arrList.methodAddOnBeg(X);
           // arrList.methodAddOnBegRandom(X);

            LinList linList = new LinList();
            linList.methodAddAtEnd(X);
            //linList.methodAddOnBeg(X);
            //linList.methodAddOnBegRandom(X);

            HashSe hashSe = new HashSe();
            hashSe.methodAddAtEnd(X);

    }
}