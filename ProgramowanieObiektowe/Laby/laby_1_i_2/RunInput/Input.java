package RunInput;

import java.util.Scanner;

public class Input {

    Scanner scanner = new Scanner(System.in);
    //metoda do wczytywania typu int
    public int InputInt(){
        return scanner.nextInt();
    }
    //metoda do wczytywania typu float
    public float InputFloat(){
        return scanner.nextFloat();
    }
    //metoda do wczytywania typu String
    public String InputString(){ return scanner.next(); }

    public char InputChar(){ return scanner.next().charAt(0); }

    public boolean InputBoolean(){ return scanner.nextBoolean(); }


}
