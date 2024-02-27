package com.daviverissimo_app.matemticautility.control;

import org.junit.Assert;
import org.junit.Test;

public class PorcentagemTest {

    @Test
    public void calcularPorcentagem10porcento() {
        Sistema sistema = new Sistema();
        float porcentagem = 10;
        float numero = 100;
        float resultado = sistema.calcularPorcentagem(numero, porcentagem);
        float esperado = 10;
        Assert.assertTrue(resultado == esperado);
    }

    @Test
    public void calcularPorcentagem50porcento() {
        Sistema sistema = new Sistema();
        float porcentagem = 50;
        float numero = 500;
        float resultado = sistema.calcularPorcentagem(numero, porcentagem);
        float esperado = 250;
        Assert.assertTrue(resultado == esperado);
    }

    @Test
    public void calcularPorcentagem78porcento() {
        Sistema sistema = new Sistema();
        float porcentagem = 11;
        float numero = 200;
        float resultado = sistema.calcularPorcentagem(numero, porcentagem);
        float esperado = 22;
        Assert.assertTrue(resultado == esperado);
    }

    @Test
    public void calcularPorcentagem150porcento() {
        Sistema sistema = new Sistema();
        float porcentagem = 150;
        float numero = 201;
        float resultado = sistema.calcularPorcentagem(numero, porcentagem);
        float esperado = 301.50f;
        Assert.assertTrue(resultado == esperado);
    }

    @Test
    public void calcularPorcentagem360porcento() {
        Sistema sistema = new Sistema();
        float porcentagem = 350;
        float numero = 2142;
        float resultado = sistema.calcularPorcentagem(numero, porcentagem);
        float esperado = 7497;
        Assert.assertTrue(resultado == esperado);
    }
}