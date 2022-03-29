package immobili;

import java.util.*;
import java.time.*;

public class Privato extends Utente {

    private String name;
    private String surname;
    private String fiscalCode;
    private LocalDate birthDate;

  
    public Privato(String name, String surname, String fiscalCode, LocalDate birthDate) {
		// Controllo sulla lunghezza della targa
		if (fiscalCode.length() != 16) {
			throw new CodiceFiscaleNonValidoException("Il codice fiscale deve contenere 16 caratteri");
		}
		this.name = name;
		this.surname = surname;
		this.fiscalCode = fiscalCode;
		this.birthDate = birthDate;
	}
    
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getFiscalCode() {
        return fiscalCode;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setFiscalCode(String fiscalCode) {
        this.fiscalCode = fiscalCode;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

}