import java.util.ArrayList;
import java.util.Random;
/**
 * Write a description of class GeneratorMoli here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GeneratorMoli {
    private ArrayList<Mola> mole;
    private Random generator;
    /**
      * Vytvorenie pomocneho array listu kde ukladame zadany pocet moli a
      * vytvorenie instancie generator
      * 
      * @param pocet int velkost array listu
      */
    public GeneratorMoli(int pocet) {
        this.mole = new ArrayList<Mola>(pocet);
        this.generator = new Random();
    }
    /**
     * Metoda ktora vrati zoznam instancii Mola na zaklade parametrov
     * 
     * @param pocet int pocet instancii moli
     */
    public ArrayList<Mola> zoznamMoli(int pocet) {
        for (int i = 0; i < pocet; i++){
            int poziciaMoleX = this.generator.nextInt(450);
            int poziciaMoleY = this.generator.nextInt(450);
            this.mole.add(new Mola(poziciaMoleX, poziciaMoleY));
        }
        return this.mole;
    }
}
