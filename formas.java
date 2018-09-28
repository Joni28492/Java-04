
import java.awt.Graphics;
import javax.swing.*;

public class formas extends JApplet{
	
		public void paint(Graphics g){
			
				super.paint(g);
				String x1 = "", y1 = "", base1 = "", alto1 = "", radio1 = "";
				int x = 0, y = 0, base = 0, alto = 0, radio = 0;
				
				x1 = JOptionPane.showInputDialog("Introduce coordenada  x");
				y1 = JOptionPane.showInputDialog("Introduce coordenada  y");
				base1 = JOptionPane.showInputDialog("Introduce base");
				alto1 = JOptionPane.showInputDialog("Introduce coordenada  altura");
				radio1 = JOptionPane.showInputDialog("Introduce radio");
				
				x = Integer.parseInt(x1);
				y = Integer.parseInt(y1);
				base = Integer.parseInt(base1);
				alto = Integer.parseInt(alto1);
				radio = Integer.parseInt(radio1);
				
				//rectangulo
				g.drawRect(x, y, x + base, y - alto);

				//dibujar ovalo
				g.drawOval(60,80, 60, 70);
				//triangulo
				g.drawLine(x, y, x + (base / 2), y + alto);
				g.drawLine(x + (base / 2), y + alto, x - (base / 2), y + alto);
				g.drawLine(x, y, x - (base / 2), y + alto);
		}
	 

	
}
