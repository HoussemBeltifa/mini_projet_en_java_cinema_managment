package mini_projet;

import java.util.Scanner;

public class salle {
	int id=1;
	int capacité;
	String dateDeConstruction;
	boolean climatisée;
	String FDJ[]; //films de jour
	
	public salle() {
		id++;
	}
	public salle(int c,String d,boolean clt,String f[]) {
		id++;
		capacité=c;
		dateDeConstruction=d;
		climatisée=clt;
		FDJ=f;
	}
	
	public void afficher() {
		System.out.println(" id = "+id+"\n capacité = "+capacité+"\n date de construction = "+dateDeConstruction);
		if(climatisée)
			System.out.println("la salle est climatisée");
		else
			System.out.println("la salle est non climatisée");
		System.out.println("les films de se jour: ");
		for(String i:FDJ)
			System.out.println(i);	
	}
	
	public void ajouterS() {
		Scanner sc=new Scanner(System.in);
		System.out.println("donner la capacité du salle ");
		int c=sc.nextInt();
		System.out.println("donner sa date de construction ");
		String dtt=sc.nextLine();
		System.out.println("la salle est climatiée? taper 1 si oui ");
		int l=sc.nextInt();
		if(l==1)
			climatisée=true;
		else
			climatisée=false;
		System.out.println("donner le nbre maximal des films de se jour ");
		int n=sc.nextInt();
		System.out.println("donner les films");
		String f1[]=new String[n];
		for(int i=0;i<n;i++)
			f1[i]=sc.nextLine();
		capacité=c;
		dateDeConstruction=dtt;
		FDJ=f1;
	}
	
	public void deleteFilm(String f) {
		int c=FDJ.length;
		for(int i=0;i<FDJ.length;i++) {
			if(FDJ[i]==f) {
				c=i;
				break;
			}	
		}
		for(int i=c;i<(FDJ.length-1);i++) {
			FDJ [i]=FDJ[i+1];
		}
		FDJ[FDJ.length-1]="";
	}
}