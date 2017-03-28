package p5Modificacion;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

public class ClockTest {
	Clock temporizador;
	@Before
	public void initialize() throws IOException {
		temporizador = new Clock();
		
	}
	@Test
	public void testInicializado(){
		assertTrue(0 == temporizador.getInicio());
		assertTrue(0 == temporizador.getFin());
	}
	@Test
	public void testFinMayor() {
		final int MAX = 1000000000;
		temporizador.restart();
		temporizador.start();
		int total = 0;
		for (int i = 0; i < MAX; i++) {
	         total += i;
	      }
		temporizador.stop();
		assertTrue(temporizador.getFin() > temporizador.getInicio());
	}

}
