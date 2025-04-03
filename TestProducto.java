package Cajanegra;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestProducto {

    @Test
    void precioInicialEsCero() {
        Producto p = new Producto();
        p.aplicarDescuento(50);
        p.getPrecio();
        
        }

    @Test
    void precioMenorDe0() {
        Producto p = new Producto();
        p.setPrecio(-1.0);
        p.getPrecio();

    }

    @Test
    void precioMayorDe100() {
    	Producto p = new Producto();
        p.setPrecio(150.0);
        p.getPrecio();
    }


    @Test
    void aplicaDescuentoValido() {
        Producto producto = new Producto();
        double precioInicial = 100.0;
        int descuento = 25;
        double esperado = 75.0;
        
        producto.setPrecio(precioInicial);
        producto.aplicarDescuento(descuento);
        
        double actual = producto.getPrecio();
        assertEquals(esperado, actual);
    }

    @Test
    void noAplicaDescuentoInvalido() {
        Producto producto = new Producto();
        double precioInicial = 100.0;
        int descuentoInvalido = 110;
        double esperado = precioInicial;
        
        producto.setPrecio(precioInicial);
        producto.aplicarDescuento(descuentoInvalido);
        
        double actual = producto.getPrecio();
        assertEquals(esperado, actual);
    }
}