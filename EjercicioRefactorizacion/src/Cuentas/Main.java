package Cuentas;
import java.util.Scanner;

import static Cuentas.Operaciones.operativa_cuenta;

/**
 * La clase Main es la clase principal de la aplicación, que se encarga de crear una cuenta y
 * permitir al usuario realizar operaciones básicas en ella, como consultar saldo, realizar depósitos
 * y retirar dinero.
 */
public class Main {
    public static void main(String[] args) {
        // Crear una nueva cuenta
        CCuenta cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
        Scanner in=new Scanner(System.in);
        int opcion;
        double cantidad;
        do {
            // Mostrar las opciones disponibles
            System.out.print("""
                    Elige una opción
                    1 Consultar saldo
                    2 Ingresar
                    3 Retirar
                    4 Salir:""");
            opcion = in.nextInt();
            switch (opcion) {
                //En el primer caso, se muestra el saldo
                case 1 -> System.out.println(cuenta1.getEstado());
                //En el segundo caso, se ingresa en la cuenta
                case 2 -> {
                    System.out.print("Diga una cantidad a ingresar:");
                    cantidad= in.nextDouble();
                    operativa_cuenta(cuenta1, cantidad, opcion);
                }
                //En el tercer caso, se retira de la cuenta
                case 3 -> {
                    System.out.print("Diga una cantidad a retirar:");
                    cantidad= in.nextDouble();
                    operativa_cuenta(cuenta1, cantidad, opcion);
                }
                //En el cuarto caso, se termina el programa
                case 4 -> System.out.println("Adiós:");
                //En cualquier otro caso, da un mensaje de error
                default -> System.out.println("La opción introducida no es válida");
            }
        }while(opcion!=4);
    }
}