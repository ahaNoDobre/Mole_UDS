import java.util.ArrayList;
import java.lang.Math;
/**
 * Write a description of class Spajac here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spajac {
    /**
     * 
     */
    private GeneratorMoli vsetkyMole;
    private GeneratorSvetiel vsetkySvetla;
    private double vzdialenost;
    private int prvok;
    private ArrayList<Mola> mole; 
    private ArrayList<Svetlo> svetla;
    /**
     * v danom konstruktore vytvarame nove instancie tried GeneratorMoli a Generator svetiel
     * v pocte ktorom si urci uzivatel. Zadani pocet tak isto ukladame do vytvorenych
     * array listov
     */
    public Spajac(int pocetMoli, int pocetSvetiel) {
        this.vsetkyMole = new GeneratorMoli(pocetMoli);
        this.mole = this.vsetkyMole.zoznamMoli(pocetMoli);
        this.vsetkySvetla = new GeneratorSvetiel(pocetSvetiel);
        this.svetla = this.vsetkySvetla.zoznamSvetiel(pocetSvetiel);
        this.vzdialenost = 5000;
        this.prvok = 0;
    }
    /**
     * Metoda, ktora spusti animaciu moli.
     */
    public void spusti(int pocetMoli, int pocetSvetiel) {
        for (Mola aktualnaMola : this.mole) {
            int index = 0;
            for (Svetlo aktualneSvetlo : this.svetla) {
                
                int poziciaMolaX = aktualnaMola.getPoziciaX();
                int poziciaMolaY = aktualnaMola.getPoziciaY();
                
                int poziciaSvetloX = aktualneSvetlo.getPoziciaX();
                int poziciaSvetloY = aktualneSvetlo.getPoziciaY();
                
                int rozdielX = poziciaMolaX - poziciaSvetloX;
                int rozdielY = poziciaMolaY - poziciaSvetloY;
                
                double velkostVektora = Math.sqrt(Math.pow(rozdielX, 2) + Math.pow(rozdielY, 2));
                
                if (this.vzdialenost > velkostVektora) {
                    this.vzdialenost = velkostVektora;
                    this.prvok = index;
                }
                index += 1;
            }
            aktualnaMola.pohybMole(this.svetla.get(this.prvok).getPoziciaX(), (this.svetla.get(this.prvok).getPoziciaY()));
        }
    }
}
