import java.util.*;

public class MainClass {


    public static void main(String[] args) {
        int X= 10;
        ArrList arrList = new ArrList();
        arrList.methodAddAtEnd(X);

        Rodzic newarrlist = new Rodzic();
        //newarrlist.methodObject();



        //  arrList.methodAddOnBeg(X);
        //arrList.methodAddOnBegRandom(X);

        LinList linList = new LinList();
        linList.methodAddAtEnd(X);
        // linList.methodAddOnBeg(X);
        // linList.methodAddOnBegRandom(X);

        HashSe hashSe = new HashSe();
          hashSe.methodAddAtEnd(X);

    }
}