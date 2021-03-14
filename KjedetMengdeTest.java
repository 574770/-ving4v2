package no.hvl.dat102.mengde.adt;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import no.hvl.dat102.mengde.kjedet.KjedetMengde;

public class KjedetMengdeTest extends MengdeADTTest {

	@Override
	protected MengdeADT<Integer> reset() {
		// TODO Auto-generated method stub
		return new KjedetMengde<Integer>();
	}

}
