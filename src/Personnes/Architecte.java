package Personnes;

public class Architecte extends Personne {

	private Object conseilRegional;
	private String adresse;
	private boolean inscriptionOrdre;
	private String telephone;
	public Architecte(String nom, String prenom, String conseilRegional, boolean inscriptionOrdre, String adresse, String telephone){
		super(nom, prenom);
		this.conseilRegional = conseilRegional;
		this.setInscriptionOrdre(inscriptionOrdre);
		this.adresse = adresse;
		this.telephone = telephone;
		if (telephoneValide(telephone))
		{ 
			this.telephone = telephone; 
			}
		else { 
			this.telephone = ""; 
			}
		}
	private boolean telephoneValide(String telephone)
	{
		return true;
	}
	public void Maj_conseilRegional(Object conseilRegional) {
		 this.conseilRegional = conseilRegional;
	}// renvoie une chaine contenant le nom, le prenom, le conseil regional et le numero de telephone de l'architecte ainsi que la mention "inscrit" s'il est inscrit au conseil de l'ordre ou "non inscrit" dans le cas contraire 
	public String toString (){
		return "Architecte{" +
                "nom='" + getNom() + '\'' +
                ", prenom='" + getPrenom() + '\'' +
                ", conseilRegional='" + conseilRegional + '\'' +
                ", adresse='" + adresse + '\'' +
                ", telephone='" + telephone + '\'' +
                '}';
	}
	public boolean isInscriptionOrdre() {
		return inscriptionOrdre;
	}
	public void setInscriptionOrdre(boolean inscriptionOrdre) {
		this.inscriptionOrdre = inscriptionOrdre;
	}
}
