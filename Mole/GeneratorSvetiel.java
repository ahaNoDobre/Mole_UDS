import java.util.ArrayList;
import java.util.Random;
/**
 * Trieda {@code GeneratorSvetiel} slúži na «doplňte opis»…
 *
 * @author   «Jakub Gubany»
 * @version  «17.12.2023»
 */
public class GeneratorSvetiel
{
    private ArrayList<Svetlo> svetla;
    private Random generator;
  
    /**
     * Vytvori inštanciu triedy Generator Svetiel
     * 
     * @param pocet: int , pocet potrebnych svetiel na vygenerovanie.
     */
    public GeneratorSvetiel(int pocet)
    {
        this.svetla = new ArrayList<Svetlo>(pocet);
        this.generator = new Random();
    }
    /**
     * Vytvori ArrayList inštancii triedy Svetlo.
     * 
     * @param pocet: int , pocet potrebnych svetiel na vygenerovanie.
     */
    public ArrayList<Svetlo> zoznamSvetiel(int pocet) {
        for (int i = 0; i < pocet; i++) {
            int poziciaMoleX = this.generator.nextInt(50,450);
            int poziciaMoleY = this.generator.nextInt(50,450);
            this.svetla.add(new Svetlo(poziciaMoleX, poziciaMoleY));
        }
        return this.svetla;
    }
}
