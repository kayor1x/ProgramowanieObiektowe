public class Wyjatki {
    public static void main(String[] args) throws MojeWyjatki {

        List<String> lista = new ArrayList<>();
        List<String> lista1 = new LinkedList<>();

        Set<String> zbior = new HashSet<>();
        Set<String> zbior1 = new LinkedHashSet<>();
        Set<String> zbior2 = new TreeSet<>(); //auto sort elements

        zbior.add("poniedzałek");
        zbior.add("poniedzałek1");
        zbior.add("poniedzałek3");
        zbior.add("poniedzałek4");

        zbior.remove("poniedzałek");

        lista.add("poniedziałek");
        lista.add("wtorek");
        lista.add("środa");

        System.out.println(lista.get(15));
        /*
        try{
            int wynik = 5/0;
        }
        catch (ArithmeticException e);
            System.out.println("Nie można dzielić przez zero!");
        }
        finally{
        System.out.println("Blok finally ... ");
        }
    public void wczytajPlik(String nazwaPliku) throws IOException {}

        sprawdzWiek(5);
    }
    public static void sprawdzWiek(int wiek) throws MojeWyjatki{
        if (wiek<18)
            throw new MojeWyjatki("Musisz miec co najmniej 18 lat");
    }
}
class MojeWyjatki extends Exception{
    public MojeWyjatki(String komunikat){
        super(komunikat);
    }
*/
    }
}