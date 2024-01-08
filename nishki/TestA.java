package nishki;

import java.util.ArrayList;
import java.util.List;

public class TestA {
    static List<ImportantObject> objects = new ArrayList<>();
    public static void main(String[] args) throws InterruptedException {
        objects.add(new ImportantObject(-1000));
        objects.add(new ImportantObject(1000));
        var t1 = new IncreasingThread();
        var t2 = new DecreasingThread();

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(objects.get(0).value);
        System.out.println(objects.get(1).value);
    }
}
