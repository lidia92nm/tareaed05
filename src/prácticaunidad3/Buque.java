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

    public Buque() {
    }

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
     * @generated
     */
    private int getId() {
        return this.id;
    }

    /**
     * Asigna el Identificador del buque
     *
     * @generated
     */
    private void setId(Integer id) {
        this.id = id;
    }

    /**
     * Obtiene el nombre del buque
     *
     * @generated
     */
    private String getNombre() {
        return this.nombre;
    }

    /**
     * Asignal el nombre del buque
     *
     * @generated
     */
    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el nombre del dueño del buque
     *
     * @generated
     */
    private String getNombreDuenyo() {
        return this.nombreDuenyo;
    }

    /**
     * Asigna el nombre del dueño del buque
     *
     * @generated
     */
    private void setNombreDuenyo(String nombreDuenyo) {
        this.nombreDuenyo = nombreDuenyo;
    }

    /**
     * Obtiene el tonelaje del buque
     *
     * @generated
     */
    private int getTonelaje() {
        return this.tonelaje;
    }

    /**
     * Asignal el tonelaje del buque
     *
     * @generated
     */
    private void setTonelaje(Integer tonelaje) {
        this.tonelaje = tonelaje;
    }

    /**
     * Obtiene el tipo de material del casco del buque
     *
     * @generated
     */
    private String getMaterialCasco() {
        return this.materialCasco;
    }

    /**
     * Asignal el material del casco del buque
     *
     * @generated
     */
    private void setMaterialCasco(String materialCasco) {
        this.materialCasco = materialCasco;
    }

    /**
     * Obtiene el tipo de buque
     *
     * @generated
     */
    private TipoBuque getTipoBuque() {
        return this.tipoBuque;
    }

    /**
     * Asigna el tipo de buque
     *
     * @generated
     */
    private void setTipoBuque(TipoBuque tipoBuque) {
        this.tipoBuque = tipoBuque;
    }

    /**
     * Obtiene el Puerto al que el buque pertenece
     *
     * @generated
     */
    public Puerto getLugarOrigen() {
        return this.lugarOrigen;
    }

    /**
     * @generated
     */
    public void setLugarOrigen(Puerto lugarOrigen) {
        this.lugarOrigen = lugarOrigen;
    }

    /**
     * Obtiene el listado de posiciones del buque
     *
     * @generated
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
     * @generated
     */
    public void setPosiciones(List<Posicion> posiciones) {
        this.posiciones = posiciones;
    }

    // Operations
    /**
     * Registra la posicion en el historico del buque
     *
     * @generated
     */
    public void registrarPosicion(Posicion posicion) {
        this.posiciones.add(posicion);
    }
}
