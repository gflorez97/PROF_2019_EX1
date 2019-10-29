package es.upm.grise.profundizacion2019.ex1;

import static org.junit.Assert.*;

import org.junit.Test;

import es.upm.grise.profundizacion2019.ex1.ClaseExamen;

public class ClaseExamenTest {
	
	ClaseExamen claseEx = new ClaseExamen();

	//1 3 4 6
	@Test
	public void test1() {
		assertEquals(0, claseEx.metodoAProbar(1, 1), 0);
	}
	
	//1 2 1 3 4 6
	@Test
	public void test2() {
		assertEquals(0, claseEx.metodoAProbar(2, 1), 0);
	}

	//El tercer caso de prueba no se puede implementar, ver hoja
}