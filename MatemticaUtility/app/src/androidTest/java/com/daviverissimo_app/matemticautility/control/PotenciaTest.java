package com.daviverissimo_app.matemticautility.control;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

public class PotenciaTest {

    @Test
    public void calcularPotenciaBaseParExpoentImpar() {
        Sistema sistema = new Sistema();
        float base = 2;
        float expoent = 3;
        long resultado = sistema.calcularPotencia(expoent, base);
        Assert.assertEquals(resultado, 9);
    }
    @Test
    public void calcularPotenciaBaseImparExpoentPar() {
        Sistema sistema = new Sistema();
        float base = 3;
        float expoent = 4;
        long resultado = sistema.calcularPotencia(expoent, base);
        Assert.assertEquals(resultado, 64);
    }

    @Test
    public void calcularPotenciaExpoenteImparBaseImpar() {
        Sistema sistema = new Sistema();
        float base = 3;
        float expoent = 11;
        long resultado = sistema.calcularPotencia(expoent, base);
        Assert.assertEquals(resultado, 1331);
    }

    @Test
    public void calcularPotenciaExpoenteParBasePar() {
        Sistema sistema = new Sistema();
        float base = 10;
        float expoent = 12;
        long resultado = sistema.calcularPotencia(expoent, base);
        Assert.assertEquals(resultado, 61917364224l);
    }

    @Test
    public void calcularPotenciaBasePrimoExpoentPrimo() {
            Sistema sistema = new Sistema();
            float base = 7;
            float expoent = 13;
            long resultado = sistema.calcularPotencia(expoent, base);
            Assert.assertEquals(resultado, 62748517);

    }

    @Test
    public void calcularPotenciaBaseMultiploDeCinco() {
        Sistema sistema = new Sistema();
        float base = 5;
        float expoent = 9;
        long resultado = sistema.calcularPotencia(expoent, base);
        Assert.assertEquals(resultado, 59049);

    }

    @Test
    public void calcularPotenciaParametrosLong(){
        Sistema sistema = new Sistema();
        long base = 12;
        long expoent = 10;
        long resultado = sistema.calcularPotencia(expoent, base);
        long esperado = 1000000000000l;
        Assert.assertEquals(resultado, esperado);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testCalcularPotencia() {
    }
}