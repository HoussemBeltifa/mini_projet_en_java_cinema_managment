package mini_projet;

public class production extends film {
	String nom;
	String ddc; //Date De Cr�ation
	
	public production() {
		
	}
	
	public production(String titre,String PS,String cat�gorie[],int SA[],double prix,double note,String n,String ddc)
	{
		super(titre,PS,cat�gorie,SA,prix,note);
		nom=n;
		this.ddc=ddc;
	}
	
	public void afficher() {
		super.afficher();
		System.out.println(" nom = "+nom+"\n date de cr�ation = "+ddc);
		
	}

}
