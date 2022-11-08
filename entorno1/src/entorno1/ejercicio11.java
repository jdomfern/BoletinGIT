package entorno1;

import java.util.Scanner;

public class ejercicio11 {

	public static void main(String[] args) {
		// Ejercicio 11

		String nombre1, nombre2;

		Scanner sc=new Scanner (System.in);
		System.out.println("Introduce el primer nombre");
		nombre1=sc.nextLine();
		nombre1=nombre1.toLowerCase();

		System.out.println("Introduce el segundo nombre");
		nombre2=sc.nextLine();
		nombre2=nombre2.toLowerCase();

		if (nombre1.equals(nombre2)) {
			System.out.println("Los nombres son iguales");

		}else {
			System.out.println("Los nombres son diferentes");
		}

	}

}



