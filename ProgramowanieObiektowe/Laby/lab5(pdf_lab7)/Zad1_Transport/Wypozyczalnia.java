import java.util.Scanner;

public class Wypozyczalnia {
    Pojazd[] pojazdy;
    int liczbaPojazdow;
    int index;
    public Wypozyczalnia(){
        this.pojazdy = new Pojazd[100];
        liczbaPojazdow = 1;
    }

    void dodajPojazd(Pojazd p){
        pojazdy[liczbaPojazdow] = p;
        liczbaPojazdow++;
    }
    void wyswietlPojazdy(){
        if(liczbaPojazdow <= 1){
            System.out.println("Nie ma dostepnego transportu w wypozyczalni");
        } else{
            String skip = "=";
            for(int i = 1; i < liczbaPojazdow; i++){
                System.out.println(skip.repeat(40));
                System.out.println("Pojazd numer " + i);
                pojazdy[i].wyswietlInfo();
                System.out.println(skip.repeat(40));
            }
        }
    }
    void wypozyczPojazd(Customer k){
        if(liczbaPojazdow == 1){
            System.out.println("Nie ma dostepnego transportu w wypozyczalni");
        } else{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj numer pojazdu: ");
            index = scanner.nextInt();
            scanner.close();
            k.setP(pojazdy[index]);
            pojazdy[index] = null;
            liczbaPojazdow--;
            System.out.println("Pojazd wypozyczony!");
        }
    }
    void zwrocPojazd(Customer k){
        this.pojazdy[index] = k.getP();
        k.setP(null);
        liczbaPojazdow++;
        System.out.println("Pojazd zwrocony!");

    }
    double obliczKoszt(int godziny, int transportID){
        return pojazdy[transportID].cenaZaGodzine * godziny;
    }

}

