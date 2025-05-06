package Figury1;
public class Trojkat1 extends Figura
{
	double wys=0, podst=0;

	public Trojkat1(float wys, float podst, String kolor){
		super();
		this.wys = wys;
		this.podst = podst;
		this.kolor = kolor;
	}

	public Trojkat1(double wys, double podst)
	{
		this.wys = wys;
		this.podst = podst;
	}
	public String opis(){return "Klasa Trojkat1. Kolor obiektu: "+kolor;}
	
}