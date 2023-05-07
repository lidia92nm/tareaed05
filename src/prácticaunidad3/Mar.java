package prácticaunidad3;

import java.util.HashSet;

/**
 * @author lidia92nm
 */
public class Mar {

    private String nombre;
    private int profundidad;
    private HashSet<Puerto> puertos;

    /**
     *Constructor por defecto
     */
    public Mar() {
    }

    /**
     * 
     * @param nombre
     * @param profundidad
     */
    public Mar(String nombre, int profundidad) {
        this.nombre = nombre;
        this.profundidad = profundidad;
    }

    /**
     * Obtiene el nombre del mar
     * 
     * 
     */
    private String getNombre() {
        return this.nombre;
    }

    /**
     * Establece el nombre del mar
     * 
     * 
     */
    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la profundidad del Mar
     * 
     * 
     */
    private int getProfundidad() {
        return this.profundidad;
    }

    /**
     * Establece la profundidad del mar
     * 
     * 
     */
    private void setProfundidad(Integer profundidad) {
        this.profundidad = profundidad;
    }

    /**
     * Obtiene los puertos que se ubican en el mar
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
     * Establece los puertos que se ubican en el mar
     * 
     * @param puertos
     * 
     */
    public void setPuertos(HashSet<Puerto> puertos) {
        this.puertos = puertos;
    }

    // Operations

    /**
     * Obtiene el puerto ubicado en el mar por Pais
     * 
     * @param pais
     * @return 
     * 
     */
    public HashSet<Puerto> getPuertosByPais(Pais pais) {
        HashSet<Puerto> puertosFiltrados = new HashSet<>();

        for (Puerto puerto : this.puertos) {
            if (puerto.getPaisOrigen().equals(pais)) {
                puertosFiltrados.add(puerto);
            }
        }

        return puertosFiltrados;
    }

    /**
     *
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Mar)) {
            return false;
        }

        Mar objCasteado = (Mar) obj;

        return this.nombre.equals(objCasteado.getNombre());
    }
}
