package mini_projet;

public class production extends film {
	String nom;
	String ddc; //Date De Création
	
	public production() {
		
	}
	
	public production(String titre,String PS,String catégorie[],int SA[],double prix,double note,String n,String ddc)
	{
		super(titre,PS,catégorie,SA,prix,note);
		nom=n;
		this.ddc=ddc;
	}
	
	public void afficher() {
		super.afficher();
		System.out.println(" nom = "+nom+"\n date de création = "+ddc);
		
	}

}
