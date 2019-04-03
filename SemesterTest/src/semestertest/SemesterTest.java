
package semestertest;

/**
 *
 * @author leost
 */

class Billett{
    int plassnummer;
    //Lokale.navn
    String dato;
    String tid;
    int pris;
    int kundeTlf;
}

class Lokale extends Billett{
    String lokaleNavn;
    String type;
    int antPlasser;

    public Lokale(String lokaleNavn, String type, int antPlasser) {
        this.lokaleNavn = lokaleNavn;
        this.type = type;
        this.antPlasser = antPlasser;
    }

    

    public String getLokaleNavn() {
        return lokaleNavn;
    }

    public void setLokaleNavn(String lokaleNavn) {
        this.lokaleNavn = lokaleNavn;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAntPlasser() {
        return antPlasser;
    }

    public void setAntPlasser(int antPlasser) {
        this.antPlasser = antPlasser;
    }

    @Override
    public String toString() {
        return "Lokale{" + "navn=" + lokaleNavn + ", type=" + type + ", antPlasser=" + antPlasser + '}';
    }
}

//Slutt på klasse Lokale

class KontaktPerson extends Lokale{
    String navn;
    int tlf;
    String epost;
    String nettside;
    String firma;
    String ekstraInfo;

    public KontaktPerson(String navn, int tlf, String epost, String nettside, String firma, String ekstraInfo, String lokaleNavn, String type, int antPlasser) {
        super(lokaleNavn, type, antPlasser);
        this.navn = navn;
        this.tlf = tlf;
        this.epost = epost;
        this.nettside = nettside;
        this.firma = firma;
        this.ekstraInfo = ekstraInfo;
    }

    

    

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public int getTlf() {
        return tlf;
    }

    public void setTlf(int tlf) {
        this.tlf = tlf;
    }

    public String getEpost() {
        return epost;
    }

    public void setEpost(String epost) {
        this.epost = epost;
    }

    public String getNettside() {
        return nettside;
    }

    public void setNettside(String nettside) {
        this.nettside = nettside;
    }

    public String getFirma() {
        return firma;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    public String getEkstraInfo() {
        return ekstraInfo;
    }

    public void setEkstraInfo(String ekstraInfo) {
        this.ekstraInfo = ekstraInfo;
    }

    @Override
    public String toString() {
        return "KontaktPerson{" + "navn=" + navn + ", tlf=" + tlf + ", epost=" + epost + ", nettside=" + nettside + ", firma=" + firma + ", ekstraInfo=" + ekstraInfo + '}';
    }
}

class Arrangement extends KontaktPerson {
    //KontaktPerson 
    //Lokale.type
    String arrNavn;
    String underholder;
    String program;
    //Lokale
    String tid;
    //Billett.pris
    String salg;

    public Arrangement(String arrNavn, String underholder, String program, String tid, String salg, String navn, int tlf, String epost, String nettside, String firma, String ekstraInfo, String lokaleNavn, String type, int antPlasser) {
        super(navn, tlf, epost, nettside, firma, ekstraInfo, lokaleNavn, type, antPlasser);
        this.arrNavn = arrNavn;
        this.underholder = underholder;
        this.program = program;
        this.tid = tid;
        this.salg = salg;
    }

    
}



