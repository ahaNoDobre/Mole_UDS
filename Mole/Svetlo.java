
/**
 * Trieda ktora reprezentuje svetlo.
 *
 * @author   Jakub Gubany
 * @version  10.12.2023
 */
public class Svetlo {
    private int poziciaX;
    private int poziciaY;
    private Obrazok vizual;

    /**
     * Konštruktor vytvrorí svtlo na platno.
     * @param poziciaX: int je x-ova suradnica svetla na ploche.
     * @param poziciaY: int je y-ova suradnica svetla na ploche.
     */
    public Svetlo(int poziciaX, int poziciaY) {
        this.poziciaX = poziciaX;
        this.poziciaY = poziciaY;
        this.vizual = new Obrazok("svetlo.png");
        this.vizual.zmenPolohu(this.poziciaX, this.poziciaY);
        this.vizual.zobraz();
    }
    /**
     * Get metoda na ziskanie aktualnej pozicie X svetla na platne.
     *
     * @return  vrati celociselnu hodnotu pozicie x na platne.
     */
    public int getPoziciaX() {
        return this.poziciaX;
    }
    /**
     * Get metoda na ziskanie aktualnej pozicie Y svetla na platne.
     * 
     * @return vrati celociselnu hodnotu pozicie Y na platne.
     */
    public int getPoziciaY() {
        return this.poziciaY;
    }
}
