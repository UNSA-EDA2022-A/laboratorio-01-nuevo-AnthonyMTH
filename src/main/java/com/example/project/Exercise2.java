package com.example.project;

import java.util.Scanner;

public class Exercise2 {

	public static void main(final String[] args) {

		Exercise2 obj = new Exercise2();
		Scanner sc = new Scanner(System.in);
		while (true) {

            int a [] = new int [7];
            for(int i = 0; i < 7; i++){
                int n = sc.nextInt();
                a[i] = n;
            }
			
			System.out.println(obj.getMenorNumeroSaltos(a));			
		}
	}

	public Integer getMenorNumeroSaltos(int a []) {
		int numeroSaltos = 0;
		int posicion = 0;
		for(int i = 0; i < a.length; i++){
		    if((a[i] - posicion <= 50) && (a[i] - posicion > 0)) {
				for(int j = i+1; j < a.length; j++){
				    if((a[j] - posicion > 50) && (a[j] - posicion > 0)) {
					i = j-1;
					posicion = a[j-1];
					numeroSaltos++;
					break;
				    }
				}
				if((a[a.length-1] - posicion <= 50) && (a[a.length-1] - posicion > 0)){
				    numeroSaltos++;
				    posicion = a[a.length-1];
					}
		    }
		    else{
		    	break;
		    }
		}
		if((numeroSaltos != 0) && (posicion == a[a.length-1])) {
		    return numeroSaltos;
		}
		// TO DO
		return -1;
	}
}
