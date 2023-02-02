package Personnes;

public class Deposant extends Personne {
    private String civilite;
    private String mail;
    private Adresse adresse;

    public Deposant(String nom, String prenom, String civilite, String mail, Adresse adresse) {
        super(nom, prenom);
        this.civilite = civilite;
    }

    public String getCivilite() {
        return civilite;
    }

    public void setCivilite(String civilite) {
        this.civilite = civilite;
    }
    
    public String getMail() {
    	return mail;
    }
    
    public void setMail(String mail) {
    	this.mail = mail;
    }
    
    public Adresse getAdresse() {
    	return adresse;
    }
    
    public void setAdresse(Adresse adresse) {
    	this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "Deposant{" +
                "nom='" + getNom () +'\'' +
                ", prenom='" + getPrenom() + '\'' +
                ", civilite= '" + getCivilite() + '\'' +
                ", mail= '" + getMail() + '\'' +
                ", adresse='" + getAdresse() +'\'' +
                '}';
    }
}