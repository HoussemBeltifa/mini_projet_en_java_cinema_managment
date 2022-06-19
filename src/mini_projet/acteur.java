package mini_projet;

import java.util.Scanner;

public class acteur extends film {
	String nom;
	String prenom;
	String ddn; //date de naissance
	
	public acteur() {
		
	}
	
	public acteur(String titre,String PS,String catégorie[],int SA[],double prix,double note,String n,String p,String ddn) {
		super(titre,PS,catégorie,SA,prix,note);
		nom=n;
		prenom=p;
		this.ddn=ddn;
	}
	
	public void afficher() {
		super.afficher();
		System.out.println(" nom = "+nom+"\n prenom = "+prenom+"\n ddn = "+ddn);
		
	}
	
	public void ajouter() {
		super.ajouterF();
		System.out.println("donner le nom ");
		Scanner sc=new Scanner(System.in);
		String n=sc.nextLine();
		System.out.println("donner le prenom ");
		String p=sc.nextLine();
		System.out.println("donner la date de naissance ");
		String ddn=sc.nextLine();
		nom=n;
		prenom=p;
		this.ddn=ddn;
	}
	
}
