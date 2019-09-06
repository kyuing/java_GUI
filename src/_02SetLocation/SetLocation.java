package _02SetLocation;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class SetLocation {

	public static void main(String[] args) {
		// hello world
		JFrame frame = new JFrame("KT's frame");	//create an instance of JFrame
		JLabel label = new JLabel("Hello World");	//create an instance of JLabel

		frame.add(label);	//add label to frame
		
		frame.setLocation(1050, 250); 	//set location of frame
		/*------------------------------------------------------------------------------------
		 - In JAVA, (0,0) is the top left point.                                             -
		 -                                                                                   -
         -     1 2 3 4.....                                                                  -                                                                            -		                                                                                 -
		 - 0 ===================================================================>> x axis    -
		 - 1 |                                                                               -
		 - 2 |                                                                               -
		 - 3 |                                                   (1050, 250)                 -
		 - 4 |                                                                               -
		 - . |                                                                               -
		 - . |                                                                               -
		 - . V                                                                               -
		 -                                                                                   -                                                                            -
		 - Y axis                                                                            -
		-------------------------------------------------------------------------------------*/
		
		frame.pack();	//modulate the window size of frame
		frame.setVisible(true);	//true == display.  false == not display

	}

}
