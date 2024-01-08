package nishki;

public class IncreasingThread extends Thread{
    @Override
    public void run() {
        synchronized(TestA.objects) {
            increase();
        }
    }

    void increase() {
        int i = 1000;
        while (i --> 0) {
            TestA.objects.get(0).increaseValue();
            TestA.objects.get(1).increaseValue();
        }
    }
}
