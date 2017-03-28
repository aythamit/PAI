package p3GameOfLife;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

public class GameOfLifeTest {
	Matrix tableroPrueba;
	
	@Before
	public void initialize() throws IOException {
		String in = "input.txt";
		tableroPrueba = new Matrix(in);
	}

	@Test
	public void testGetCell() {
		tableroPrueba.setCell(2, 2, "o");
		assertTrue(tableroPrueba.getCell(2, 2).toString() == "o");
		
	}

	@Test
	public void testTodosMuertos() {
		System.out.println("Test Comprobar si todos estan Muertos.");
		tableroPrueba.mostrarMatriz();
		assertFalse(tableroPrueba.todosMuertos());
	}

	@Test
	public void testInRange() throws IOException {
		assertFalse(tableroPrueba.inRange(-1, 0));
	}

}
