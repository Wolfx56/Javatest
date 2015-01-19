public class Ville {
	private String nomVille;
	private String nomPays;
	
	private int Habitants;
	
	public Ville () {
		System.out.println ("Création d'une ville");
		nomVille = "Inconnu";
		nomPays  = "Inconnu";
		Habitants = 0;
	}
	
	public Ville (String pNom, String pPays, int nbre) {
		nomVille = pNom;
		nomPays = pPays;
		Habitants  = nbre;
	}
	
	public void Affichage () {
		System.out.println ("Nom du pays : " + nomPays + "\t Nom de la ville : " + nomVille + "\t Nombre d'habitants : " + Habitants);
	}
}
