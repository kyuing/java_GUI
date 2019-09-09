package _10BorderLayout;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
//import java.beans.ConstructorProperties;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class BorderLayoutEx {

	private static int clicker = 0;
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("KT's frame");	//create an instance of JFrame
		Dimension dim = new Dimension(600, 400);	//create an instance of Dimension with the Dimension (frame size) constructor parameters
		frame.setLocation(980, 470); 	//set location of frame
		frame.setPreferredSize(dim);	//set the dimension(size) of frame at axis (700, 300)

		
		JLabel label1 = new JLabel("e a s t");	//create an instance of JLabel with a specified constructor having a string parameter
		label1.setHorizontalAlignment(SwingConstants.CENTER);	//set a horizontal alignment of the label
		label1.setVerticalAlignment(SwingConstants.CENTER);	//set a horizontal alignment of the label
		label1.setOpaque(true); 	//set setOpaque (background color) to be true (to be paintable). If true the component paints every pixel within its bounds.
		label1.setBackground(Color.CYAN); 	//set a back ground color of the label

		JLabel label2 = new JLabel("west");	//create an instance of JLabel with a specified constructor having a string parameter
		label2.setHorizontalAlignment(SwingConstants.CENTER);	//set a horizontal alignment of the label
		label2.setVerticalAlignment(SwingConstants.CENTER);	//set a horizontal alignment of the label
		label2.setOpaque(true); 	//set setOpaque (background color) to be true (to be paintable). If true the component paints every pixel within its bounds.
		label2.setBackground(Color.BLUE); 	//set a back ground color of the label
		
		JLabel label3 = new JLabel("south      ");	//create an instance of JLabel with a specified constructor having a string parameter
		label3.setHorizontalAlignment(SwingConstants.CENTER);	//set a horizontal alignment of the label
		label3.setVerticalAlignment(SwingConstants.CENTER);	//set a horizontal alignment of the label
		label3.setOpaque(true); 	//set setOpaque (background color) to be true (to be paintable). If true the component paints every pixel within its bounds.
		label3.setBackground(Color.GREEN); 	//set a back ground color of the label
		
		JLabel label4 = new JLabel("north\n    ");	//create an instance of JLabel with a specified constructor having a string parameter
		label4.setHorizontalAlignment(SwingConstants.CENTER);	//set a horizontal alignment of the label
		label4.setVerticalAlignment(SwingConstants.CENTER);	//set a horizontal alignment of the label
		label4.setOpaque(true); 	//set setOpaque (background color) to be true (to be paintable). If true the component paints every pixel within its bounds.
		label4.setBackground(Color.MAGENTA); 	//set a back ground color of the label
		
		JLabel label5 = new JLabel("center");	//create an instance of JLabel with a specified constructor having a string parameter
		label5.setHorizontalAlignment(SwingConstants.CENTER);	//set a horizontal alignment of the label
		label5.setVerticalAlignment(SwingConstants.CENTER);	//set a horizontal alignment of the label
		label5.setOpaque(true); 	//set setOpaque (background color) to be true (to be paintable). If true the component paints every pixel within its bounds.
		label5.setBackground(Color.PINK); 	//set a back ground color of the label
		
		//each of label has its own horizontal size allocated by each of text input in the number of letters or spaces, and so on. So, frame will apply each of the feature of label into frame itself
		//In addition, if there is any empty border layout (space), it will be assigned to a label where is adjacent the empty border layout (space) 
		frame.add(label1, BorderLayout.EAST);	//add the label and border layout to frame
		frame.add(label2, BorderLayout.WEST);	//add the label and border layout to frame
		frame.add(label3, BorderLayout.SOUTH);	//add the label and border layout to frame
		frame.add(label4, BorderLayout.NORTH);	//add the label and border layout to frame
		frame.add(label5, BorderLayout.CENTER);	//add the label and border layout to frame
		frame.pack();	//modulate the window size of frame
		frame.setVisible(true);	//true == display.  false == not display
		
		//there is a default constructor and setter methods in GridLayout class. So, we use both a pair of default constructor, specified constructor, setters and getters. 	
        
	}
}

