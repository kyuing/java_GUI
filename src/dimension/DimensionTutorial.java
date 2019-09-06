package dimension;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class DimensionTutorial {

	public static void main(String[] args) {
		// hello world
		JFrame frame = new JFrame("KT's frame");	//create an instance of JFrame
		JLabel label = new JLabel("Hello World");	//create an instance of JLabel
		Dimension dim = new Dimension(300, 400);	//create an instance of Dimension with the Dimension (frame size) constructor parameters  
		

		frame.add(label);	//add label to frame 
		frame.setLocation(1050, 250); 	//set location of frame
		
		
		frame.setPreferredSize(dim);	//set the dimension axis (700, 300) into frame; set the size of frame on the location set
		
		
		frame.pack();	//modulate the window size of frame
		frame.setVisible(true);	//true == display.  false == not display

	}
}
