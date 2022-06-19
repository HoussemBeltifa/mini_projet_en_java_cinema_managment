package mini_projet;

import java.util.Scanner;

public class salle {
	int id=1;
	int capacit�;
	String dateDeConstruction;
	boolean climatis�e;
	String FDJ[]; //films de jour
	
	public salle() {
		id++;
	}
	public salle(int c,String d,boolean clt,String f[]) {
		id++;
		capacit�=c;
		dateDeConstruction=d;
		climatis�e=clt;
		FDJ=f;
	}
	
	public void afficher() {
		System.out.println(" id = "+id+"\n capacit� = "+capacit�+"\n date de construction = "+dateDeConstruction);
		if(climatis�e)
			System.out.println("la salle est climatis�e");
		else
			System.out.println("la salle est non climatis�e");
		System.out.println("les films de se jour: ");
		for(String i:FDJ)
			System.out.println(i);	
	}
	
	public void ajouterS() {
		Scanner sc=new Scanner(System.in);
		System.out.println("donner la capacit� du salle ");
		int c=sc.nextInt();
		System.out.println("donner sa date de construction ");
		String dtt=sc.nextLine();
		System.out.println("la salle est climati�e? taper 1 si oui ");
		int l=sc.nextInt();
		if(l==1)
			climatis�e=true;
		else
			climatis�e=false;
		System.out.println("donner le nbre maximal des films de se jour ");
		int n=sc.nextInt();
		System.out.println("donner les films");
		String f1[]=new String[n];
		for(int i=0;i<n;i++)
			f1[i]=sc.nextLine();
		capacit�=c;
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