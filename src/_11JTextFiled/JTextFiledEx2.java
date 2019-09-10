package _11JTextFiled;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class JTextFiledEx2 {
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("KT's frame");	//create an instance of JFrame
		Dimension dim = new Dimension(600, 400);	//create an instance of Dimension with the Dimension (frame size) constructor parameters
		frame.setLocation(980, 470); 	//set location of frame
		frame.setPreferredSize(dim);	//set the dimension(size) of frame at axis (700, 300)

		JTextField textField = new JTextField();	//create an instance of JTextField with a specified constructor having a string parameter
		textField.setText("test");	//you can preset a text using textField.setText()
	     
		/* .setEnabled()
		 * Sets whether or not this component is enabled.
	     * A component that is enabled may respond to user input,
	     * while a component that is not enabled cannot respond to
	     * user input. */
		textField.setEnabled(true);	//true == respond to user input, false == non respond to user input
		boolean isTrue = textField.setEnabled(true);
		if (textField.setEnabled(true).e) {
			
			
		}
		textField.setToolTipText("text field is activated and writable");	//set a on-hover message
//		textField.setToolTipText("text field is not activated and not writable");	//set a on-hover message
		
		JLabel label = new JLabel("Enter your text on the text field below.");	//create an instance of JLabel with a specified constructor having a string parameter
		
		JButton button = new JButton("submit");	//create an instance of JButton with a specified constructor having a string parameter
		button.addActionListener(new ActionListener() {	//create an instance of ActionListener

			@Override
			//invoked when an action occurs 
			public void actionPerformed(ActionEvent e) {

				/* #1 A JTextField itself is functioned as a kind of setter without having to use .setText("") because it has a its own text field unless you wanna use .setText("")  previously
			
				   #2 If you, for example, have any textField.setText("") before label.setText(textField.getText()),
				     textField.getText() returns the value which has already been set and the last value
				     
				   #3 textField.getText() is also able to return a new running value as it provides us with an empty text field which acts like a setter at the same time even though there is a previous value which has already been set
				     
				   Note that #1 and #2, #3 are subject to a status of textField.setEnabled()
				   if textField.setEnabled(true), textFiled is activated, and #1 #2 #3 work each
				   Otherwise, it's textField.setEnabled(false). textFiled is inactivated, and #2 works only; no running value is able to be input on textField.setEnabled(false)  
     
				 */
				
				label.setText("label.setText(): " + textField.getText());	//set the user text to label by textField.getText() 	
				
			}
			
		});
		 
		frame.add(label, BorderLayout.NORTH);	//add label and its border layout to frame
		frame.add(textField, BorderLayout.CENTER);	//add textField and its border layout to frame
		frame.add(button, BorderLayout.SOUTH);	//add button and its border layout to frame
		frame.pack();	//modulate the window size of frame
		frame.setVisible(true);	//true == display.  false == not display
		
		//there is a default constructor and setter methods in GridLayout class. So, we use both a pair of default constructor, specified constructor, setters and getters. 	
        
	}
}

