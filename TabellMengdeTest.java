package no.hvl.dat102.mengde.adt;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import no.hvl.dat102.mengde.tabell.TabellMengde;

public class TabellMengdeTest extends MengdeADTTest {

	@Override
	protected MengdeADT<Integer> reset() {
		// TODO Auto-generated method stub
		return new TabellMengde<Integer>();
	}

}
