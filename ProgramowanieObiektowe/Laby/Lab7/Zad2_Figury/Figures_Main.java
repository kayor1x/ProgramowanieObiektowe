import javax.swing.*;

class Figures_Main
{
	public static void main(String[] arg)
	{
		Prostokat2 prost = new Prostokat2(3, 6, "czerwony");
		Trojkat2 rownoboczny = new Trojkat2(7, 4, "bialy");
		Kwadrat2 kw = new Kwadrat2(1,"czarny");
		Punkt2 p = new Punkt2(1,2);

		System.out.println(prost.opis());
		System.out.println(rownoboczny.opis());
		System.out.println(kw.opis()+ "\n");

		Figura2[] tablicaFigur = new Figura2[10];
		tablicaFigur[0] = prost;
		tablicaFigur[1] = rownoboczny;
		tablicaFigur[2] = kw;
		for(int i = 3; i < tablicaFigur.length; i++){
			tablicaFigur[i] = new Kwadrat2(0, "null");
		}
		for(int i = 0; i < tablicaFigur.length; i++){
			System.out.println(tablicaFigur[i].opis());
		}
		System.out.println();
		IFigury[] tabIFigur = new IFigury[3];
		tabIFigur[0] = prost;
		tabIFigur[1] = rownoboczny;
		tabIFigur[2] = kw;

		for(int i = 0; i < tabIFigur.length; i++){
			System.out.println(tabIFigur[i].getPowierzchnia());
			System.out.println(tabIFigur[i].wPolu(p));
		}

		Okrag2 okr = new Okrag2(11, 0, 0);

		System.out.println(okr.opis());
		okr.przesun(5,5);
		System.out.println(okr.opis());





	}
}