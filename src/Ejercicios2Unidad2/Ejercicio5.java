package Ejercicios2Unidad2;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Introducimos y ceclaramos la variable permiso
		String permiso;
		//Introducimos e importamos el scanner para leer el teclado
		Scanner sc = new Scanner(System.in);
		//Le pedimos al usuario que introduzca el tipo de permiso para proporcionarle la información que cosrresponde a este
		System.out.println("Por favor introduzca el tipo de permiso de conducir(E, D, C1 al C5, A, B1 y B2):");
		permiso=sc.nextLine();
		//Introducimos el switch con el permiso y a cada tipo de permiso le asignamos su nombre 
		switch (permiso) {
		case "E":
			System.out.println("Remolques");
			break;
		case "D":
			System.out.println("Autobuses");
		case "C1","C2","C3","C4","C5":
			System.out.println("Camiones");
			break;
		case "A":
			System.out.println("Motocicletas");
		case "B1,B2":
			System.out.println("Automóviles");
			break;
		default:
			System.out.println("Categoría no contemplada"); //Al introducir una opción que no se ha pedido el sistema dará como respuesta: categoría no contemplada.
		}
		sc.close(); //Cerramos el scanner.
	}

}
