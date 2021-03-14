package no.hvl.dat102.datakontakt;

import no.hvl.dat102.mengde.kjedet.KjedetMengde;

public class Tekstgrensesnitt {

	public static void main(String[] args) {
		
        Datakontakt tab = new Datakontakt(30);
		
		Hobby h1 = new Hobby ("Fotball");
		Hobby h2 = new Hobby ("Ski");
		
		KjedetMengde<Hobby>hMengde = new KjedetMengde<Hobby>();
		KjedetMengde<Hobby>hMengde2 = new KjedetMengde<Hobby>();
		
		hMengde.leggTil(h1);
		hMengde2.leggTil(h2);
		
		Medlem medlem1 = new Medlem("Karl", hMengde);
		Medlem medlem2 = new Medlem("Ole", hMengde2);
		Medlem medlem3 = new Medlem("Kari", hMengde);
		Medlem medlem4 = new Medlem("Per", hMengde2);
		
		tab.leggTilMedlem(medlem1);
		tab.leggTilMedlem(medlem2);
		tab.leggTilMedlem(medlem3);
		tab.leggTilMedlem(medlem4);
		
		tab.FinnPartnerFor("Karl");
		tab.FinnPartnerFor("Ole");
		tab.FinnPartnerFor("Kari");
		tab.FinnPartnerFor("Per");
		
		skrivHobbyListe(medlem1);
		skrivParListe(tab);
		
		

	}
	
	public static void skrivHobbyListe(Medlem medlem) {
		System.out.println("Alle hobbyene");
		System.out.println(medlem.getHobbyer().toString());
		
		
	}
	public static void skrivParListe(Datakontakt akriv) {
		Medlem[] tab = akriv.tab();
		String space = "\t \t";
		
		
		for (int i = 0; i< akriv.antall; i++) {
			if(tab[i].getStatusIndeks() != -1) {
				System.out.println(tab[i].getNavn() + " og " + tab[tab[i].getStatusIndeks()] + space + tab[i].getHobbyer());
			}
			
		}
		
	}

}
