package Ejercicios2Unidad2;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		//Declaramos la variable nota
		int nota;
		//Introducimos e importamos el scanner
		Scanner sc = new Scanner(System.in);
		//Le pedimos al usuario que introduzca su nota del 0 al 10
		System.out.println("Por favor introduzca una nota de 0 a 10: ");
		nota = sc.nextInt();
		//introducimos al switch la nota que haya introducido el usuario 
		switch (nota) {
		case 0,1,2,3,4: //Declaramos que si el número esta comprendido entre 0 y 4 la nota es insuficiente
			System.out.println("INSUFICIENTE");
		break;
		case  5: //Declaramos que si la nota es 5 es suficiente
		System.out.println("SUFICIENTE");
		break;
		case 6://Declaramos que si la nota es 6 la nota es bien
		System.out.println("BIEN");
		break;
		case 7,8://Declaramos que si la nota es 7 u 8 la nota es notable
		System.out.println("NOTABLE");
		break;
		case 9,10://declaramos que si la nota es 9 o 10 la nota es sobresaliente
		System.out.println("SOBRESALIENTE");
		break;
		default:
			System.out.println("La nota introducida no está entre 0 y 10"); // Si el usuario introduce otro valor que no esté registrado, dará error o sin coincidencia
		}
		sc.close(); //cerramos el scanner
	}

}
