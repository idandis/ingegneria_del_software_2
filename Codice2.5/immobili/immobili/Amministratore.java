package immobili;

import java.util.*;

public class Amministratore extends Utente {

    private String name;
    private String internalID;
    private String email;
    private String password;


    public String getName() {
        return name;
    }

    public String getInternalID() {
        return internalID;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setInternalID(String internalID) {
        this.internalID = internalID;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void login(String email,String password) {
	if(password.equals("this.password") && email.equals("this.email") ){
        System.out.println("sei stato logato");
        }
        else{
         System.out.println("password o mail incorrette, riprova di nuovo");
        }    
    
    }
 
    public void AccettaPubblicazione(String id) {
	System.out.println("attivo");
	
    }

   public void RifiuttaPubblicazione(String id) {
	System.out.println("scaduto");
    }

    public void gestioneMail() {
  
    }

    public void assistenzaClienti() {
 
    }

}