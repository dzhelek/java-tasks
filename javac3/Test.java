package javac3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        System.out.println("hello");
        var f1 = new Foo("portokala");
        var f2 = new Foo("alabala");
        var f3 = new Foo("alrbala");
        List<Foo> f = new ArrayList<Foo>();
        f.add(f1);
        f.add(f2);
        f.add(f3);
        Collections.sort(f, new FooComparatorByBar());
        for (Foo i : f) {
            System.out.println(i.getBar());
        }
    }
}

class Foo {
    String bar;
    Foo(String bar) {
        this.bar = bar;
    }
    public String getBar() {
        return bar;
    }
}

class FooComparatorByBar implements Comparator<Foo> {
    public int compare(Foo x, Foo y) {
        // TODO: Handle null values of x, y, x.getBar() and y.getBar(),
        // and consider non-ordinal orderings.
        return x.getBar().compareTo(y.getBar());
    }
}
