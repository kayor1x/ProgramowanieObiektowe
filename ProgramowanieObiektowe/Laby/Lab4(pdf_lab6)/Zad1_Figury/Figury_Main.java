public class Figury_Main {
    public static void main(String[] args) {
        Punkt p1 = new Punkt();
        Punkt p2 = new Punkt("A",5,1);

        p1.viewData();
        p2.viewData();

        p1.przesun(3,6);
        p2.przesun(3,12);

        p1.viewData();
        p2.viewData();

        p2.zeruj();

        p1.viewData();
        p2.viewData();


    }
}
