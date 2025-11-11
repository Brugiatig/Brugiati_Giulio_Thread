# Produzione di Torte in Parallelo

## 1. Descrizione del progetto
Il programma simula la produzione di più torte suddividendo il processo in due fasi principali:
- Impastatura
- Cottura

Ogni fase è gestita da thread separati (`ImpastaTorte` e `CucinaTorte`), che permettono l’esecuzione in parallelo per più torte contemporaneamente.  
L’utente può impostare la lentezza di ogni fase per ciascuna torta, simulando tempi di lavoro diversi.

---

## 2. Struttura del progetto
Il progetto è composto da tre classi Java principali:

- `ProduzioneTorte.java` → Classe principale che gestisce input, creazione e sincronizzazione dei thread.
- `ImpastaTorte
