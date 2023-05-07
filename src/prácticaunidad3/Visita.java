package prácticaunidad3;

/**
 * @author lidia92nm
 */
public class Visita {

    private Posicion posicionBuque;

    /**
     * Constructor por defecto
     */
    public Visita() {
    }

    /**
     * Constructor
     * 
     */
    public Visita(Posicion posicionBuque) {
        this.posicionBuque = posicionBuque;
    }

    /**
     * Obtiene la posicion del buque
     * 
     * @generated
     */
    public Posicion getPosicionBuque() {
        return this.posicionBuque;
    }

    /**
     * @generated
     */
    public void setPosicionBuque(Posicion posicionBuque) {
        this.posicionBuque = posicionBuque;
    }

    // Operations

    /**
     * Obtiene el buque que ha realizado la visita
     * 
     * @generated
     */
    public Buque getBuque() {
        return this.posicionBuque.getBuque();
    }

}
