package no.hvl.dat102.datakontakt;

public class Hobby {

	private String hobbyNavn;

	public Hobby(String hobby) {
		hobbyNavn = hobby;

	}

	public String getHobbyNavn() {
		return this.hobbyNavn;
	}

	public void setHobbyNavn(String hobby) {
		this.hobbyNavn = hobby;
	}

	public String toString() {
		return "<" + hobbyNavn + ">" + "/n";
	}

	public boolean equals(Object hobby2) {
		Hobby h1 = (Hobby)hobby2;
		return hobbyNavn.equals(h1.getHobbyNavn());
				
		
			
			
			

		
	}

}
