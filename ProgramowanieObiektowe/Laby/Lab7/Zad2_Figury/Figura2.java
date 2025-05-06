//deklaracja klasy abstrakcyjnej

public abstract class Figura2{
	
	//pola metody i kontruktory
	Punkt2 punkt;
	String kolor = "bialy";
	
	
	Figura2(){
		punkt = new Punkt2(0,0);
	}
	Figura2(String kolor){
		this.kolor=kolor;
	}
	Figura2(Punkt2 punkt){
		this.punkt=punkt;
	}
	String getKolor(){
		return kolor;
	}
	public abstract String opis();
	public abstract void skaluj(float skala);

	//metody abstrakcyjne
	
	
	}
