import java.sql.SQLOutput;

/** questa classe {@code CucinaTorte} è il nostro secondo thread e consentirà di cuocere le torte
 * @author brugiati
 * @version 1.0
 * */
public class CucinaTorte extends Thread {
    private int lentezza;
    private int numeroTorta;

    public CucinaTorte(int lentezza, int numeroTorta) {
        this.lentezza = lentezza;
        this.numeroTorta = numeroTorta;
    }
    /**sovrascittura del metodo run per simulare la cottura delle torte*/
    @Override
    public void run() {
        System.out.println("Torta " + numeroTorta + " inizia la fase di cottura");
        for (int i = 1; i <= 10; i++) {
            try {
                sleep(lentezza);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Torta " + numeroTorta + " impasto completato");
    }
    /**getter per il parametro di lentezza */
    protected int getLentezza(){
        return lentezza;
    }
    /**setter per il parametro di lentezza */
    protected void setLentezza(int lentezza){
        this.lentezza=lentezza;
    }
}
