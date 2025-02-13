package org.example;


/*
    Author: peterg
    Created on: 13/02/25
*/

import java.util.ArrayList;

public class TransformArray {

    public Object[] transformArray(Object[] array){
        return recorrerArreglo(array);
    }


    private Object[] recorrerArreglo(Object[] array){
        Object[] resultado = new Object[array.length];
        ArrayList<Object[]> temp = new ArrayList<>();
        for (int i = 0; i < array.length; i++){
            if(array[i] instanceof Object[]){
                Object[] output = recorrerArreglo((Object[]) array[i]);
                temp.add(output);

            }else{
                resultado[i] = array[i];

            }
        }
        return resultado;
    }

}
