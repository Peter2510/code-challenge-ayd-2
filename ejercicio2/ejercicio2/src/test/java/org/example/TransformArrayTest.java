package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransformArrayTest {

    TransformArray transformArray;

    @BeforeEach
    void setUp() {
        transformArray = new TransformArray();
    }

    @Test
    void salidaValida() {

        Object[] output = transformArray.transformArray(new Object[]{1, 2, 3});

        assertArrayEquals(new Object[]{1, 2, 3}, output);

    }

    @Test
    void salidaInvalidaSeEsperaValorRetornaObjeto(){
        Object[] output = transformArray.transformArray(new Object[]{1, 2, new Object[] {1}});

        assertArrayEquals(new Object[]{1, 2, 3 }, output);
    }

    @Test
    void salidaInvalidaSeEsperaObjetoRetornaValor(){
        Object[] output = transformArray.transformArray(new Object[]{1, 2, 3});

        assertArrayEquals(new Object[]{1, 2, new Object[] {3} }, output);
    }
}