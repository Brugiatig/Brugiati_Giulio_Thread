/**
 * questa classe {@code ImpastaTorte} è il nostro primo thread e consentirà la simulazione di una preparazione delle torte
 * @author brugiati
 * @version 1.0
 * */
public class ImpastaTorte extends Thread {
    private int lentezza;
    private int numeroTorta;

    public ImpastaTorte(int lentezza, int numeroTorta) {
        this.lentezza = lentezza;
        this.numeroTorta = numeroTorta;
    }
/** sovrascrittura del metodo run per simulare l'impastatura delle torte **/
    @Override
    public void run() {
        System.out.println("Torta " + numeroTorta + " inizia la fase di impastatura");
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
    protected int getLentezza() {
        return lentezza;
    }
    /**setter per il parametro di lentezza */
    protected void setLentezza(int lentezza) {
        this.lentezza = lentezza;
    }
}
