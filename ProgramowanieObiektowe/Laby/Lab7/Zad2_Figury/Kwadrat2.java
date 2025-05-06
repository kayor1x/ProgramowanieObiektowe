import Figury.Kwadrat;

class Kwadrat2 extends Prostokat2 implements IFigury {
	Kwadrat2(int bok,String kolor){super(bok,bok,kolor);}
	public String opis(){return "Kwadrat o wymiarze i koloru: " + szer + " " + kolor;}
	public void skaluj(float skala){szer *= skala;}

	@Override
	public float getPowierzchnia() {return szer*wys;}

	@Override
	public boolean wPolu(Punkt2 p) {
		return (p.x >= 0 && p.x <= szer) && (p.y >= 0 && p.y <= szer);
	}
}