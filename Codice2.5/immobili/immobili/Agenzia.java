package immobili;

import java.util.*;
import java.time.*;

public class Agenzia extends Utente {

    private String agencyName;
    private int partitaIVA;
    private String owner;

    public String getAgencyName() {
        return agencyName;
    }

    public int getPartitaIVA() {
        return partitaIVA;
    }

    public String getOwner() {
        return owner;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public void setPartitaIVA(int partitaIVA) {
        this.partitaIVA = partitaIVA;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

}
