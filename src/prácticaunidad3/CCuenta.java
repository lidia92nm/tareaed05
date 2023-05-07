/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prácticaunidad3;

/**
 *
 * @author ED05
 */
public class CCuenta {

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Constructor sin argumentos
     */
    public CCuenta() {
    }

    /**
     * Constructor con parámetro para iniciar todas las propiedades de la clase
     *
     * @param nom Nombre del titular
     * @param cue IBAN de la cuenta
     * @param sal saldo de la cuenta
     * @param tipo El tipo de la cuenta
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
    }

    /**
     * Método para asignar el nombre del titular de la cuenta
     *
     * @param nom nombre del titular
     */
    public void setNombre(String nom) {
        nombre = nom;
    }

    /**
     * Método que me devuelve el nombre del titular
     *
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método que me devuelve el saldo disponible en cada momento
     *
     * @return
     */
    public double getEstado() {
        return saldo;
    }

    /**
     * Método para ingresar cantidades en la cuenta.Modifica el saldo.Este método va a ser probado con Junit
     * @param cantidad cantidad a ingresar
     * @throws java.lang.Exception
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        saldo = saldo + cantidad;
    }

    /**
     * Método para retirar cantidades en la cuenta.Modifica el saldo.Este método va a ser probado con Junit
     * @param cantidad cantidad a retirar
     * @throws java.lang.Exception
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (getEstado() < cantidad) {
            throw new Exception("No se hay suficiente saldo");
        }
        saldo = saldo - cantidad;
    }

    /**
     * Método que me devuelve el número de cuenta
     * @return 
     */
    public String getCuenta() {
        return cuenta;
    }
}
