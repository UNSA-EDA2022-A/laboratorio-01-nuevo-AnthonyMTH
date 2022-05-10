package com.example.project;

import java.util.Scanner;

public class Exercise1 {

	public static void main(final String[] args) {

		Exercise1 obj = new Exercise1();
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			System.out.println(obj.convertirBaseGabriel(n));			
		}
	}

	public String convertirBaseGabriel(int a) {
		int cantidadDigitos = Integer.toString(a).length();
		int divisor = 1;
		int numeroBase = a;
		int espacios = 1;
		int numeroConvertido = 0;
		String numeroConvertidoS = "";
		for(int i = 0; i < cantidadDigitos - 1; i++) {
			divisor = divisor * 10;
			espacios++;
		}
		for(int i = 0; i < cantidadDigitos; i++) {
			if(numeroBase / divisor == 1) {
				numeroConvertido = (int) (numeroConvertido + (Math.pow(2, espacios)-1));
				numeroBase = numeroBase - divisor;
				espacios--;
				divisor = divisor / 10;
			} else {
				if(numeroBase / divisor == 0){
					divisor = divisor / 10;
					espacios--;
				} else {
					return "El numero proporcionado no esta en base Gabriel.";
				}
			}
			if((divisor == 1) && ((numeroBase == 0) || (numeroBase == 1) || (numeroBase == 0))) {
				switch(numeroBase){
					case 1: numeroConvertido = numeroConvertido + 1;
					case 2: numeroConvertido = numeroConvertido + 2;
				}
			}
			
		}
		numeroConvertidoS = String.valueOf(numeroConvertido);
		return numeroConvertidoS;
		// TO DO
		
	}
}
