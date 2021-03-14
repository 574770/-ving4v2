package no.hvl.dat102.datakontakt;

public class Datakontakt {

	private int AntallMedlemmer;
	private Medlem[] mTab;
	public int antall;
	
    // Konstruktør
	
	public Datakontakt(int n) {
		mTab = new Medlem[n];
		AntallMedlemmer = 0;
	}
	public void maksAntallMedlemmer(int maksAntallMedlemmer) {
		mTab = new Medlem[maksAntallMedlemmer];
		AntallMedlemmer = 0;
	}

	public void leggTilMedlem(Medlem person) {
		if (AntallMedlemmer >= mTab.length) {
			System.out.println("Tabellen er full");
		} else {
			mTab[AntallMedlemmer] = person;
			AntallMedlemmer++;
		}
	}

	public int finnMedlemsIndeks(String medlemsnavn) {

		for (int i = 0; i < mTab.length; i++) {
			if (mTab[i].getNavn().equals(medlemsnavn)) {
				return i;
			}
		}
		return -1;

	}

	public int FinnPartnerFor(String medlemsnavn) {
		int indeks = finnMedlemsIndeks(medlemsnavn);
		if (indeks != -1 && mTab[indeks].getStatusIndeks() == -1) {
			for (int i = 0; i < AntallMedlemmer; i++) {
				if (mTab[indeks].passerTil(mTab[i]) && mTab[i].getStatusIndeks() == -1) {
					mTab[indeks].setStatusIndeks(i);
					mTab[i].setStatusIndeks(indeks);
					
					return i;
				}
				

			}

		}
		return -1;

	}

	public void tilbakestillStatus(String medlemsnavn) {

		int indeks = mTab[finnMedlemsIndeks(medlemsnavn)].getStatusIndeks();
		if (indeks != -1) {
			mTab[finnMedlemsIndeks(medlemsnavn)].setStatusIndeks(-1);
			mTab[indeks].setStatusIndeks(-1);
		}
	}

	public void print() {
		for(int i = 0; i<AntallMedlemmer; i++) {
			mTab[i].utskrift();
		}
	
	}
	public Medlem[] tab() {
		return this.mTab;
	}
	
	
		
	}

