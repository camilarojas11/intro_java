package punto05.main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//     Punto 5: Dado tres variables numéricas enteras, leer sus valores por consola y luego informar cuál de ellas es la mayor.
//     Ejemplo: int nro1 = 100, nro2 = 500, nro3 = 250; Salida “La mayor es 500”.

        int[] listaNumeros = new int[3];
        int mayor = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el 1er nro");
        listaNumeros[0] = scanner.nextInt();
        System.out.println("Ingrese el 2do nro");
        listaNumeros[1] = scanner.nextInt();
        System.out.println("Ingrese el 3er nro");
        listaNumeros[2] = scanner.nextInt();

        for (int numero : listaNumeros){
            if (numero > mayor){
                mayor = numero;
            }
        }

        System.out.println("El numero mayor es: " + mayor);
        scanner.close();
    }
}
