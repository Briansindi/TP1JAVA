package Personnes;

public class Adresse {
    private int numero;
    private String voie;
    private String ville;
    private String codePostal;

    public Adresse(int numero, String voie, String ville, String codePostal) {
        this.numero = numero;
        this.voie = voie;
        this.ville = ville;
        this.codePostal = codePostal;
    }

    public boolean validerChaine(String chaine) {
        // Validation de la chaine
        // Retourne true si la chaine est valide, false sinon
        return true;
    }

    public String getAdresse() {
        return numero + " " + voie + " " + ville + " " + codePostal;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getVoie() {
        return voie;
    }

    public void setVoie(String voie) {
        this.voie = voie;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }
    
    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }
}