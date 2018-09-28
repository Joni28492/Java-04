/*
*  Ejercicio 3
* Jonathan 
* Fernández López
* 71891784V
*/

import java.util.Scanner;


public class ejercicio3{
	
	
	public static void main (String args[]){
		
		Scanner sc = new Scanner (System.in);
		int seleccion = 0, base = 0, altura = 0;
		
		//utilizamos un bucle con centinela, oara que cuando la selecion sea 4 se salga del menu
		do{
			//imprimimos el menu con las diferentes posibilidades
			System.out.println("Menu");
			System.out.println("-------");
			System.out.println("1-Calcular el area del triangulo");
			System.out.println("2-Calcular el area del rectángulo");
			System.out.println("3-Calcular el area del paralelogramo");
			System.out.println("4-Salir");
		
			System.out.println("\nIntroduce una opcion (1-4):");
		
			seleccion=sc.nextInt();
			
			//creamos un switch para interaccionar con ese menu
			switch(seleccion){
				
				case 1:
					//calcula el area del triangulo, y controla que no nos den valores menores o iguales a 0 para evitar que el resultado sea infinito
					do{
					System.out.println("introduce la base del triangulo");
					base=sc.nextInt();}while(base <= 0);
					
					do{
					System.out.println("introduce la altura del triangulo");
					altura=sc.nextInt();}while(altura <= 0);
					//hacemos un cast a float por la division y limitamos el numero de decimales
					System.out.printf("el area del triangulo es %.2f\n", (float)(base*altura) / 2.0);
				
					break;
			
				case 2: 
					//calcula el area del rectangulo, y controla que no nos den valores menores o iguales a 0 para evitar que el resultado sea infinito
					do{
					System.out.println("introduce la base del rectangulo");
					base=sc.nextInt();}while(base <= 0);
					
					do{
					System.out.println("introduce la altura del rectangulo");
					altura=sc.nextInt();}while(altura <= 0);
			
					System.out.printf("el area del rectangulo es %d\n",base*altura);
				
					break;
			
				case 3:
					//calcula el area del paralelogramo, y controla que no nos den valores menores o iguales a 0 para evitar que el resultado sea infinito
					do{
					System.out.println("introduce la base del paralelogramo");
					base=sc.nextInt();}while(base <= 0);
					
					do{
					System.out.println("introduce la altura del paralelogramo");
					altura=sc.nextInt();}while(altura <= 0);
			
					System.out.printf("el area del paralelogramo es %d\n", base * altura);
			
					break;
					
				case 4:
				//mostramos mensaje de salida del menu
					System.out.println("saliendo del menu");
					break;
			}
		}while(seleccion != 4);
		
		
		
		
		
		
	}
	

	
}
