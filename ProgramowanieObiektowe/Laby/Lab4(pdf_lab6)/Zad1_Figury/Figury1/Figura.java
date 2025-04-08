package Figury1;

public class Figura {
	
	//pola metody i kontruktory
	Punkt1 punkt;
	String kolor = "bialy";
	
	
	public Figura(){
		punkt = new Punkt1(0,0);
	}
	public Figura(String kolor){
		this.kolor=kolor;
	}
	public Figura(Punkt1 punkt){
		this.punkt=punkt;
	}
	public String getKolor(){
		return kolor;
	}
	public String opis(){
		return "Klasa Figura. Kolor obiektu: "+kolor;
	}
			
	
}
