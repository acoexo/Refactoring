package Cuentas;

/**
 * Clase Operaciones
 */
public class Operaciones {

    /**
     * Realiza una operación en la cuenta especificada.
     *
     * @param cuenta1 La cuenta en la que se realizará la operación.
     * @param cantidad La cantidad que se ingresará o retirará de la cuenta.
     * @param opcion La opción seleccionada (1 para retirar, 2 para ingresar).
     * @throws RuntimeException si la opción seleccionada no es válida.
     */
    public static void operativa_cuenta(CCuenta cuenta1, double cantidad, int opcion) {
        if(opcion==1) {
            try {
                // Retirar la cantidad especificada de la cuenta
                cuenta1.retirar(cantidad);
                System.out.println("Retiro exitoso");
            } catch (Exception e) {
                // Manejar una excepción si ocurre un error al retirar
                System.out.print("Fallo al retirar");
            }
        } else if(opcion==2) {
            try {
                // Ingresar la cantidad especificada en la cuenta
                cuenta1.ingresar(cantidad);
                System.out.println("Ingreso exitoso");
            } catch (Exception e) {
                // Manejar una excepción si ocurre un error al ingresar
                System.out.print("Fallo al ingresar");
            }
        } else {
            throw new RuntimeException(opcion + " no es una opción válida");
        }
    }
}