
package semestertest;

/**
 *
 * @author leost
 */
class Lokale{
    String navn;
    String type;
    int antPlasser;

    public Lokale(String navn, String type, int antPlasser) {
        this.navn = navn;
        this.type = type;
        this.antPlasser = antPlasser;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
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
        return "Lokale{" + "navn=" + navn + ", type=" + type + ", antPlasser=" + antPlasser + '}';
    }
}

//Slutt på klasse Lokale

class KontaktPerson{
    String navn;
    int tlf;
    String epost;
    String nettside;
    String firma;
    String ekstraInfo;
    
    
}

class Arrangement{
    //KontaktPerson 
    //Lokale.type
    String arrNavn;
    String underholder;
    String program;
    //Lokale
    String tid;
    //Billett.pris
    String salg;
}

class Billett{
    int plassnummer;
    //Lokale.navn
    String dato;
    String tid;
    int pris;
    int kundeTlf;
}

