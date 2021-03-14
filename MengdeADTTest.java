package no.hvl.dat102.mengde.adt;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public abstract class MengdeADTTest {

	// Testdata
	private int en = 1;
	private int to = 2;
	private int tre = 3;
	private int fire = 4;
	private int fem = 5;

	// Referanser til mengde
	private MengdeADT<Integer> m1;
	private MengdeADT<Integer> m2;
	private MengdeADT<Integer> fasit;

	protected abstract MengdeADT<Integer> reset();

	@BeforeEach
	public void setup() {
		m1 = reset();
		m2 = reset();
		fasit = reset();

	}

	@Test
	public void snitt() {
		m1.leggTil(en);
		m1.leggTil(to);
		m1.leggTil(tre);
		m1.leggTil(fire);

		m2.leggTil(tre);
		m2.leggTil(to);
		m2.leggTil(en);
		m2.leggTil(fem);

		fasit.leggTil(tre);
		fasit.leggTil(to);
		fasit.leggTil(en);

		assertEquals(fasit, m1.snitt(m2));
	}

	@Test
	public void union() {
		m1.leggTil(en);
		m1.leggTil(to);
		m1.leggTil(fire);

		m2.leggTil(tre);
		m2.leggTil(fem);

		fasit.leggTil(en);
		fasit.leggTil(to);
		fasit.leggTil(tre);
		fasit.leggTil(fire);
		fasit.leggTil(fem);

		assertEquals(fasit, m1.union(m2));

	}

	@Test
	public void differens() {
		m1.inneholder(en);
		m1.inneholder(to);
		m1.inneholder(tre);

		m2.inneholder(fire);
		m2.inneholder(fem);

		fasit.inneholder(en);
		fasit.inneholder(to);
		fasit.inneholder(tre);

		assertEquals(fasit, m1.differens(m2));

	}
}
