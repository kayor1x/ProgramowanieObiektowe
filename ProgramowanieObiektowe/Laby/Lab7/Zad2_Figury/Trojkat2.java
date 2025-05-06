class Trojkat2 extends Figura2 implements IFigury{
	int wys=0;
	int podst=0;
	Trojkat2(int wys,int podst,String kolor){
		this.wys = wys;
		this.podst = podst;
		super.kolor = kolor;
	}
	public String opis(){
		return "Trojkat o wymiarach: "+wys+"  "+podst;
	}
	public void skaluj(float skala) {
		wys *= skala;
		podst *= skala;
	}

	@Override
	public float getPowierzchnia() {return (wys*podst)/2;}

	@Override
	public boolean wPolu(Punkt2 p) {
		if (p.x < 0 || p.y < 0) {
			return false;
		}

		float nachylenie = -((float) wys / podst);
		float yGranica = nachylenie * p.x + wys;

		return p.y <= yGranica;
	}
}