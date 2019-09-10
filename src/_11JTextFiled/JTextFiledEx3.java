package _11JTextFiled;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class JTextFiledEx3 {
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("KT's frame");	//create an instance of JFrame
		Dimension dim = new Dimension(600, 400);	//create an instance of Dimension with the Dimension (frame size) constructor parameters
		frame.setLocation(980, 470); 	//set location of frame
		frame.setPreferredSize(dim);	//set the dimension(size) of frame at axis (700, 300)

		JTextField textField = new JTextField();	//create an instance of JTextField with a specified constructor having a string parameter
	    textField.setEnabled(true);	//true == respond to user input, false == non respond to user input		
		textField.setToolTipText("text field is activated and is writable");	//set a on-hover message
//		textField.setToolTipText("text field is not activated and not writable");	//set a on-hover message
		

		/* The listener interface for receiving keyboard events (keystrokes).
		 * The class that is interested in processing a keyboard event
		 * either implements this interface (and all the methods it
		 * contains) or extends the abstract <code>KeyAdapter</code> class
		 * (overriding only the methods of interest). */

		//create an instance of KeyListener
		KeyListener listener = new KeyListener() {

			//each of the following abstract method is re-defined by using @Override so that an appropriate responsive response can be implemented depending on key events  
			/* Invoked when a key has been typed.*/
			@Override
			public void keyTyped(KeyEvent e) {
				//get a key character and a key code
				System.out.println("# keyTyped(KeyEvent e)    #" + " e.getKeyChar(): " + e.getKeyChar() + "  e.getKeyCode(): " + e.getKeyCode());
			}

			/* Invoked when a key has been pressed.*/
			@Override
			public void keyPressed(KeyEvent e) {
				//get a key character and a key code
				System.out.println("# keyPressed(KeyEvent e)  #" + " e.getKeyChar(): " + e.getKeyChar() + "  e.getKeyCode(): " + e.getKeyCode());
			}

			/* Invoked when a key has been released.*/
			@Override
			public void keyReleased(KeyEvent e) {
				//get a key character and a key code
				System.out.println("# keyReleased(KeyEvent e) #" + " e.getKeyChar(): " + e.getKeyChar() + "  e.getKeyCode(): " + e.getKeyCode() + "\n");
			}
			
		};

		textField.addKeyListener(listener);	//add listener to textField
		frame.add(textField, BorderLayout.CENTER);	//add textField and its border layout to frame
		frame.pack();	//modulate the window size of frame
		frame.setVisible(true);	//true == display.  false == not display
		
		//there is a default constructor and setter methods in GridLayout class. So, we use both a pair of default constructor, specified constructor, setters and getters. 	
        
	}
}

