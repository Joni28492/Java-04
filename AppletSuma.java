/*
 * suma graphica
 * 
 * */
 
 import java.awt.Graphics;
 import javax.swing.*;
 
 public class AppletSuma extends JApplet{
	 
	 
	 double suma;
	 
	 
	 
	 //init solo se ejecuta una vez
		public void init(){
			
			String primerNumero;
			String segundoNumero;
			
			double numero1;
			double numero2; 
			
			primerNumero=JOptionPane.showInputDialog( "escribe primer valor");
			
			segundoNumero=JOptionPane.showInputDialog("escribe segundo valor");
			
			numero1=Double.parseDouble(primerNumero);
			numero2=Double.parseDouble(segundoNumero);
			
			suma = numero1 + numero2;
			
		
		}
		
		public void paint(Graphics g){
			
				super.paint(g);
				g.drawRect(15,10,270,20);
				g.drawString("la suma es " + suma, 25 ,25);
			
			
			
			
			
			
			
			
		}
	 
	 
	 
	 
	 
	 
	 
	 



	 
}
