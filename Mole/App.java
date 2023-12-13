import java.util.ArrayList;
import java.util.Random;
/**
 * Write a description of class App here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class App {
   
    private Spajac spajac;
    /**
     * Vztvori instanciu triedy App
     */
    public App(int pocetMoli, int pocetSvetiel) {
        this.spajac = new Spajac(pocetMoli, pocetSvetiel);
        this.spajac.spusti(pocetMoli, pocetSvetiel);
    }
}
