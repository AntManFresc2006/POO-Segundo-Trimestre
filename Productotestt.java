package CajaNegra;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class ProductoTest {
    private Producto producto;

    // Este método se ejecuta antes de cada prueba para iniciar un producto nuevo.
    @BeforeEach
    void setUp() {
        producto = new Producto();
    }

    // ---------------------- Pruebas para setPrecio() ----------------------

    // Caso 1: Precio válido (intermedio)
    @Test
    void testSetPrecio_Valido() {
        producto.setPrecio(50.0);
        // Se espera que el precio se actualice a 50.0
        assertEquals(50.0, producto.getPrecio(), 0.01);
    }

    // Caso 2: Precio máximo permitido
    @Test
    void testSetPrecio_Maximo() {
        producto.setPrecio(100.0);
        // Se verifica que se acepte el valor máximo
        assertEquals(100.0, producto.getPrecio(), 0.01);
    }

    // Caso 3: Precio superior al máximo permitido
    @Test
    void testSetPrecio_SuperaMaximo() {
        // Se intenta asignar un precio que supera el límite permitido
        producto.setPrecio(150.0);
        // Se espera que el precio no cambie (por ejemplo, que se mantenga el valor inicial, 0.0)
        // o el valor anterior, según la lógica implementada en el método.
        assertNotEquals(150.0, producto.getPrecio(), "El precio no debe cambiar si supera 100");
    }

    // Caso 4: Precio negativo
    @Test
    void testSetPrecio_Negativo() {
        // Se intenta asignar un valor negativo
        producto.setPrecio(-10.0);
        // Se verifica que el precio no se actualice a un valor negativo
        assertNotEquals(-10.0, producto.getPrecio(), "El precio no debe cambiar si es negativo");
    }

    // ---------------------- Pruebas para aplicarDescuento() ----------------------

    // Caso 1: Descuento válido
    @Test
    void testAplicarDescuento_Valido() {
        producto.setPrecio(50.0);
        producto.aplicarDescuento(20);
        // El descuento del 20% en 50.0 da como resultado 40.0
        assertEquals(40.0, producto.getPrecio(), 0.01);
    }

    // Caso 2: Descuento del 100% (caso extremo válido)
    @Test
    void testAplicarDescuento_Maximo() {
        producto.setPrecio(50.0);
        producto.aplicarDescuento(100);
        // Un descuento del 100% debería dejar el precio en 0.0
        assertEquals(0.0, producto.getPrecio(), 0.01);
    }

    // Caso 3: Descuento 0 (no es válido, el precio debe permanecer igual)
    @Test
    void testAplicarDescuento_Cero() {
        producto.setPrecio(50.0);
        producto.aplicarDescuento(0);
        // Se espera que al aplicar 0 no se produzca cambio
        assertEquals(50.0, producto.getPrecio(), 0.01);
    }

    // Caso 4: Descuento negativo (no permitido)
    @Test
    void testAplicarDescuento_Negativo() {
        producto.setPrecio(50.0);
        producto.aplicarDescuento(-10);
        // El precio debe permanecer igual ya que el descuento es negativo
        assertEquals(50.0, producto.getPrecio(), "El precio no debe cambiar con descuento negativo");
    }

    // Caso 5: Descuento mayor a 100% (no permitido)
    @Test
    void testAplicarDescuento_SuperiorCien() {
        producto.setPrecio(50.0);
        producto.aplicarDescuento(110);
        // Se verifica que el precio se mantenga sin cambios
        assertEquals(50.0, producto.getPrecio(), "El precio no debe cambiar con descuento mayor a 100");
    }

    // ---------------------- Pruebas para setIVA() ----------------------

    // Caso 1: IVA válido 21%
    @Test
    void testSetIVA_Valido21() {
        producto.setIVA(21);
        assertEquals(21, producto.getIVA());
    }

    // Caso 2: IVA válido 10%
    @Test
    void testSetIVA_Valido10() {
        producto.setIVA(10);
        assertEquals(10, producto.getIVA());
    }

    // Caso 3: IVA válido 4%
    @Test
    void testSetIVA_Valido4() {
        producto.setIVA(4);
        assertEquals(4, producto.getIVA());
    }

    // Caso 4: IVA no permitido
    @Test
    void testSetIVA_Invalido() {
        producto.setIVA(15);
        // Se verifica que si se pasa un IVA que no está entre los permitidos,
        // el atributo IVA no debe cambiar (dependiendo de la lógica implementada)
        assertNotEquals(15, producto.getIVA(), "El IVA no debe cambiar a un valor no permitido");
    }
}

