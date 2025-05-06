import java.util.*;

public class Uczestniki {
    List<Uczestnik> uczestniki;
    public Uczestniki() {
        uczestniki = new ArrayList<>();
    }

    public Uczestniki filtrowanie(Uczestniki niepelnoletni) {
        Iterator<Uczestnik> it = uczestniki.iterator();
        while(it.hasNext()) {
            Uczestnik u = it.next();  // Pobieramy raz
            if (u.wiek < 18) {
                niepelnoletni.uczestniki.add(u);
                it.remove();  // Bezpieczne usuwanie przez iterator
            }
        }
        return niepelnoletni;
    }
}
