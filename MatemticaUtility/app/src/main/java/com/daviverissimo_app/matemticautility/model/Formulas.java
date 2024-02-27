package com.daviverissimo_app.matemticautility.model;

public class Formulas {
	
	public double calcularDelta(double a, double b, double c) {
		double delta = new model.Calculadora().calcularPotentia(b, 2)-(4 * a * c);
		return delta;
	}
	
	public double[] calcularRaizEquacao2GrauComBaskara (double a, double b, double c) 
			throws model.NaoExistemRaizesReaisException {
		double[] raizes = new double[2];
		double delta = this.calcularDelta(a, b, c);
		double raiz1 =  ((-1 * b + (Math.sqrt(delta)))) / 2 * a;
		double raiz2 =   ((-1 * b - (Math.sqrt(delta)))) / 2 * a;
		if (delta == 0) {
			raizes[0] = raiz1;
		}
		if (delta >  0) {
			raizes[0] = raiz1;
			raizes[1] = raiz2;
		}
		if (delta <  0) {
			throw new model.NaoExistemRaizesReaisException();
		}
		return raizes;
	}

}
