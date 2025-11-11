# Progetto: Produzione di Torte in Parallelo

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
- `ImpastaTorte.java` → Thread che rappresenta la fase di impastatura.
- `CucinaTorte.java` → Thread che rappresenta la fase di cottura.

---

## 3. Funzionamento
1. L’utente inserisce il numero di torte da produrre.
2. Per ogni torta, inserisce due valori di lentezza (in millisecondi):
    - uno per l’impasto
    - uno per la cottura
3. Tutte le impastature vengono eseguite in parallelo.
4. Una volta completate, iniziano in parallelo le cotture.
5. Il programma termina solo quando tutte le torte sono pronte.

---

## 4. Concorrenza e Thread
Il progetto dimostra l’uso di:
- Creazione di thread estendendo la classe `Thread`.
- Avvio parallelo tramite `start()`.
- Sincronizzazione con `join()` per attendere il completamento delle fasi.
- Uso di `ArrayList` per gestire più thread in modo dinamico.

---

## 5. Esempio di esecuzione
Inserisci quante torte vuoi fare: 2<br>
Inserisci la lentezza della 1ª torta nella fase di impastatura : 400<br>
Inserisci la lentezza della 1ª torta nella fase di cottura : 600
<br>...

Inizio fase di impastatura
<br>
Torta 1 inizia la fase di impastatura<br>
Torta 2 inizia la fase di impastatura<br>
Torta 2 impasto completato<br>
Torta 1 impasto completato

Fase di impastatura finita avvio della fase di cottura

Torta 1 inizia la fase di cottura<br>
Torta 2 inizia la fase di cottura<br>
Torta 2 cottura completata<br>
Torta 1 cottura completata

Tutte le torte sono pronte

---

## 6. Obiettivi didattici
Il progetto ha lo scopo di:
- Comprendere i principi di multithreading in Java.
- Gestire processi paralleli in modo coordinato.
- Utilizzare `ArrayList` per la gestione dinamica dei thread.
- Applicare i metodi `start()` e `join()`.
- Sviluppare codice ben documentato con JavaDoc.
- Simulare un processo reale (produzione di torte) con logica programmativa.

---

Autore: **Brugiati**  
Versione: **1.0**
