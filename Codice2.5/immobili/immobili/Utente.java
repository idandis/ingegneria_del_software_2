package immobili;

	import java.util.*;
	import java.time.*;

	public abstract class Utente {
	  
	    private String userID;
	    private String password;
	    private LocalDate registerDate;
	    private String email;

	    public String getUserID() {
	        return userID;
	    }

	    public String getPassword() {
	        return password;
	    }

	    public LocalDate getRegisterDate() {
	        return registerDate;
	    }

	    public String getEmail() {
	        return email;
	    }


	    public void setUserID(String userID) {
	        this.userID = userID;
	    }

	    public void setPassword(String password) {
	        this.password = password;
	    }

	    public void setRegisterDate(LocalDate registerDate) {
	        this.registerDate = registerDate;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }


	    public void login(String email, String password) {
		if(password.equals("this.password") && email.equals("this.email") ){
	        System.out.println("sei stato logato");
	        }
	        else{
	         System.out.println("password o mail incorrette, riprova di nuovo");
	        }    
	    
	    }

	    public void pubblicareAnnuncio () {
			Annuncio.add (new Annuncio());
	    }

	}

