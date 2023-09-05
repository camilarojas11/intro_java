package punto03.main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//    Punto 3: Realizar un programa que permita al usuario ingresar por consola dos números y realice las siguientes operaciones:
//    a) El usuario debe poder ingresar la cantidad de decimales que desea ver en el resultado.
//    b) Sacar la potencia de los números ingresados

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        double primerNumero = scanner.nextDouble();
        System.out.println("Ingrese el segundo numero: ");
        double segundoNumero = scanner.nextDouble();
        System.out.println("Ingrese la cantidad de decimales que desea ver en el resultado: ");
        int cantDecimales = scanner.nextInt();

        double resultadoPotencia = Math.pow(primerNumero, segundoNumero);
        String resultadoAMostrar = String.format("%." + cantDecimales + "f", resultadoPotencia);

        System.out.println("El resultado es: " + resultadoAMostrar);

    }
}
