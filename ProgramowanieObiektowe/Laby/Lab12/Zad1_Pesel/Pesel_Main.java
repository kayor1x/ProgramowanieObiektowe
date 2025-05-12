import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Pesel_Main {
    static public void main(String[] args) {
        List<String> pesele = new ArrayList<>();
        try {
            pesele = Files.readAllLines(Paths.get("ProgramowanieObiektowe/Laby/Lab12/Zad1_Pesel/pesele.txt"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Pesele:" + pesele);
        int mezczyzn = 0, kobiet = 0;
        for (String line : pesele) {
             if (isFemale(line))
                 kobiet++;
             else mezczyzn++;
         }
         System.out.println("Mężczyzn: " + mezczyzn + "\nKobiet: " + kobiet);

         bornBetween(pesele, 1950, 1980);
         bornBetween(pesele, 1981, 2000);
         bornBetween(pesele, 2001, 2025);

         sredniWiek(pesele, 1950, 2025);

         Path path = Paths.get("ProgramowanieObiektowe/Laby/Lab12/Zad1_Pesel/wyniki.txt");
         try {
             if (!Files.exists(path)) {
                 Files.createFile(path);
             }

             BufferedWriter writer = new BufferedWriter(new FileWriter(path.toFile()));
             for (String pesel : pesele) {
                 writer.write(zwrocDate(pesel));
                 writer.newLine();
             }
             writer.close();
             System.out.println("Zapisano daty urodzenia do pliku wyniki.txt");
         } catch (IOException e) {
             throw new RuntimeException(e);
         }


     }


    static public boolean isFemale(String pesel){
        System.out.println("Numer sprawdzającego pesela = " + pesel);
        if(Character.getNumericValue(pesel.charAt(10))%2 == 0)
            return true;
        else return false;
    }
    static public void bornBetween(List<String> pesele, int y1, int y2) {
        int year;
        int count = 0;
        for (String pesel : pesele) {
            year = Integer.parseInt(pesel.substring(0, 2));
            if (year <= 24)
                year += 100;
            if (year >= y1 - 1900 && year <= y2 - 1900)
                count++;

        }
        System.out.println("Urodzone pomiędzy " + y1 + " - " + y2 + ": " + count);
    }
    static public void sredniWiek(List<String> pesele, int y1, int y2) {
        int year;
        int currentYear = 2025;
        int count = 0;
        double sredniWiek = 0;
        for (String pesel : pesele) {
            year = Integer.parseInt(pesel.substring(0, 2));
            if (year <= 24)
                year += 2000;
            else year += 1900;
            if (year >= y1 && year <= y2) {
                sredniWiek += currentYear - year;
                count++;
            }
        }
        System.out.println("Sredni wiek w zakresie " + y1 + " - " + y2 + ": " + sredniWiek/count);
    }
    static public String zwrocDate(String pesel){
        int year = Integer.parseInt(pesel.substring(0, 2));
        int month = Integer.parseInt(pesel.substring(2, 4));
        int day = Integer.parseInt(pesel.substring(4, 6));
        if(month >= 21){
            month -= 20;
            year += 2000;
        }
        else year += 1900;
        return String.format("%02d-%02d-%02d", year, month, day);
     }
}
