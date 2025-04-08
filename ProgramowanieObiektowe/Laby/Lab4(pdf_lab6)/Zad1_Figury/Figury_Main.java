import Figury1.*;

public class Figury_Main {
    public static void main(String[] args) {
        Punkt1 p1 = new Punkt1();
        Punkt1 p2 = new Punkt1("A",5,1);

        p1.viewData();
        p2.viewData();

        p1.przesun(3,6);
        p2.przesun(3,12);

        p1.viewData();
        p2.viewData();

        p2.zeruj();

        p1.viewData();
        p2.viewData();

        Trojkat1 t = new Trojkat1(2,2);
        Prostokat1 prost = new Prostokat1(2,2);
        Figura fig = new Figura();

        System.out.println(fig.opis());
        System.out.println(prost.getPowierzchnia());

        prost.przesun(3,5);

        Kwadrat1 kwad = new Kwadrat1(4);

        Okrag1 okrag1 = new Okrag1(new Punkt1(),3,"blue");

        System.out.println(kwad.opis() + "\n" + prost.opis() + "\n" + fig.opis() + "\n" + t.opis() + "\n" + p2.opis() + "\n" + okrag1.opis());

    }
}
