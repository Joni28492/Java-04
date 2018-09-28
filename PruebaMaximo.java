import java.awt.Container;
import javax.swing.*;
import java.lang.Math;


public class PruebaMaximo extends JApplet{
	
	
	
	
		public void init(){
			
			JTextArea areaSalida = new JTextArea();
			Container contenedor=getContentPane();
			contenedor.add(areaSalida);
			
			String salida="";
			double x=0, y=0,z=0;
			
				//pedir 3 numeros
				String primerNumero=JOptionPane.showInputDialog("introduce primer numero");
				String segundoNumero=JOptionPane.showInputDialog("introduce segundo numero");
				String tercerNumero=JOptionPane.showInputDialog("introduce tercer numero");
				
				x=Double.parseDouble(primerNumero);
				y=Double.parseDouble(segundoNumero);
				z=Double.parseDouble(tercerNumero);
				
				//llamar a la funcion
			
			salida="el maximo de los numeros: "+ x + "-" + y + "+" + z +" es "+ maximo(x,y,z);
			areaSalida.setText(salida);
			
			
			
		}
	
	
	
	
		public double maximo(double x, double y, double z){
			
			return Math.max(x,Math.max(y,z));
			
			
			
		}
	

	
}
