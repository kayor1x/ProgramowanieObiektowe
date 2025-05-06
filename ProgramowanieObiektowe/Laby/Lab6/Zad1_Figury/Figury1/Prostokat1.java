package Figury1;
public class Prostokat1 extends Figura {
	double wys=0, szer=0;

	public Prostokat1(float wys, float szer, String kolor) {
		super();
		this.wys = wys;
		this.szer = szer;
		this.kolor = kolor;
	}

	public Prostokat1(double wys, double szer){
		this.wys = wys;
		this.szer = szer;
			
	}

    public double getPowierzchnia() {
        return (szer * wys);
    }

	public void przesun(int x, int y){
		this.punkt.setX(x);
		this.punkt.setY(y);
	}
	public String opis(){return "Klasa Prostokat1. kolor obiektu: "+kolor;}
}