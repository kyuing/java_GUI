package _05JLabel_alignment;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Alignment {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("KT's frame");	//create an instance of JFrame
		Dimension dim = new Dimension(500, 400);	//create an instance of Dimension with the Dimension (frame size) constructor parameters
		JLabel label = new JLabel();	//create an instance of JLabel using a default constructor in JLabel class
		
		frame.setLocation(1050, 250); 	//set location of frame
		frame.setPreferredSize(dim);	//set the dimension(size) of frame at axis (700, 300)
		
		
		label.setText("text with the setter setText()");	//set text using setter; we need setter since we are using the default constructor from JLabel class
		frame.add(label);	//add label to frame

		/* SwingConstants is an interface for alignment
		   To align label, use the interface */
		label.setVerticalAlignment(SwingConstants.TOP);	//SwingConstants.TOP is a parameter which has a TOP attribute
		label.setHorizontalAlignment(SwingConstants.RIGHT);	//SwingConstants.RIGHT is a parameter which has a RIGHT attribute
		frame.pack();	//modulate the window size of frame
		frame.setVisible(true);	//true == display.  false == not display
		
		
		System.out.println(label.getText());	//print out label text set using getter on console
		System.out.println(label.getVerticalAlignment()); 	//print out the vertical alignment attribute of text of label set using getter on console
		System.out.println(label.getHorizontalAlignment()); 	//print out the horizontal alignment attribute of text of label set using getter on console

		/* In the interface class SwingConstants, you can see numeric values corresponding to SwingConstants.TOP and SwingConstants.RIGHT 
		   
		   The central position in an area. Used for both compass-direction constants (NORTH, etc.) and box-orientation constants (TOP, etc.).
		   
		   public static final int CENTER  = 0;	// Box-orientation constant used to specify locations in a box.   
		
		   public static final int TOP     = 1;	//Box-orientation constant used to specify the top of a box.
		   
		   public static final int LEFT    = 2;	//Box-orientation constant used to specify the left side of a box.
		   
		   public static final int BOTTOM  = 3;	//Box-orientation constant used to specify the bottom of a box.
		   
		   public static final int RIGHT   = 4;	//* Box-orientation constant used to specify the right side of a box.  
		   
		   # more information at SwingConstants class*/
        
	}
}
