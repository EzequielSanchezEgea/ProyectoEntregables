package es.iessoterohernandez.daw.endes.Entregable;

import static org.junit.Assert.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SerieTest {
	private static Serie  serie1, serie2, serie3;

	@BeforeEach
	public void init() {
		 serie1 = new Serie("Breaking Bad", 4, "Drogas", "Alguien");
		 serie2 = new Serie("Ricardo y Mortadelo", 4, "Abuelo Espacial", "Justin Roiland");
		 serie3 = new Serie("Juego de Tronos", 8, "Desconfianza", "GRR Martin");
	}
	@AfterEach
	public void finish() {
		serie1 = serie2 = serie3 = null;
	}
	
    @Test
    public void testIsEntregado() {
    
        assertFalse(serie1.isEntregado());
        serie1.entregar();
        assertTrue(serie1.isEntregado());
        serie1.devolver();
        assertFalse(serie1.isEntregado());
    }

 
    @Test
    public void testCompareTo() {
 
        assertEquals(1, serie3.compareTo(serie2));
        assertEquals(0, serie1.compareTo(serie2));
        assertEquals(-1, serie1.compareTo(serie3));
    }

    @Test
    public void testEquals() {

        assertTrue(serie2.equals(serie2));
        assertFalse(serie1.equals(serie3));
    }
    }
