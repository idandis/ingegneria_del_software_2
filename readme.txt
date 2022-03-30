
La parte del codice che riguarda le classi è stata generata usando il tool Rebel in Star UML.
Ottenendo cosi: 

   - La classe "Utente" è una classe astratta con i relativi metodi e gli atributi indicati nella sua diagramma delle classi in UML 
   - Le classi figlie sono "Agenzia" e "Privato" che sono estensioni della classe "Utente", anche in questo caso i metodi sono stati generati 
     automaticamente dal Tool. Per la classe Privato oltre a ciò che è stato generato in automatico abbiamo previsto anche un controllo nel
     costruttore sulla lunghezza del codice fiscale che deve essere composto da 16 caratteri 

Inoltre, abbiamo la classe "Annuncio" anche in questo caso attributi e metodi generati dal Tool, ma abbiamo aggiunto una variabie globale per 
dare un id univoco a ciascun annuncio, usando un contatore che viene incrementato di volta in volta. Dato che gli attributi: "ClasseEnergetica"
e stato della classe "Annuncio", possono assumere solo un determinato numero di valori costanti abbiamo implementato altre due classi di tipo enum:

- "stato" che definisce lo stato dell'annuncio quest'ultimo puo' essere attivo (visibile agli utenti sul portale) oppure scaduto (non visibile)
   lo stato generalmente viene impostato ad attivo quando l'amministrattore conferma la pubblicazione degli annunci da parte degli uenti, altrimenti 
   è scaduto 

- e "ClasseEnergetica" che puo' assumere uno dei seguenti valori: A4, A3, A2, A1, B, C, D, E, F, G

La registrazione dell'annuncio consiste nella creazione di una nuova istanza della classe "Annuncio" all'interno di un array, in modo da simulare la 
presenza di un database. All'utente viene richiesto l'inserimento dei parametri che caratterizzano l'immobile, per poter completare il "form" 
di registrazione dell'annuncio.