/**
 * Trieda Mola sluzi na vytvorenie Mole ako objektu
 * na platne s charakteristickym pohybom.
 *
 * @author   «Matej Ostrozovic»
 * @version  «17.12.2023»
 */
public class Mola
{
    private Trojuholnik mola;
    private int poziciaMoleX;
    private int poziciaMoleY;
    /**
     * Vytvori instanciu Mole
     * 
     * @param poziciaMoleX: int, Xova pozicia mole na platne.
     * @param poziciaMoleY: int, Yova pozicia mole na platne.
     */
    public Mola(int poziciaMoleX, int poziciaMoleY){
        this.poziciaMoleX = poziciaMoleX;
        this.poziciaMoleY = poziciaMoleY;
        this.mola = new Trojuholnik(this.poziciaMoleX, this.poziciaMoleY); 
        this.mola.zobraz();
    }
    /**
     * Metoda, ktorá pohybuje molou po platne.
     * 
     * @param poziciaSvetlaX: int, Xova pozicia mole na platne.
     * @param poziciaSvetlaY: int, Yova pozicia mole na platne.
     */
    public void pohybMole(int poziciaSvetlaX, int poziciaSvetlaY){
        int sucetSuradnicSvetla = poziciaSvetlaX + poziciaSvetlaY;
        
        while (true) {
            if (this.poziciaMoleX > poziciaSvetlaX && this.poziciaMoleY > poziciaSvetlaY) {
                this.mola.pomalyPosunVodorovne(-1);
                this.mola.pomalyPosunZvisle(-1);
                this.poziciaMoleX -= 1;
                this.poziciaMoleY -= 1;
            }else if (this.poziciaMoleX > poziciaSvetlaX && this.poziciaMoleY == poziciaSvetlaY) {
                this.mola.pomalyPosunVodorovne(-1);
                this.poziciaMoleX -= 1;
            }else if (this.poziciaMoleX > poziciaSvetlaX && this.poziciaMoleY < poziciaSvetlaY) {
                this.mola.pomalyPosunVodorovne(-1);
                this.mola.pomalyPosunZvisle(1);
                this.poziciaMoleX -= 1;
                this.poziciaMoleY += 1;
            }else if (this.poziciaMoleX < poziciaSvetlaX && this.poziciaMoleY > poziciaSvetlaY) {
                this.mola.pomalyPosunVodorovne(1);
                this.mola.pomalyPosunZvisle(-1);
                this.poziciaMoleX += 1;
                this.poziciaMoleY -= 1;
            }else if (this.poziciaMoleX < poziciaSvetlaX && this.poziciaMoleY < poziciaSvetlaY) {
                this.mola.pomalyPosunVodorovne(1);
                this.mola.pomalyPosunZvisle(1);
                this.poziciaMoleX += 1;
                this.poziciaMoleY += 1;
            }else if (this.poziciaMoleX < poziciaSvetlaX && this.poziciaMoleY == poziciaSvetlaY) {
                this.mola.pomalyPosunVodorovne(1);
                this.poziciaMoleX += 1;
            }else if (this.poziciaMoleX == poziciaSvetlaX && this.poziciaMoleY < poziciaSvetlaY) {
                this.mola.pomalyPosunZvisle(1);
                this.poziciaMoleY += 1;
            }else if (this.poziciaMoleX == poziciaSvetlaX && this.poziciaMoleY > poziciaSvetlaY) {
                this.mola.pomalyPosunZvisle(-1);
                this.poziciaMoleY -= 1;
            }
            if (sucetSuradnicSvetla == this.poziciaMoleX + this.poziciaMoleY) {
                break;
            }
        }
    }
    /**
     * Metoda vrati aktualnu poziciu X mole na platne.
     */
    public int getPoziciaX() {
        return this.poziciaMoleX;
    }
    /**
     * Metoda vrati aktualnu poziciu Y mole na platne.
     */
    public int getPoziciaY() {
        return this.poziciaMoleY;
    }
}
