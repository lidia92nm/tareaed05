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
     * @param posicionBuque
     */
    public Visita(Posicion posicionBuque) {
        this.posicionBuque = posicionBuque;
    }

    /**
     * Obtiene la posicion del buque
     * 
     * @return 
     * 
     */
    public Posicion getPosicionBuque() {
        return this.posicionBuque;
    }

    /**
     * @param posicionBuque
     * 
     */
    public void setPosicionBuque(Posicion posicionBuque) {
        this.posicionBuque = posicionBuque;
    }

    // Operations

    /**
     * Obtiene el buque que ha realizado la visita
     * 
     * @return 
     * 
     */
    public Buque getBuque() {
        return this.posicionBuque.getBuque();
    }

}
