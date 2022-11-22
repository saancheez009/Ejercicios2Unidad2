package Ejercicios2Unidad2;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		// Declramos las variables num1, num2 , tirada1 y tirada2
		String num1;
		String num2;
		int tirada1 = 0;
		int tirada2 = 0;
		int resultFinal;
		//Introducimos e importamos el scanner
		Scanner sc = new Scanner(System.in);
		//Le pedimos al usuario que por favor introduzca los números sacados en la primera y segunda tirada.
		
		System.out.println("Por favor introduzca el número que ha sacado en la primera tirada ( introducir en formado cadena):");
		num1 = sc.next();
		System.out.println("Por favor introduzca el número que ha sacado en la segunda tirada ( introducir en formado cadena):");
		num2 =sc.next();
		// Introducimos el switch asisgnandole valores a los números escritos en cadena
		switch (num1) {
		case ("UNO"):
		tirada1=1;
		break;
		case ("DOS"):
		tirada1=2;
		break;
		case ("TRES"):
			tirada1=3;
		break;
		case ("CUATRO"):
			tirada1=4;
		break;
		case ("CINCO"):
			tirada1=5;
		break;
		case ("SEIS"):
			tirada1=6;
		break;
		default:
			System.out.println("El valor de la primera tirada es erróneo");
		}
		
		switch (num2) {
		case ("UNO"):
			tirada2=1;
		break;
		case ("DOS"):
			tirada2=2;
		break;
		case ("TRES"):
			tirada2=3;
		break;
		case ("CUATRO"):
			tirada2=4;
		break;
		case ("CINCO"):
			tirada2=5;
		break;
		case ("SEIS"):
			tirada2=6;
		break;
		default:  
		System.out.println("El valor de la segunda tirada es erróneo");
		}
		// Calculamos la suma del número de la tirada 1 y la tirada 2.
		resultFinal = tirada1 + tirada2;
		//Le mostramos al usuario el resultado final de la suma
		System.out.println(resultFinal);
		
		sc.close(); // Cerramos el scanner
	}

}
