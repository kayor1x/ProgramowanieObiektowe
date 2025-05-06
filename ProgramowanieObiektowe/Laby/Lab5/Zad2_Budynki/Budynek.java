import java.time.LocalDate;

public class Budynek {
    String nazwa;
    int rok_budowy;
    int ilosc_pieter;

    public Budynek(String nazwa, int rok_budowy, int ilosc_pieter) {
        this.nazwa = nazwa;
        this.ilosc_pieter = ilosc_pieter;
        this.rok_budowy = rok_budowy;
    }
    public Budynek(){
        this.nazwa = "Unnamed";
        this.ilosc_pieter = 0;
        this.rok_budowy = 0;
        }

    public void viewData(){
        System.out.println("Budynek - nazwa: " + nazwa + ", rok budowy: " + rok_budowy + ", ilosc pieter: " + ilosc_pieter);
    }
    public int ile_lat() {
        int rokObecny = LocalDate.now().getYear();
        return rokObecny-rok_budowy;
    }
}
