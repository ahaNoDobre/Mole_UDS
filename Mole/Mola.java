
/**
 * Trieda {@code Mola} slúži na «doplňte opis»…
 *
 * @author   «meno autora»
 * @version  «verzia alebo dátum»
 */
public class Mola
{
    private Trojuholnik mola;
    private int poziciaMoleX;
    private int poziciaMoleY;

    /**
     * Konštruktory objektov triedy Mola.
     */
    public Mola(int poziciaMoleX, int poziciaMoleY)
    {
        this.poziciaMoleX = poziciaMoleX;
        this.poziciaMoleY = poziciaMoleY;
        this.mola = new Trojuholnik(this.poziciaMoleX, this.poziciaMoleY);
        this.mola.zobraz();
        
    }
}
