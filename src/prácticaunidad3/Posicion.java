package prácticaunidad3;

import java.util.Date;

/**
 * @author lidia92nm
 */
public class Posicion {

    private int latitud;
    private int longitud;
    private Date timestamp;
    private Buque buque;

    public Posicion() {
    }

    public Posicion(int latitud, int longitud, Date timestamp, Buque buque) {
        this.latitud = latitud;
        this.longitud = longitud;
        this.timestamp = timestamp;
        this.buque = buque;
    }

    /**
     * Obtiene la latitud de la posicion
     * 
     * @generated
     */
    private int getLatitud() {
        return this.latitud;
    }

    /**
     * Establece la latitud de la posicion
     * 
     * @generated
     */
    private void setLatitud(Integer latitud) {
        this.latitud = latitud;
    }

    /**
     * Obtiene al latitud de la posicion
     * 
     * @generated
     */
    private int getLongitud() {
        return this.longitud;
    }

    /**
     * Establece la longitud de la posicion
     * 
     * @generated
     */
    private void setLongitud(Integer longitud) {
        this.longitud = longitud;
    }

    /**
     * Obtiene la fecha y hora de la posicion
     * 
     * @generated
     */
    private Date getTimestamp() {
        return this.timestamp;
    }

    /**
     * Establece la fecha y hora de la posicion
     * 
     * @generated
     */
    private void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * Obtiene el buque perteneciente de la posicion
     * 
     * @generated
     */
    public Buque getBuque() {
        return this.buque;
    }

    /**
     * Establece el buque al que le pertenece esta posicion
     * 
     * @generated
     */
    public void setBuque(Buque buque) {
        this.buque = buque;
    }
}
