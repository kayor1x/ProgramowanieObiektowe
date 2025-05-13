package Threads;

public class FactorialThread extends Thread {
    private int N;
    private int result = 1;
    public FactorialThread(int N) {
        this.N = N;
    }
    public void run() {
        for (int i = 1; i <= N; i++) {
            result *= i;
        }
        System.out.println("Wątek 1 - Factorial of " + N + ": " + result);
    }
}
