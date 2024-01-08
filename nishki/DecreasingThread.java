package nishki;

public class DecreasingThread extends Thread{
    @Override
    public void run() {
        synchronized(TestA.objects) {
            decrease();
        }
    }

    void decrease() {
        int i = 1000;
        while (i --> 0) {
            TestA.objects.get(0).decreaseValue();
            TestA.objects.get(1).decreaseValue();
        }
    }
}
