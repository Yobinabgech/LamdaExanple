package Lambda;

import java.util.ArrayList;
import java.util.Arrays;

public class LambdaArray {

    public static void main(String[] args) {

        ArrayList<Integer> a = new ArrayList<>();
        a.add(20);
        a.add(15);
        a.add(10);
        a.add(5);

        a.forEach(X-> System.out.println(X));
        a.forEach(X-> {if (X % 2 != 0) System.out.println(X);});
        a.forEach(X-> { if (X % 2 == 0)System.out.println(X);});

    }

}
