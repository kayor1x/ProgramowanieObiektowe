import java.util.ArrayList;
import java.util.List;

public class Wydarzenie_Main {


    public static void main(String[] args) {
        Uczestniki wszyscy = new Uczestniki();
        Uczestnik u1 = new Uczestnik(1,"Jan", 19);
        Uczestnik u2 = new Uczestnik(2, "Zheka", 17);
        Uczestnik u3 = new Uczestnik(3,"Kyle", 18);

        wszyscy.uczestniki.add(u1);
        wszyscy.uczestniki.add(u2);
        wszyscy.uczestniki.add(u3);

        System.out.println(
                wszyscy.uczestniki.get(0).toString() + "\n"
                + wszyscy.uczestniki.get(1).toString() + "\n"
                + wszyscy.uczestniki.get(2).toString() + "\n");
        Uczestniki niepelnoletni = new Uczestniki();
        niepelnoletni = wszyscy.filtrowanie(niepelnoletni);

        for (Uczestnik member : wszyscy.uczestniki){
            System.out.println(member.toString());
        }
        String skip = "*";
        System.out.println(skip.repeat(40));
        for (Uczestnik member : niepelnoletni.uczestniki){
            System.out.println(member.toString());
        }

    }
}
