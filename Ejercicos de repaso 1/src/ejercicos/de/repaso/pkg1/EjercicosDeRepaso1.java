package ejercicos.de.repaso.pkg1;

import java.util.Scanner;

public class EjercicosDeRepaso1 {

    public static void main(String[] args) {
        
       Scanner num = new Scanner(System.in);
        int[] numeros = new int[10]; 
        int contador = 0; 
        double suma = 0; 
        // for para ingresar los 10 números
        System.out.println("Ingresa 10 numeros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeros[i] = num.nextInt();
            suma += numeros[i]; // Sumar cada numero para el promedio
        }
        // Solicitar el numero que se quier contar
        System.out.print("Ingrese el numero que quiere contar: ");
        int buscado = num.nextInt();

        // Contar cuantas veces aparece el numero buscado
        for (int i = 0; i < 10; i++) {
            if (numeros[i] == buscado) {
                contador++;
            }
        }
        // Promedio
        double promedio = suma / 10;
        // Resultados
        System.out.println("El numero " + buscado + " se ingreso " + contador + " veces.");
        System.out.println("El promedio de los numeros es: " + promedio);
    }   
}
