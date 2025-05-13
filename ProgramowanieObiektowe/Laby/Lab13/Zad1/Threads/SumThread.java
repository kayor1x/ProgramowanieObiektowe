package Threads;

public class SumThread extends Thread {
    private int N;
    private int result = 0;
    public SumThread(int N) {
        this.N = N;
    }
    public void run() {
        for (int i = 1; i <= N; i++) {
            result += i;
        }
        System.out.println("Wątek 2 - Sum: " + result);
    }
}
