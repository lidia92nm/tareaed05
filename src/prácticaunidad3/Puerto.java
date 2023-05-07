package prácticaunidad3;

import java.util.HashSet;

/**
 * @author lidia92nm
 */
public class Puerto {

    private String nombre;
    private String descripcion;
    private Mar marOrigen;
    private HashSet<Buque> buques;
    private HashSet<Visita> visitas;
    private Pais paisOrigen;
    private HashSet<Pais> paises;

    /**
     * Asigna el pais de origen del puerto
     * 
     * @generated
     */
    public void setPaisOrigen(Pais paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    /**
     * Obtiene el pais de origen del puerto
     * 
     * @generated
     */
    public Pais getPaisOrigen() {
        return this.paisOrigen;
    }

    /**
     * Obtiene el nombre del puerto
     * 
     * @generated
     */
    private String getNombre() {
        return this.nombre;
    }

    /**
     * Asigna el nombre del puerto
     * 
     * @generated
     */
    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la descripcion del puerto
     * 
     * @generated
     */
    private String getDescripcion() {
        return this.descripcion;
    }

    /**
     * Asigna la descripción del puerto
     * 
     * @generated
     */
    private void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Obtiene el Mar al que pertenece el puerto
     * 
     * @generated
     */
    public Mar getMarOrigen() {
        return this.marOrigen;
    }

    /**
     * Asignal el Mar al que pertenece el puerto
     * 
     * @generated
     */
    public void setMarOrigen(Mar marOrigen) {
        this.marOrigen = marOrigen;
    }

    /**
     * Obtiene los buques que pertenecen al puerto
     * 
     * @generated
     */
    public HashSet<Buque> getBuques() {
        if (this.buques == null) {
            this.buques = new HashSet<Buque>();
        }
        return this.buques;
    }

    /**
     * Asigna un listado de buques al puerto
     * 
     * @generated
     */
    public void setBuques(HashSet<Buque> buques) {
        this.buques = buques;
    }

    /**
     * Obtiene las visitas de los buques realizadas al puerto
     * 
     * @generated
     */
    public HashSet<Visita> getVisitas() {
        if (this.visitas == null) {
            this.visitas = new HashSet<Visita>();
        }
        return this.visitas;
    }

    /**
     * Asignal el listado de buques que han visitado el puerto
     * 
     * @generated
     */
    public void setVisitas(HashSet<Visita> visitas) {
        this.visitas = visitas;
    }

    /**
     * Obtiene la lista de paises en los que esta establecido el puerto
     * 
     * @generated
     */
    public HashSet<Pais> getPaises() {
        if (this.paises == null) {
            this.paises = new HashSet<Pais>();
        }
        return this.paises;
    }

    /**
     * Asigna el listado de paises a los que pertenece el puerto
     * 
     * @generated
     */
    public void setPaises(HashSet<Pais> paises) {
        this.paises = paises;
    }

    // Operations

    /**
     * Registra una visita realizada por un buque
     * 
     * @generated
     */
    public void registrarVisita(Visita visita) {
        this.visitas.add(visita);
    }
}
