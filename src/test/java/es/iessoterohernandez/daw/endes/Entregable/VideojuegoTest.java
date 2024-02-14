package es.iessoterohernandez.daw.endes.Entregable;

import static org.junit.Assert.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class VideojuegoTest {
	private static Videojuego videojuego1, videojuego2;
	
	@BeforeEach
	public void init() {
	videojuego1 = new Videojuego ("Sonic", 20, "Plataformas", "Sega");
	videojuego2 = new Videojuego ("ST 5", 40, "Lucha", "Capcom");
	}
	@AfterEach
	public void finifsh() {
		videojuego1= null;
		videojuego2= null;
	}
	
	 @Test
	    public void testEntregar() {
	        videojuego1.entregar();
	        assertTrue(videojuego1.isEntregado());
	    }

	    @Test
	    public void testDevolver() {
	        videojuego2.entregar();
	        videojuego2.devolver();
	        assertFalse(videojuego2.isEntregado());
	    }

	    @Test
	    public void testIsEntregado() {
	        assertFalse(videojuego1.isEntregado());
	        videojuego1.entregar();
	        assertTrue(videojuego1.isEntregado());
	    }
	    
	    @Test
	    public void testCompareTo() {
	        
	        assertTrue(videojuego2.compareTo(videojuego1) > 0);
	        assertTrue(videojuego1.compareTo(videojuego2) < 0);
	        
	        videojuego1.setHorasEstimadas(30);
	        videojuego2.setHorasEstimadas(30);
	        assertTrue(videojuego1.compareTo(videojuego2) == 0);
	    }

	    @Test
	    public void testEquals() {
	        Videojuego videojuego3 = new Videojuego();
	        videojuego3.setTitulo("Sonic");
	        videojuego3.setcompañia("Sega");
	        
	        assertTrue(videojuego1.equals(videojuego3));
	        assertFalse(videojuego1.equals(videojuego2));
	    }
}
