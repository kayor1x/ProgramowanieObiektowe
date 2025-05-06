public class Okrag2 extends Figura2 implements RuchFigury{
    int promien;
    int srodekX;
    int srodekY;

    public Okrag2(int promien, int srodekX, int srodekY) {
        this.promien = promien;
        this.srodekX = srodekX;
        this.srodekY = srodekY;
    }

    @Override
    public void przesun(int x, int y) {
        this.srodekX += x;
        this.srodekY += y;
        System.out.println((srodekX-x) + " -> " + srodekX + ", " +  (srodekY-y) + " -> " + srodekY);
    }

    public String opis() {return "Okrag o wymiarach a wspolrzednych: " + promien + " " +  srodekX + " " + srodekY;}
    public void skaluj(float skala) {this.promien *= skala;}
}
