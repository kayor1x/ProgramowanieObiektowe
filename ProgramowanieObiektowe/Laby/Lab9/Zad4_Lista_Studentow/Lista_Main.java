import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lista_Main {
    public static void main(String [] args) {
        Gracz[] gracze = new Gracz[3];

        Gracz g1 = new Gracz("Kowalski", "Jan", 18);
        Gracz g2 = new Gracz("Bobr", "Nite", 21);
        Gracz g3 = new Gracz("Kyle", "Boba", 24);
        gracze[0] = g1;
        gracze[1] = g2;
        gracze[2] = g3;

        ArrayList<Gracz> graczeList = new ArrayList<>();
        for(Gracz g : gracze){
            graczeList.add(g);
        }

        graczeList.add(new Gracz("Kowalski", "Jan", 18));
        graczeList.add(new Gracz("Kowalski", "Jan", 18));
        for (Gracz gracz : graczeList) {
            System.out.println(gracz.toString());
        }

        graczeList.subList(0, 3).clear();

        System.out.println("=====================================================\n podlista usunieta");

        for (Gracz gracz : graczeList) {
            System.out.println(gracz.toString());
        }
    }
}
