import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by aleksandr on 08.09.2015.
 */
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.sorted();
    }

    private void sorted() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Zad");
        arrayList.add("Hello");
        arrayList.add("Private");
        arrayList.add("GL");
        arrayList.add("workInGL");
        Collections.sort(arrayList);
        for (String n : arrayList)
            System.out.println(n);
    }
}

