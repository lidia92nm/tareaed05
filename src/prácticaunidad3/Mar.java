package prácticaunidad3;

import java.util.HashSet;

/**
 * @author lidia92nm
 */
public class Mar {

    private String nombre;
    private int profundidad;
    private HashSet<Puerto> puertos;

    public Mar() {
    }

    public Mar(String nombre, int profundidad) {
        this.nombre = nombre;
        this.profundidad = profundidad;
    }

    /**
     * Obtiene el nombre del mar
     * 
     * @generated
     */
    private String getNombre() {
        return this.nombre;
    }

    /**
     * Establece el nombre del mar
     * 
     * @generated
     */
    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la profundidad del Mar
     * 
     * @generated
     */
    private int getProfundidad() {
        return this.profundidad;
    }

    /**
     * Establece la profundidad del mar
     * 
     * @generated
     */
    private void setProfundidad(Integer profundidad) {
        this.profundidad = profundidad;
    }

    /**
     * Obtiene los puertos que se ubican en el mar
     * 
     * @generated
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
     * @generated
     */
    public void setPuertos(HashSet<Puerto> puertos) {
        this.puertos = puertos;
    }

    // Operations

    /**
     * Obtiene el puerto ubicado en el mar por Pais
     * 
     * @generated
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

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Mar)) {
            return false;
        }

        Mar objCasteado = (Mar) obj;

        return this.nombre.equals(objCasteado.getNombre());
    }
}
