package immobili;
import java.util.*;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime; 
public class Reg<E> {
	String specialCharacters=" !#$%&'()*+,-./:;<=>?@[]^_`{|}";
	static Scanner in = new Scanner (System.in);
	nodo primo;
	static String newline = System.getProperty("line.separator");
	public Reg() {
		primo=null;
	}
	public class nodo{
		int type;
		String Nome;
		String Cognome;
		String password;
		String email;
		int età;
		String iva;
		String pec;
		String referente;
		String denominazione;
		String telefono;
		nodo pros;
		String orario;
		String cod_fisc;
	}
//AGENZIA-----------------------------------------------------------------------------------
	public void inserisci_agenzia() {
		nodo t=new nodo();		
		t.type=0;
		System.out.println("Inserire denominazione");
		t.denominazione=in.nextLine();
		System.out.println("Inserire iva");
		t.iva=in.nextLine();

		System.out.println("Inserire referente");
		t.referente=in.nextLine();		
		do {
		System.out.println("Inserire pec");
		t.pec=in.nextLine();
		if(t.pec.contains("@")==false) {
			System.out.println("Attenzione PEC non valida");
		}
		}while(t.pec.contains("@")==false);
		//ciclo controllo telefono
		do {
			System.out.println("Inserire telefono");
		t.telefono=in.nextLine();
		if(t.telefono.matches("[0-9]+")==false) {
			System.out.println("attenzione il numero di telefono non è valido");
		}
		}while(t.telefono.matches("[0-9]+")==false);
		//ciclo controllo mail
		do {
		System.out.println("Inserire email");
		t.email=in.nextLine();
		if(t.email.contains("@")==false) {
			System.out.println("Attenzione mail non corretta");
		}
		}while(t.email.contains("@")==false);
		//ciclo controllo password
		boolean a;
		do {
			
		System.out.println("Inserire password");
		t.password=in.nextLine();
		a=check(t.password);
		if(t.password.matches(".*[0-9].*")==false || a==false) {
			System.out.println("password troppo debole");
		}
		}while(t.password.matches(".*[0-9].*")==false || a==false);
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		t.orario=dtf.format(now);
		System.out.println("ORARIO"+ t.orario);
		t.pros=primo;
		primo=t;
	}
//PRIVATO-------------------------------------------------------------------------	
	public void inserisci_privato() {
		nodo t=new nodo();
		t.type=1;
		System.out.println("Inserire Nome");
		t.Nome=in.nextLine();
		System.out.println("inserire Cognome");
		t.Cognome=in.nextLine();
		//ciclo controllo mail
		do {
		System.out.println("Inserire email");
		t.email=in.nextLine();
		if(t.email.contains("@")==false) {
			System.out.println("Attenzione mail non corretta");
		}
		}while(t.email.contains("@")==false);
		//codice fiscale e controllo
		do {
			System.out.println("Inserire codice fiscale");
			t.cod_fisc=in.nextLine();
			if(t.cod_fisc.length()<16) {
				System.out.println("Attenzione codice fiscale non valido");
			}
		}while(t.cod_fisc.length()<16);
		 System.out.println("Inserire età");
		 t.età=Integer.parseInt(in.nextLine());
		
		//ciclo controllo telefono
		do {
			System.out.println("Inserire telefono");
		t.telefono=in.nextLine();
		if(t.telefono.matches("[0-9]+")==false) {
			System.out.println("attenzione il numero di telefono non è valido");
		}
		}while(t.telefono.matches("[0-9]+")==false);
		//ciclo controllo password
		boolean a;
		do {
			
		System.out.println("Inserire password");
		t.password=in.nextLine();
		a=check(t.password);
		if(t.password.matches(".*[0-9].*")==false || a==false) {
			System.out.println("password troppo debole");
		}
		}while(t.password.matches(".*[0-9].*")==false || a==false);
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		t.orario=dtf.format(now);
		System.out.println("ORARIO"+ t.orario);
		t.pros=primo;
		primo=t;
	}
	public boolean check(String a) {
		boolean found = false;
		
		for(int i=0; i<specialCharacters.length(); i++){
		    if(a.contains(Character.toString(specialCharacters.charAt(i)))){
		        found = true;
		        break;
		    }
		}
		System.out.println(found);
		return found;
	}
	
	
	public void estrai() {
		nodo z;
		z=primo;
		System.out.println(z.type);
		while(z!=null) {
			if(z.type==0) {
		System.out.println("AGENZIA"+newline+"Denominazione:  "+z.denominazione + newline +"IVA:  "+z.iva +newline +"PEC:  "+ z.pec+newline+"Referente:  "+ z.referente +
				newline+"Telefono:  "+ z.telefono +newline+"Email:  "+ z.email +newline+ "Password:  "+ z.password+newline+"Ora registrazione:  "+ z.orario);
		}
		if(z.type==1) {
			System.out.println("PRIVATO"+newline+"Nome:  "+z.Nome + newline +"Cognome:  "+z.Cognome +newline+ "Età:  "+ z.età+newline +"Email:  "+ z.email+newline+"Codice fiscale:  "+ z.cod_fisc+newline+
					"Telefono:  "+ z.telefono +newline+"Password:  "+ z.password+newline+"Ora registrazione:  "+ z.orario	);
		}
		z=z.pros;
		}
	}
	
public static void main(String [] args) {
	String scelta;
	System.out.println("Sei agenzia o privato?"+newline+"Digitare agenzia o privato");
	scelta=in.nextLine();
	Reg r= new Reg();
	if(scelta.equals("agenzia") || scelta.contentEquals("Agenzia") ) {
	r.inserisci_agenzia();
	}	
	if(scelta.equals("privato") || scelta.contentEquals("Privato")) {
r.inserisci_privato();
	}
	r.estrai();
}
}
