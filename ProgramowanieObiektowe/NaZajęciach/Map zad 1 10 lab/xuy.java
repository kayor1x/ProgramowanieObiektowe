import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class xuy {
    public static void main(String[] args) {

        File plik = new File("ProgramowanieObiektowe/NaZajęciach/pliki/dane.txt");
        try {
            if (plik.createNewFile()) {
                System.out.println("Utworzono plik: " + plik.getName());
            } else {
                System.out.println("Plik już istnieje.");
            }
        } catch (IOException e) {
            System.out.println("Wystąpił błąd.");
            e.printStackTrace();
        }
        try{
            Writer writer = new FileWriter("ProgramowanieObiektowe/NaZajęciach/pliki/dane.txt");
            writer.write("Hello World!\n");
            writer.write("lalala");
            writer.close();
            System.out.println("Buba zapisano");
        } catch (IOException e){
            System.out.println("Wystapil blad: " + e.getMessage());
            e.printStackTrace();
        }
    }
}