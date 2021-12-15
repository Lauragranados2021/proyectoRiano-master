package control;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControlTest {
    /**
     * Escenario por el que creamos y enviamos nuestra lista
     */
    Control control = new Control();
    @Test
    void setUP() {
        control.addLista(1);
        control.addLista(2);
        control.addLista(3);
        control.addLista(4);
        control.addLista(5);
        control.addLista(10);
    }

    /**
     * Test que comprueba que el dato se encuentra dentro del arbol
     */
    @Test
    void addArbol() {
        setUP();
        control.addArbol();
        assertEquals("1",control.findArbol(1));
        assertEquals("3",control.findArbol(3));
        assertEquals("2",control.findArbol(2));
        assertEquals("4",control.findArbol(4));
        assertEquals("5",control.findArbol(5));
        assertNull(control.findArbol(6));
        assertNull(control.findArbol(11));

    }

    /**
     * Muestra la lista para reconocer los nodos
     */
    @Test
    void mostrarLista(){
        setUP();
        for (Integer mos: control.mostrar()){
            System.out.print(mos+"- ");
        }
    }

    /**
     * Test que comprueba que el nodo que elegimos como cabeza, exista y recorra la lista desde esa cabeza
     *
     */
    @Test
    void mostrarDesde(){

       addArbol();
        assertNotNull((control.recorrerApartirDe(control.findArbol(3))));
        assertNotNull((control.recorrerApartirDe(control.findArbol(4))));
        assertNotNull(control.findArbol(10));
        assertNotNull((control.recorrerApartirDe(control.findArbol(2))));
        assertNotNull((control.recorrerApartirDe(control.findArbol(5))));
        assertNotNull((control.recorrerApartirDe(control.findArbol(1))));
        assertNotNull((control.recorrerApartirDe(control.findArbol(10))));



    }

}