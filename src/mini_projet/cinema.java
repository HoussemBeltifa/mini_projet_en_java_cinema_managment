package mini_projet;

import java.util.Scanner;

public class cinema {
	int id=1;
	String nom;
	String adresse;
	int nbreDeSalle;
	salle S[];
	
	public cinema() {
		id++;
	}
	
	public cinema(String nom,String adresse,int nbreDeSalle,salle S[]) {
		id++;
		this.nom=nom;
		this.adresse=adresse;
		this.nbreDeSalle=nbreDeSalle;
		this.S=S;
	}
	
	public void afficher() {
		System.out.println("id = "+id+"\n nom = "+nom+"\n adresse = "+adresse+"\n nbreDeSalle = "+nbreDeSalle);
		for(salle el:S)
			el.afficher();
	}
	
	public String GetAdresse() {
		return adresse;
	}
	
	public void ajouterC() {
		Scanner sc=new Scanner(System.in);
		System.out.println("donner le nom du cinema ");
		String m=sc.nextLine();
		System.out.println("donner l'adresse ");
		String a=sc.nextLine();
		System.out.println("donner les nbre de salle ");
		int n=sc.nextInt();
		System.out.println("ajouter votre salles ");
		salle s1[]=new salle[n];
		for(int i=0;i<n;i++) {
			s1[i]= new salle();
			s1[i].ajouterS();
		}
		id++;
		nom=m;
		adresse=a;
		nbreDeSalle=n;
		S=s1;
	}

}
