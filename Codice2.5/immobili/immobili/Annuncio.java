package immobili;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Annuncio {
	
	    private LocalDateTime dataPubblicazione;
	    private String viaImmobile;
	    private String paeseImmobile;
	    private int costo;
	    private int metratura;
	    private int numeroLocali;
	    ClasseEnergetica classeEnergetica;
	    stato stato;
	    
	    final int id_annuncio;
		public static int contatoreannunci = 0;

	    static ArrayList <Annuncio> annunci = new ArrayList<Annuncio>();

	 // costruttore con ID per l'annuncio assegnato dal sistema
	    public Annuncio (LocalDateTime dataPubblicazione, String viaImmobile, String paeseImmobile, int costo, 
	    	        	int metratura, int numeroLocali,  ClasseEnergetica classeEnergetica, stato stato)
	    {
	    this.id_annuncio = contatoreannunci;
	    this.dataPubblicazione = dataPubblicazione;
	    this.viaImmobile = viaImmobile;
	    this.paeseImmobile = paeseImmobile;
	    this.costo = costo;
	    this.metratura = metratura;
	    this.numeroLocali = numeroLocali;
	    contatoreannunci++;
	    }

	    public LocalDateTime getDataPubblicazione() {
	        return dataPubblicazione;
	    }

	    public String getViaImmobile() {
	        return viaImmobile;
	    }

	    public String getPaeseImmobile() {
	        return paeseImmobile;
	    }

	    public int getCosto() {
	        return costo;
	    }

	    public int getMetratura() {
	        return metratura;
	    }

	    public int getNumeroLocali() {
	        return numeroLocali;
	    }

	    public ClasseEnergetica getClasseEnergetica() {
	        return classeEnergetica;
	    }

	    public void setDataPubblicazione(LocalDate dataPubblicazione) {
	        LocalDateTime dataPubblicazione11 = LocalDateTime.now(); 
	        this.dataPubblicazione = dataPubblicazione11;
	    }

	    public void setViaImmobile(String viaImmobile) {
	        this.viaImmobile = viaImmobile;
	    }

	    public void setPaeseImmobile(String paeseImmobile) {
	        this.paeseImmobile = paeseImmobile;
	    }

	    public void setCosto(int costo) {
	        this.costo = costo;
	    }

	    public void setMetratura(int metratura) {
	        this.metratura = metratura;
	    }

	    public void setNumeroLocali(int numeroLocali) {
	        this.numeroLocali = numeroLocali;
	    }

	    public void setClasseEnergetica(ClasseEnergetica classeEnergetica) {
	        this.classeEnergetica = classeEnergetica;
	    }
	    
		public static void add (Annuncio a) {
			annunci.add(a);
		}

}
