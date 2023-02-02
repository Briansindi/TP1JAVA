package Personnes;

abstract class Personne {
	private String nom;
	private String prenom;
	public Personne(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
		}
	public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
	
	private String ValiderChaine (String chaine, int taille) { 
		// Vérifie la taille et renvoie une chaîne tronquée
		// si la taille est supérieure à taille
		return chaine; 
		}
	
	public String toString() {
		return this.nom + " " + this.prenom; 
		}
	}
