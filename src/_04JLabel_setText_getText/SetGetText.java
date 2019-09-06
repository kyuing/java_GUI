package _04JLabel_setText_getText;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SetGetText {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("KT's frame");	//create an instance of JFrame
		Dimension dim = new Dimension(500, 400);	//create an instance of Dimension with the Dimension (frame size) constructor parameters
		JLabel label = new JLabel("Hello World");	//create an instance of JLabel using a specified constructor
		
		frame.setLocation(1050, 250); 	//set location of frame
		frame.setPreferredSize(dim);	//set the dimension(size) of frame at axis (700, 300)
		frame.add(label);	//add label to frame; not the latest value as well
		
		//you can create another instance of JLabel with another name in the same specified constructor with a different parameter
		JLabel labelTest = new JLabel("Hello World2");	
		frame.add(labelTest);	//add labelTest to frame; this is not the latest instance of JLabel as well  
		
		
		//you can also create another instance of JLabel with a default constructor based on the JLabel class		
		JLabel labelFinal = new JLabel();
		labelFinal.setText("Hello World with the setter setText()");	//set text using setter	
		frame.add(labelFinal);	//add labelFinal to frame; it is the latest instance of JLabel which is executable
		
		frame.pack();	//modulate the window size of frame
		frame.setVisible(true);	//true == display.  false == not display
		
		//print out the text set on console using getter
		System.out.println(labelFinal.getText());

	}
}
