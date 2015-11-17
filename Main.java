import javax.swing.*;
import java.awt.*;

public class Main {

	
	public static void main(String args[])
   {
	   init();
	}
   public static void init()
   {
     JFrame frame = new JFrame("Agar.io");
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.pack();
     frame.setVisible(true);
     frame.getContentPane().setBackground(new Color(240,234,214));
     frame.setSize(800,600);
   }
   

}