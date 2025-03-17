package Inheritance;

publci class Student extends Osoba {
    String nrAlbumu, kierunek rokStudiów;

    public Student(String fullName, Adres adres, String nrAlbumu, String kierunek, String rokStudiów){
        super(fullName, adres);
        this.nrAlbumu = nrAlbumu;
        this.kierunek = kierunek;
        this.rokStudiów = rokStudiów;
    }
}