/*
* Ejercicio 1
* Jonathan
* Fernández López
* 71891784V
*/

import java.util.Scanner;

public class ejercicio1{
	
	
	
	public static void main(String args[]){
			
			int numero = 0, i = 0;
			String palabra = "";
			Scanner sc = new Scanner(System.in);
			
			//introducimos el numero y controlamos que sea mayor que 0
			do{
			System.out.println("introduce un numero mayor que cero");
			numero = sc.nextInt();
			}while(numero <= 0);
			
			//escribimos la palabra
			System.out.println("escribe palabra");
			palabra = sc.next();
			
			system.out.println();
			
			//utilizamos el bucle for limitando con el numero que escogimos antes como maximo
			for(i = 1; i <= numero; i++)
				System.out.println(palabra);
			
	
	}
	
	
}
