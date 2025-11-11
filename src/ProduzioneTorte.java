import java.util.ArrayList;
import java.util.Scanner;
/**
 * Classe principale {@code ProduzioneTorte} che gestisce la produzione delle torte.
 * Simula impasto e cottura in parallelo tramite thread.
 */
public class ProduzioneTorte {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci quante torte vuoi fare: ");
        int quantita = scanner.nextInt();

        ArrayList<ImpastaTorte> impasti = new ArrayList<>();
        ArrayList<CucinaTorte> cotture = new ArrayList<>();

        // inserimento della lentezza e creazione dei tread
        for (int i = 0; i < quantita; i++) {
            System.out.print("Inserisci la lentezza della " + (i + 1) + "ª torta nella fase di impastatura: ");
            int lentezzaImpasto = scanner.nextInt();
            int numeroTorta = (i+1);
            System.out.print("Inserisci la lentezza della " + (i + 1) + "ª torta nella fase di cottura: ");
            int lentezzaCottura = scanner.nextInt();
            CucinaTorte cucinaTorte = new CucinaTorte(lentezzaCottura, numeroTorta);
            ImpastaTorte impastaTorte = new ImpastaTorte(lentezzaImpasto, numeroTorta);
            impasti.add(impastaTorte);
            cotture.add(cucinaTorte);
        }
        System.out.println("\nInizio fase di impastatura\n");
        // avvio dei thread in parallelo
        for (ImpastaTorte impasto : impasti) {
            impasto.start();
        }
        // avvio dei thread cottura in parallelo dopo l'impasto
        for (ImpastaTorte impasto : impasti) {
            try {
                impasto.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("\nFase di impastatura finita avvio della fase di cottura\n");
        // avvio dei thread dei thread in parallelo
        for (CucinaTorte cottura : cotture) {
            cottura.start();
        }

        // attendere della fine di cottura
        for (CucinaTorte cottura : cotture) {
            try {
                cottura.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("\nTutte le torte sono pronte");
    }
}
