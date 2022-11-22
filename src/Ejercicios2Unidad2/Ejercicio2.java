package Ejercicios2Unidad2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaramos la variable número
		int numero;
		// Introducimos e importamos el scanner
		Scanner sc = new Scanner(System.in);
		//Le pedimos al usuario que introduzca un número comprendido entre 1 y 7 para decir el día de la semana
		System.out.println("Por favor introduzca un número comprendido entre 1 y 7 para decirle el dia de la semana correspondiente ");
		numero=sc.nextInt();
		//Introducimos el switch y asignamos un número a cada día de la semana
		switch (numero) {
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Miércoles");
			break;
		case 4:
			System.out.println("Jueves");
			break;
		case 5:
			System.out.println("Viernes");
			break;
		case 6:
			System.out.println("Sábado");
			break;
		case 7:
			System.out.println("Domingo");
			break;
		default:
			System.out.println("ERROR"); //Si el usuario introduce un valor que no hemos pedido , la aplicación da error.
		}
        sc.close(); //Cerramos el scanner.
	}

}
