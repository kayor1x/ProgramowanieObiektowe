import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Login_Main {
    static public void main(String[] args) {
        Map<String, String> accs = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Dodaj użytkownika: ");
        String login = sc.nextLine();
        System.out.print(" / ");
        String password = sc.nextLine();
        accs.put(login, password);
        System.out.println("Logowanie: ");
        System.out.print("login -> ");
        login = sc.nextLine();
        System.out.print("password -> ");
        password = sc.nextLine();
        try{
            if (!accs.containsValue(password)){
                throw new InvalidLoginOrPasswordException("Niepoprawne hasło");
            } else System.out.println("Zalogowano pomyślnie!");
        } catch(InvalidLoginOrPasswordException e){
            System.out.println(e.getMessage());
        }





    }
}
