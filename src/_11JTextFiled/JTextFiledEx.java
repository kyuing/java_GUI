package _11JTextFiled;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JTextFiledEx {
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("KT's frame");	//create an instance of JFrame
		Dimension dim = new Dimension(600, 400);	//create an instance of Dimension with the Dimension (frame size) constructor parameters
		frame.setLocation(980, 470); 	//set location of frame
		frame.setPreferredSize(dim);	//set the dimension(size) of frame at axis (700, 300)

		/**** a default constructor in JTextFiled class ****
		   public JTextField() { 
		   		this(null, null, 0); 
		   }						*/
		JTextField textField = new JTextField();	//create an instance of JTextField with a specified constructor having a string parameter
		
		/**** a specified constructor in JLabel class ****
		   public JLabel(String text) { 
		   		this(text, null, LEADING); 
		   }                        */
		JLabel label = new JLabel("Enter your text on the text field below.");	//create an instance of JLabel with a specified constructor having a string parameter
		
		/**** a specified constructor in JButton class ****
		   @ConstructorProperties({"text"})
	       public JButton(String text) {
	           this(text, null);
	       } */
		JButton button = new JButton("submit");	//create an instance of JButton with a specified constructor having a string parameter
		button.addActionListener(new ActionListener() {	//create an instance of ActionListener

			@Override
			//invoked when an action occurs 
			public void actionPerformed(ActionEvent e) {

				/* # A JTextField itself is functioned as a kind of setter without having to use .setText("") because it has a text field unless you wanna use .setText("") previously
				 */
				
				label.setText("label.setText(): " + textField.getText());	//set the user text to label by textField.getText() 	
				
			}
			
		});
		 
		frame.add(label, BorderLayout.NORTH);	//add label and its border layout to frame
		frame.add(textField, BorderLayout.CENTER);	//add textField and its border layout to frame
		frame.add(button, BorderLayout.SOUTH);	//add button and its border layout to frame
		frame.pack();	//modulate the window size of frame
		frame.setVisible(true);	//true == display.  false == not display 	
        
	}
}

