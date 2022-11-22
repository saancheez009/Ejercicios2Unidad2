package Ejercicios2Unidad2;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declaramos las varariables num1 , num2 y opción
		int num1;
		int num2;
		String opción;
		// Introducimos e importamos el scanner
		Scanner sc = new Scanner(System.in);
		//Le pedimos al usuario por favor que introduzca dos números.
		System.out.println("Por favor introduzca un número");
		num1= sc.nextInt();
		System.out.println("Por favor introduzca un número");
		num2= sc.nextInt();
		//Le mostramos al usuario las opciones de operaciones que tiene
		System.out.println("A. SUMAR LOS NÚMEROS");
		System.out.println("B. RESTAR LOS NÚMEROS");
		System.out.println("C. MULTIPLICAR LOS NÚMEROS");
		System.out.println("D. DIVIDIR LOS NÚMEROS");
		// Le pedimos al usuario que seleccione una opción
		System.out.println("Por favor seleccione una opción:");
		opción = sc.next();
		//Introducimos el switch e introducimos las opciones de operaciones para ejecutarlas
		switch (opción) {
		case "A":
			System.out.println(num1+num2);
			break;
		case "B":
			System.out.println(num1-num2);
			break;
		case "C":
			System.out.println(num1*num2);
			break;
		case "D":
			System.out.println(num1/num2);
			break;
		default:
			System.out.println("El dato introducido no es correcto"); // si el dato que el ususario es un dato no pedido, le decimos que el dato es incorrecto
		}
		sc.close(); //Cerramos el scanner
	}

}
