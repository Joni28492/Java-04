/*
*  Ejercicio 2
* Jonathan 
* Fernández López
* 71891784V
*/
import java.util.Scanner;

 
 public class ejercicio2{
	 
	 
		public static void main(String args[]){
			
			
			Scanner sc = new Scanner(System.in);
			int numero = 0, i = 0;
			String cadenaPar = "";
			
			//introducimos numero controlando que este entre 40 y 100
			do{
				System.out.println("introduce numero entre 40 y 100");
				numero = sc.nextInt();
				//si no esta entre 40 y 100 imprimimos mensaje de error
				if(numero < 40 || numero > 100)
					System.out.println("error numero incorrecto");
			
			
			}while(numero < 40 || numero > 100);
			
			//utilizamos bucle partiendo desde el numero que introducimos hasta 100
			while(numero <= 100){
				//si el numero es par lo concatenamos a nuestra cadena de numero pares con salto de linea
				if(numero % 2 == 0)
					cadenaPar += numero + "\n";
				numero++;
					
			}
			
			
			System.out.println(cadenaPar);
			
			
			
			
			
			
		}
	 
	 

	 
}
