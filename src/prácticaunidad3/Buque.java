package prácticaunidad3;

import java.util.List;
import java.util.ArrayList;

/**
 * @author lidia92nm
 */
public class Buque {

    private int id;
    private String nombre;
    private String nombreDuenyo;
    private int tonelaje;
    private String materialCasco;
    private TipoBuque tipoBuque;
    private Puerto lugarOrigen;
    private List<Posicion> posiciones;

    /**
     * Constructor por defecto
     */
    public Buque() {
    }

    /**
     *
     * @param id El id del buque
     * @param nombre El nombre del buque
     * @param nombreDuenyo El nombre del dueño
     * @param tonelaje El tonelaje
     * @param materialCasco El material del casco
     * @param tipoBuque El tipo del buque
     * @param lugarOrigen El lugar de origen
     */
    public Buque(int id,
            String nombre,
            String nombreDuenyo,
            int tonelaje,
            String materialCasco,
            TipoBuque tipoBuque,
            Puerto lugarOrigen) {
        this.id = id;
        this.nombre = nombre;
        this.nombreDuenyo = nombreDuenyo;
        this.tonelaje = tonelaje;
        this.materialCasco = materialCasco;
        this.tipoBuque = tipoBuque;
        this.lugarOrigen = lugarOrigen;
    }

    /**
     * Obtiene le identificador del buque
     *
     * 
     */
    private int getId() {
        return this.id;
    }

    /**
     * Asigna el Identificador del buque
     *
     * 
     */
    private void setId(Integer id) {
        this.id = id;
    }

    /**
     * Obtiene el nombre del buque
     *
     * 
     */
    private String getNombre() {
        return this.nombre;
    }

    /**
     * Asignal el nombre del buque
     *
     * 
     */
    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el nombre del dueño del buque
     *
     * 
     */
    private String getNombreDuenyo() {
        return this.nombreDuenyo;
    }

    /**
     * Asigna el nombre del dueño del buque
     *
     * 
     */
    private void setNombreDuenyo(String nombreDuenyo) {
        this.nombreDuenyo = nombreDuenyo;
    }

    /**
     * Obtiene el tonelaje del buque
     *
     * 
     */
    private int getTonelaje() {
        return this.tonelaje;
    }

    /**
     * Asignal el tonelaje del buque
     *
     * 
     */
    private void setTonelaje(Integer tonelaje) {
        this.tonelaje = tonelaje;
    }

    /**
     * Obtiene el tipo de material del casco del buque
     *
     * 
     */
    private String getMaterialCasco() {
        return this.materialCasco;
    }

    /**
     * Asignal el material del casco del buque
     *
     * 
     */
    private void setMaterialCasco(String materialCasco) {
        this.materialCasco = materialCasco;
    }

    /**
     * Obtiene el tipo de buque
     *
     * 
     */
    private TipoBuque getTipoBuque() {
        return this.tipoBuque;
    }

    /**
     * Asigna el tipo de buque
     *
     * 
     */
    private void setTipoBuque(TipoBuque tipoBuque) {
        this.tipoBuque = tipoBuque;
    }

    /**
     * Obtiene el Puerto al que el buque pertenece
     *
     * @return
     * 
     */
    public Puerto getLugarOrigen() {
        return this.lugarOrigen;
    }

    /**
     * @param lugarOrigen
     * 
     */
    public void setLugarOrigen(Puerto lugarOrigen) {
        this.lugarOrigen = lugarOrigen;
    }

    /**
     * Obtiene el listado de posiciones del buque
     *
     * @return
     * 
     */
    public List<Posicion> getPosiciones() {
        if (this.posiciones == null) {
            this.posiciones = new ArrayList<Posicion>();
        }
        return this.posiciones;
    }

    /**
     * Asigna el lista de posiciones del buque
     *
     * @param posiciones
     * 
     */
    public void setPosiciones(List<Posicion> posiciones) {
        this.posiciones = posiciones;
    }

    // Operations
    /**
     * Registra la posicion en el historico del buque
     *
     * @param posicion
     * 
     */
    public void registrarPosicion(Posicion posicion) {
        this.posiciones.add(posicion);
    }
}
