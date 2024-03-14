package T6_Strings;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        String frase, frase2, frase3;
        String buscar_pos = "sol";

        Scanner sc = new Scanner(System.in);

        System.out.println("Introducir una frase:");
        frase = sc.nextLine();

        //Contar cuantos caracteres tiene la frase introducida
        System.out.println(frase + " tiene " + frase.length() + " caracteres.");

        //Sacar cuales son los 4 primeros caracteres
        System.out.println("Los 4 primeros caracteres son: " + frase.substring(0, 4));

        //Comparar si las 2 frases son iguales
        System.out.println("Introducir otra frase para comparar: ");
        frase2 = sc.nextLine();

        if (frase.equals(frase2)) System.out.println("Las Frases son Iguales");
        else System.out.println("Las Frases son Diferentes");

        //Concatenar las 2 frases introducidas
        frase3 = frase.concat(frase2);
        System.out.println("las 2 frases unidas son: " + frase3);

        //Reemplazar unos caracteres por otros
        frase3 = frase3.replace('a', 'X');
        System.out.println("Reemplazamos en frase3 la letra 'a' por 'X': " + frase3);

        //Buscar en la frase si se encuentra la cadena buscada 'sol'
        if (frase3.contains(buscar_pos)) System.out.println("La frase3 contiene la cadena " + buscar_pos);
        else System.out.println("La frase3 NO contiene la cadena " + buscar_pos);

        //Cuantas vocales 'e' tiene
        char letra;

        int cuantasE = 0;

        for (int i = 0; i < frase3.length(); i++) {
            letra = frase3.charAt(i);
            if (letra == 'e') cuantasE++;
        }

        System.out.println("Vocales 'e': " + cuantasE);

        //Escribe la frase3 al revés
        char caracter;

        for (int i = frase.length() - 1; i >= 0; i--) {
            System.out.print(frase.charAt(i));
        }

        System.out.println();

        //Indica si la frase empieza por "Ma"
        if (frase3.startsWith("Ma")) System.out.println("La frase comienza por Ma");
        else System.out.println("La frase NO comienza por Ma");
    }
}