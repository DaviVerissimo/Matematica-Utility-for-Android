package com.daviverissimo_app.matemticautility.control;

import org.junit.Assert;
import org.junit.Test;

public class PercentualTest {

    @Test
    public void calcularQuantosPorcentoDoNumeroEquivale10() {
        Sistema sistema = new Sistema();
        float valor = 10;
        float numero = 100;
        float resultado = sistema.calcularQuantosPorcentoDoNumero(numero, valor);
        float esperado = 10;
        Assert.assertTrue(resultado == esperado);
    }

    @Test
    public void calcularQuantosPorcentoDoNumeroEquivale250() {
        Sistema sistema = new Sistema();
        float valor = 250;
        float numero = 500;
        float resultado = sistema.calcularQuantosPorcentoDoNumero(numero, valor);
        float esperado = 50;
        Assert.assertTrue(resultado == esperado);
    }

    @Test
    public void calcularQuantosPorcentoDoNumeroEquivale22() {
        Sistema sistema = new Sistema();
        float valor = 22;
        float numero = 200;
        float resultado = sistema.calcularQuantosPorcentoDoNumero(numero, valor);
        float esperado = 11;
        Assert.assertTrue(resultado == esperado);
    }

    @Test
    public void calcularQuantosPorcentoDoNumeroEquivale7497() {
        Sistema sistema = new Sistema();
        float valor = 7497;
        float numero = 2142;
        float resultado = sistema.calcularQuantosPorcentoDoNumero(numero, valor);
        float esperado = 350;
        Assert.assertTrue(resultado == esperado);
    }

}