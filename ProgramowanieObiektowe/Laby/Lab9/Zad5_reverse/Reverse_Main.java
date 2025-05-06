import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Reverse_Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();
        for(int i = 1; i <= 10; i++){
            numbers.add(i);
        }

        List<Integer> numbersReversed = new ArrayList<>();
        ListIterator<Integer> iterator = numbers.listIterator(numbers.size());
        while(iterator.hasPrevious()){
            numbersReversed.add(iterator.previous());
        }
        System.out.println(numbersReversed);
    }
}
