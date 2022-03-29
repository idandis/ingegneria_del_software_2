/* IPOTIZZANDO CHE ANNUNCIO ABBIA I SEGUENTI ATTRIBUTI:
    int idAnnuncio; --> variabile globale che deve sempre aumentare di 1 --> serve un metodo
    int nStanze;
    int nBagni;
    int m2;
    string paese;
    string provincia;
    int prezzo;
*/

public void insertAnnuncio(){
    Console console = System.console();
    String str= console.readLine("Numero locali dell'immobile: ");
    nStanze = Integer.parseInt(str);

    str= console.readLine("Bagni dell'immobile: ");
    nBagni = Integer.parseInt(str);

    str= console.readLine("Metri quadri dell'immobile: ");
    m2 = Integer.parseInt(str);

    paese = console.readLine("Paese dell'immobile: ");

    provincia = console.readLine("Provincia dell'immobile: ");

    str= console.readLine("Prezzo dell'immobile: ");
    prezzo = Integer.parseInt(str);

    classeEnergetica = console.readLine("Classe energetica dell'immobile: ");

    viaImmobile = console.readLine("Via dell'immobile: ");
    

    Annuncio annuncio1 = new Annuncio(nStanze, nBagni, m2, paese, provincia, prezzo, classeEnergetica, viaImmobile);
    System.out.println("Annuncio registrato correttamente! Grazie.");

}
