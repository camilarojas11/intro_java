package punto04.main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Punto 4: Se pide que ingrese por consola dos letras y realice la siguiente operación:
//        a) Mostrar la representación ASCII de las letras en minúsculas y mayúsculas.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una letra: ");
        char primerLetra = scanner.next().charAt(0);
        System.out.println("Ingrese otra letra: ");
        char segundaLetra = scanner.next().charAt(0);

        char primerLetraMayus = Character.toUpperCase(primerLetra);
        char primerLetraMinus = Character.toLowerCase(primerLetra);

        char segundaLetraMayus = Character.toUpperCase(segundaLetra);
        char segundaLetraMinus = Character.toLowerCase(segundaLetra);

        System.out.println("Valores ASCII");
        System.out.println(primerLetraMayus + ": " + (int) primerLetraMayus);
        System.out.println(primerLetraMinus + ": " + (int) primerLetraMinus);
        System.out.println(segundaLetraMayus + ": " + (int) segundaLetraMayus);
        System.out.println(segundaLetraMinus + ": " + (int) segundaLetraMinus);

        scanner.close();
    }
}
