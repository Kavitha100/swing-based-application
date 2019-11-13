package project;

import java.applet.*; 
import java.awt.*; 
/*
 * <applet code="season1" width=200 height=200>
	</applet>

</applet>
*/
public class class1 extends Applet { 
	
    public void paint(Graphics g) 
    { 
  
         
    	 setBackground (Color.cyan);

        g.setColor(Color.yellow);        
        g.fillOval(80, 70, 150, 150);
        g.setColor(Color.black);
        g.setFont(new Font("timeRoman",Font.PLAIN,30));
        g.drawString("This is summer",750,40);
        g.drawString("It is very hot",750,70);
    } 
} 