package CajaBlanca;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;


public class Examentestt {

    // Pruebas para mensaje(int edad)
	
    @Test //Camino 1: edad == 18
    public void testMensajeEdad18() {
        assertEquals("Ya eres mayor de edad", Examen.mensaje(18));
    }

    @Test //Camino 2: edad == 67
    public void testMensajeEdad67() {
        assertEquals("Ya puedes jubilarte", Examen.mensaje(67));
    }

    @Test //Camino 3: edad != 18 && edad != 67
    public void testMensajeEdadDefault() {
        assertEquals("No pasa nada", Examen.mensaje(20));
    }

    // Pruebas para validar(String dni)
    
    @Test //Camino 1: dni.length() >= 9
    public void testValidarDniValido() {
        assertTrue(Examen.validar("123456789X"));
    }

    @Test //Camino 2: dni.length() < 9
    public void testValidarDniInvalido() {
        assertFalse(Examen.validar("12345678"));
    }
}