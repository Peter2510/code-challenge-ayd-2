package com.ayd2.anagrama;

/**
 *
 * @author peterg
 */
public class Anagrama {

    public boolean validarAnagrama(String palabra1, String palabra2) {

        //validar la longitud de las cadenas
        if (palabra1.length() != palabra2.length()) {
            return false;
        }

        //convertir en arreglo
        char[] entrada1 = palabra1.toCharArray();
        char[] entrada2 = palabra2.toCharArray();

        //validar que las letras aparezcan todas y sollo una vez
        for (int i = 0; i < entrada1.length; i++) {
            boolean esAnagrama = false;
            
            //buscar el caracter de entrada1 en entrada2
            for (int j = 0; j < entrada2.length; j++) {
                if (entrada1[i] == entrada2[j]) {
                    esAnagrama = true;
                    //marco el caracter de entrada2 como usado para no repetirlo
                    entrada2[j] = 0;
                    break;
                }
            }

            //si no se encontro el caracter no es un anagrama F
            if (!esAnagrama) {
                return false;
            }
        }
        //todo ok, es un anagrama
        return true;
    }

}
