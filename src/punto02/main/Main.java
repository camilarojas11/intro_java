package punto02.main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//      Punto 2: Generar un programa que permita al usuario ingresar por consola en la misma línea el primer nombre y apellido y realice las siguientes operaciones:
//      a) Mostrar el nombre y apellido por separado
//      b) Mostrar iniciales en Mayúscula

        String iniciales = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre y apellido:\n");

        String nombreCompleto = scanner.nextLine();

        //Dividir nombre
        String[] nombreSeparado = nombreCompleto.split(" ");

        for (String s : nombreSeparado) {
            System.out.print(s + " ");

            //Tomar las iniciales
            char inicial = Character.toUpperCase(s.charAt(0));
            iniciales += inicial;
        }

        System.out.println("\nIniciales: " + iniciales);

    }
}
