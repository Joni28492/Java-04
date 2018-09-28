/*
 * 
 * 
 * 
 * 
 * 
 * */
import java.awt.Container;//contenedor para elementos graficos
import javax.swing.*;
//import java.lang.Math;


public class CuadradosEnteros extends JApplet{
	
	
		public void init(){
			
			
			JTextArea areaSalida = new JTextArea();
			Container contenedor  = getContentPane();//apunta a un panel del contenedor del applet
			contenedor.add(areaSalida);
			
			int resultado=0;
			String salida=" ";
			
			for(int contador=1; contador<=10; contador++){
				
				resultado=cuadrado(contador);
				
				salida= salida +"el cuadrado de "+ contador +" es: "+resultado+"\n";
			}
			
			areaSalida.setText(salida);
			
		}
	
	
		public int cuadrado(int y){
				//return (int)Math.pow(y,2);
				return y*y;
		}
	
	
	
	
	
	
	





} 
