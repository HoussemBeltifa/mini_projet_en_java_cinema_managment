package mini_projet;

import java.util.Scanner;

public class film {
	int id=1;
	String titre;
	String PS; // Premiére Sortie
	String catégorie[]=new String[20];
	int SA[];
	double prix;
	double note;
	
	public film() {
		id++;
	}
	
	public film(String t,String PS,String c[],int SA[],double p,double n) {
		id++;
		titre=t;
		this.PS=PS;
		catégorie=c;
		this.SA=SA;
		prix=p;
		note=n;
	}
	
	public void afficher() {
		System.out.println(" id = "+id+"\n titre = "+titre+" \n Premiére Sortie = "+PS+"\n prix= ="+prix+"\n note = "+note);
		System.out.println("catégorie = ");
		for(String c:catégorie)
			System.out.print(c+" ");
		System.out.println("le trouve dans la salle : ");
		for(int j:SA)
			System.out.println(j);
	}
	
	public void ajouterF() {
		System.out.println("donner le titre du film ");
		Scanner sc=new Scanner(System.in);
		String t=sc.nextLine();
		System.out.println("donner sa premiére sortie ");
		String d=sc.nextLine();
		System.out.println("donner ses catégorie :");
		String c[]=new String[20];
		String h;
		for(int i=0;i<20;i++) {
			System.out.println("taper 0 pour terminer");
			h=sc.nextLine();
			if(h=="0")
				break;
			else
				c[i]=h;
		}
		System.out.println("donner le prix ");
		double p=sc.nextDouble();
		System.out.println("donner sa note ");
		double nt=sc.nextDouble();
		System.out.println("il est dans la salle :");
		int s[]=new int[50];
		int g,j=0;
		while(true) {
			System.out.println("donner la salle id , taper 0 pour terminer");
			g=sc.nextInt();
			if(g==0)
				break;
			else
					s[j]=g;
			j++;
		}
		titre=t;
		PS=d;
	    catégorie=c;
		SA=s;
		prix=p;
		note=nt;
	}
	
	public double Getprix() {
		return prix;
	}

	public double Getnote() {
		return note;
	}

}
