package com.trasnportes;

public class Estandar extends Envio{
	static int tarifaLocal;
	static int tarifaLargaDistancia;
	static int kilometros;
	
	public static int obtenerPrecio() {
		if(kilometros < 1000)
			return tarifaLocal;
		else
			return tarifaLargaDistancia;
	}
}
