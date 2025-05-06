class Prostokat2 extends Figura2 implements IFigury{
	int wys=0;
	int szer=0;
	
	Prostokat2(int wys,int szer,String kolor){
		this.wys = wys;
		this.szer = szer;
		super.kolor = kolor;
	}
	public String opis(){
		return "Prostokat o wymairach: "+szer+" x "+wys;
	}
	public void skaluj(float skala) {
		szer *= skala;
		wys *= skala;
	}

	@Override
	public float getPowierzchnia() {return wys*szer;}

	@Override
	public boolean wPolu(Punkt2 p) {
		return (p.x >= 0 && p.x <= szer) && (p.y >= 0 && p.y <= wys);
	}

}