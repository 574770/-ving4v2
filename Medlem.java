package no.hvl.dat102.datakontakt;

import no.hvl.dat102.mengde.adt.MengdeADT;

public class Medlem {
	private String navn;
	private MengdeADT<Hobby> hobbyer;
	private int statusIndeks;

	// Konstruktør

	public Medlem(String navn, MengdeADT<Hobby> hobbyer) {
		this.navn = navn;
		this.statusIndeks = -1;
		this.hobbyer = hobbyer;

	}


	public String getNavn() {
		return this.navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;

	}

	public MengdeADT<Hobby> getHobbyer() {
		return this.hobbyer;
	}

	public void setHobby(MengdeADT<Hobby> hobbyer) {
		this.hobbyer = hobbyer;
	}

	public int getStatusIndeks() {
		return this.statusIndeks;
	}

	public void setStatusIndeks(int StatusIndeks) {
		this.statusIndeks = StatusIndeks;
	}

	public boolean passerTil (Medlem medlem2) {
		boolean passer = false;
		
		if (getHobbyer().equals(medlem2.getHobbyer())) {
			
		//  this.setStatusIndeks(medlem2.getStatusIndeks());
			passer = true;
			
		}
		
		return passer;
		
		
	}
	
	@Override
	public String toString() {
		String res = "Navn:\t" + navn + "\t";
		res += "Hobbyer:\t " + hobbyer.toString() + "\t" + "Status indeks:\t" + statusIndeks;
		return res;
	}
	
	public void utskrift () {
		System.out.println(this.toString());
	}
}


