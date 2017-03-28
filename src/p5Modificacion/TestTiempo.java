package p5Modificacion;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

public class TestTiempo {
	Tiempo hora;
	@Before
	public void initialize() throws IOException {
		hora = new Tiempo(14, 4, 12);
		
	}
	
	@Test
	public void testNotNull() {
		assertNotNull(hora);
	}
	/**
	 * Test que comprueba que se inicia con los parametros adecuados.
	 */
	@Test
	public void testInicioCorrecto(){
		assertTrue(hora.getHora() == 14) ;
		assertTrue(hora.getMinuto() == 4) ;
		assertTrue(hora.getSegundo() == 12 ) ;
	}
	/**
	 * Test que comprueba que la suma de 1000 segundo de la hora inicial, 
	 * es correcta a la suma de sus minutos + 16
	 */
	@Test
	public void testSumaTiempo(){
		Tiempo hora2 = new Tiempo(hora.getHora(),hora.getMinuto(),hora.getSegundo());
		hora.sumarSegundos(1000);
		hora2.setMinuto(hora2.getMinuto()+ 16 );
		assertTrue(hora.getMinuto() == hora2.getMinuto() ) ;
	}

}
