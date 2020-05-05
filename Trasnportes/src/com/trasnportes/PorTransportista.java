package com.trasnportes;

public class PorTransportista extends Envio {
	static int precioPorKilo;
	static int peso;
	public static int obtenerPrecio() {
		return precioPorKilo * peso;
	}
}
