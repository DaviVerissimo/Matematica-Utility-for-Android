package com.daviverissimo_app.matemticautility.control;

import org.junit.Assert;
import org.junit.Test;

public class RaizTest {

    @Test
    public void calcularRaizParExpoentImpar() {
        Sistema sistema = new Sistema();
        float raiz = 2;
        float expoent = 9;
        long resultado = sistema.calcularRaiz(expoent, raiz);
        Assert.assertEquals(resultado, 3);
    }

    @Test
    public void calcularRaizImparExpoentPar(){
        Sistema sistema = new Sistema();
        float raiz =  3;
        float expoent = 512;
        long resultado = sistema.calcularRaiz(expoent, raiz);
        Assert.assertEquals(resultado, 8);
    }

    @Test
    public void calcularRaizImparExpoenteImpar(){
        Sistema sistema = new Sistema();
        float raiz = 9;
        float expoent = 40353607;
        long resultado = sistema.calcularRaiz(expoent, raiz);
        Assert.assertEquals(resultado, 7);
    }

    @Test
    public void calcularRaizParExpoentPar(){
        Sistema sistema = new Sistema();
        float raiz = 12;
        float expoent = 16777216;
        long resultado = sistema.calcularRaiz(expoent, raiz);
        Assert.assertEquals(resultado, 4);

    }

    @Test
    public void calcularRaizPrimaExpoentPrimo(){
        Sistema sistema = new Sistema();
        float raiz = 7;
        float expoent = 62748517;
        long resultado = sistema.calcularRaiz(expoent, raiz);
        Assert.assertEquals(resultado, 13);
    }

    @Test
    public void calcularRaizMultiploDeCinco(){
        Sistema sistema = new Sistema();
        float raiz = 5;
        float expoent = 9765625;
        long resultado = sistema.calcularRaiz(expoent, raiz);
        Assert.assertEquals(resultado, 25);
    }

    @Test
    public void calcularRaizParametrosLong(){
        Sistema sistema = new Sistema();
        long raiz = 12;
        long expoent = 1000000000000l;
        long resultado = sistema.calcularRaiz(expoent, raiz);
        long esperado = 10;
        Assert.assertEquals(resultado, esperado);
    }
}