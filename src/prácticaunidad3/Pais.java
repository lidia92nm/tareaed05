package prácticaunidad3;

import java.util.HashSet;

/**
 * @author lidia92nm
 */
public class Pais {

    private String nombre;
    private String continente;
    private HashSet<Puerto> puertos;

    /**
     * Constructor por defecto
     */
    public Pais() {
    }

    /**
     *
     * @param nombre
     * @param continente
     */
    public Pais(String nombre, String continente) {
        this.nombre = nombre;
        this.continente = continente;
    }

    /**
     * Obtiene el nombre del pais
     *
     *
     */
    private String getNombre() {
        return this.nombre;
    }

    /**
     * Establece el nombre del pais
     *
     *
     */
    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el continente al que pertenece el pais
     *
     *
     */
    private String getContinente() {
        return this.continente;
    }

    /**
     * Establece el continente al que pertenece el pais
     *
     *
     */
    private void setContinente(String continente) {
        this.continente = continente;
    }

    /**
     * Obtiene el listado de puerto que tiene el pais
     *
     * @return
     *
     */
    public HashSet<Puerto> getPuertos() {
        if (this.puertos == null) {
            this.puertos = new HashSet<Puerto>();
        }
        return this.puertos;
    }

    /**
     * Establece el listado de puertos del pais
     *
     * @param puertos
     *
     */
    public void setPuertos(HashSet<Puerto> puertos) {
        this.puertos = puertos;
    }

    // Operations
    /**
     * Obtiene el puerto cuyo mar sea identico al especificado
     *
     * @param mar
     * @return
     *
     */
    public Puerto getPuertosByMar(Mar mar) {
        for (Puerto puerto : puertos) {
            if (puerto.getMarOrigen().equals(mar)) {
                return puerto;
            }
        }

        return null;
    }

    /**
     *
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Pais)) {
            return false;
        }

        Pais objCasteado = (Pais) obj;

        return this.nombre.equals(objCasteado.getNombre());
    }
}
