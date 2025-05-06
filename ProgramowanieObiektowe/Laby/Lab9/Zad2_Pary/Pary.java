
import java.util.Iterator;
import java.util.LinkedList;

import java.util.Scanner;

public class Pary {
    static Scanner scanner = new Scanner(System.in);
    static String imie = null;
    static LinkedList<String> addImie(LinkedList<String> imiona) {
        imie = scanner.next();
        if(imie.equals("-")){
            return imiona;
        } else imiona.add(imie.toLowerCase());
        return imiona;
    }
    public static void main(String[] args) {
        LinkedList<String> imiona = new LinkedList<>();
        do {
            System.out.println("\nWpisz imie pierwszej osoby:");
            addImie(imiona);
            if(imie.equals("-")) break;
            System.out.println("\nWpisz imie drugiej osoby:");
            addImie(imiona);
        } while(!imie.equals("-"));
        Iterator<String> imionaIterator = imiona.iterator();
        while(imionaIterator.hasNext()){
            System.out.print(imionaIterator.next() + ", ");
        }
        System.out.println("\nPodaj imie zeby znalezc pare: " );
        imie = scanner.next();
        for(String member : imiona){
            if(member.equalsIgnoreCase(imie)){
                double index = imiona.indexOf(member);
                if(index%2 == 0) {
                    try{
                        System.out.println("Twoim partnerem jest " + imiona.get((int) index + 1));
                    } catch (IndexOutOfBoundsException e) {System.out.println("Nie wpisales pary!");}
                    } else{
                    System.out.println("Twoim partnerem jest " + imiona.get((int)index-1));
                }
            } else {
                System.out.println("Niepoprawne imie!");
            }
        }
    }
}
