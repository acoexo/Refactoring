package Cuentas;

/**
 * Clase Cuenta
 */
public class CCuenta {
    private String nombre;
    private String numeroCuenta;
    private double saldo;
    private double tipoInteres;

    /**
     * Constructor por defecto
     */
    public CCuenta() {}

    /**
     * Constructor con parámetros
     * @param nombre el nombre de la cuenta
     * @param numeroCuenta el número de cuenta
     * @param saldo el saldo inicial
     * @param tipoInteres el tipo de interés
     */
    public CCuenta(String nombre, String numeroCuenta, double saldo, double tipoInteres) {
        this.nombre = nombre;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoInteres = tipoInteres;
    }

    /**
     * Devuelve el saldo actual de la cuenta
     * @return el saldo actual
     */
    public double getEstado() {
        return saldo;
    }
    /**
     * Valida si la cantidad es negativa
     * @param cantidad la cantidad a validar
     * @throws IllegalArgumentException si la cantidad es negativa
     */
    private void validarCantidadNoNegativa(double cantidad) {
        if (cantidad < 0) {
            throw new IllegalArgumentException("La cantidad no puede ser negativa");
        }
    }

    /**
     * Realiza un ingreso en la cuenta
     * @param cantidad la cantidad a ingresar
     * @throws IllegalArgumentException si la cantidad es negativa
     */
    public void ingresar(double cantidad) {
        validarCantidadNoNegativa(cantidad);
        saldo += cantidad;
    }
    /**
     * Realiza una retirada de dinero de la cuenta
     * @param cantidad la cantidad a retirar
     * @throws IllegalArgumentException si la cantidad es negativa
     * @throws IllegalStateException si no hay suficiente saldo en la cuenta
     */
    public void retirar(double cantidad) {
        validarCantidadNoNegativa(cantidad);
        if (saldo < cantidad) {
            throw new IllegalStateException("No hay suficiente saldo en la cuenta");
        }
        saldo -= cantidad;
    }

    /**
     * Devuelve el número de cuenta
     * @return el número de cuenta
     */
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    /**
     * Devuelve el tipo de interés
     * @return el tipo de interés
     */
    public double getTipoInteres() {
        return tipoInteres;
    }

    /**
     * Actualiza el tipo de interés
     * @param tipoInteres el nuevo tipo de interés
     */
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    /**
     * Devuelve el nombre de la cuenta
     * @return el nombre de la cuenta
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Actualiza el nombre de la cuenta
     * @param nombre el nuevo nombre de la cuenta
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
