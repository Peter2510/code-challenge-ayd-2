package ejercicio1;

import java.util.Scanner;

public class Anagrama {
    public static void main(String[] args) {

        System.out.println(validarAnagrama());

    }

    public static boolean validarAnagrama() {

        Scanner sc = new Scanner(System.in);

        String palabra1 = "";
        String palabra2 = "";

        System.out.print("Ingresa una palabra: ");

        palabra1 = sc.nextLine();

        do {

            System.out.print("Ingresa otra palabra de la misma longitud: ");
            palabra2 = sc.nextLine();

        } while (!(palabra1.length() == palabra2.length()));

        if (palabra1.length() == palabra2.length()) {

            for (int i = 0; i < palabra1.length(); i++) {

                if (!palabra2.contains(String.valueOf(palabra2.charAt(i)))) {
                    //System.out.println("No es un anagrama");
                    return false;
                }
                
                if (!palabra1.contains(String.valueOf(palabra2.charAt(i)))) {
                    //System.out.println("No es un anagrama");
                    return false;
                }
            }

            //System.out.println("Anagramas");
            return true;
        }
        return false;
    }

}
