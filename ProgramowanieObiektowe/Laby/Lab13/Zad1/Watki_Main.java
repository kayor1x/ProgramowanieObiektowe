import Threads.FactorialThread;
import Threads.SumThread;

import java.util.Scanner;

public class Watki_Main {
    static public void main(String[] args) {
        System.out.println("Wpisz N: ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        FactorialThread fac = new FactorialThread(N);
        SumThread sum = new SumThread(N);
        try{
            sum.join();
            fac.join();

        } catch(InterruptedException e){
            e.printStackTrace();
        }
        fac.start();
        sum.start();
    }
}
