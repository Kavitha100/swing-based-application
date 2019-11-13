package project;



import java.applet.Applet;
import java.awt.*;

public class class4 extends Applet
{
    public void init()
    {
        setSize(400, 300);
        setBackground(Color.cyan);
    }

    public void paint(Graphics g)
    {
        // Draw grass.
        g.setColor(Color.green);
        g.fillRect(0, 250, 400, 50);
        g.setColor(Color.black);
        g.drawLine(0, 250, 400, 250);
        
        // Draw leaves of tree.
        g.setColor(Color.green);        
        g.fillOval(75, 75, 100, 100);
        g.setColor(Color.black);
        g.drawOval(75, 75, 100, 100);
        
        // Draw sun.
        g.setColor(Color.yellow);        
        g.fillOval(300, 35, 30, 30);
        g.setColor(Color.black);
        g.drawOval(300, 35, 30, 30);

        // Draw trunk of tree.
        g.setColor(new Color(60, 60, 0));
        g.fillRect(115, 175, 20, 100); 
        
	    g.setColor(Color.black);
	    g.setFont(new Font("timeRoman",Font.PLAIN,30));
	    g.drawString("Autum season",750,40);
	    g.drawString("Autum is after summer",750,70);
	    
	    
        
        
	
    }}

	
