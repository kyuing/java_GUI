package _09JButton;

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

public class JButtonEx {

	private static int clicker = 0;
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("KT's frame");	//create an instance of JFrame
		Dimension dim = new Dimension(600, 400);	//create an instance of Dimension with the Dimension (frame size) constructor parameters
		frame.setLocation(980, 470); 	//set location of frame
		frame.setPreferredSize(dim);	//set the dimension(size) of frame at axis (700, 300)

		GridLayout layout = new GridLayout(1,2);	//create an instance of GridLayout with a specified constructor having two int parameter (rwo, col)
		frame.setLayout(layout);	//add the layout into frame
		
		JLabel label = new JLabel("0");	//create an instance of JLabel with a specified constructor having a string parameter; this will count the button event in clicking
//		label.setText(label.getText());
		frame.add(label);	//add label into frame

		/* In JButton class, there are some of specified constructors
		   The following specified constructor is what we are going to use.
		   
		   @ConstructorProperties({"text"})
    		public JButton(String text) {
        		this(text, null);
    		}  	   
    		
    		# note that there is default constructor as well in JButton class
    		 public JButton() {
        		this(null, null);
    		}                                                               */
  
		JButton jButton = new JButton("JButton");	//create an instance of JButton with a specified constructor having a string parameter
		jButton.setText("test");	//there is a setter for text in JButton class. so we can set a new text input into jButton.
		jButton.setToolTipText("This is a test button"); 	//set a setToolTipText into jButton; Registers the text to display in a tool tip. The text displays when the cursor lingers over the component.
		jButton.setFont(new Font("BAZOOKA", Font.BOLD, 20));	//set a font of jButton by calling an instance of a specified constructor having three parameters(font, font style, font size) in Font class as a parameter
		jButton.setForeground(Color.YELLOW); 	//set a fore ground color (text color) of jButton by having the public final static Color variable YELLOW that is in Color class as a parameter  
		jButton.setBackground(Color.darkGray); 	//set a back ground color of jButton by having the public final static Color variable DARKGREY that is in Color class as a parameter
		
		
		
		/*   # # Box-orientation constants # # 
		 *   
		 *   horizontal movement == <--->; RIGHT, LEFT,  
		 *             
		 *                          ^
		 *                          |
		 *    vertical movement  == |; TOP, BOTTOM
		 *                          v
		 * */
		jButton.setHorizontalAlignment(SwingConstants.LEFT);	//set a horizontal alignment of jButton by having the public static final int variable LEFT that is in SwingConstants interface class as a parameter. 
		jButton.setVerticalAlignment(SwingConstants.BOTTOM);	//set a vertical alignment of jButton by having the public static final int variable BOTTOM that is in SwingConstants interface class as a parameter
//		frame.add(jButton);	//add jButton into frame
		
		
		/**
		 * The listener interface for receiving action events.
		 * The class that is interested in processing an action event
		 * implements this interface, and the object created with that
		 * class is registered with a component, using the component's
		 * <code>addActionListener</code> method. When the action event
		 * occurs, that object's <code>actionPerformed</code> method is
		 * invoked.
		 *
		 * @see ActionEvent
		 * @see <a href="https://docs.oracle.com/javase/tutorial/uiswing/events/actionlistener.html">How to Write an Action Listener</a>
		 *
		 * @author Carl Quinn
		 * @since 1.1
		 */
		//create an instance of ActionListener
		ActionListener listener = new ActionListener() {
			
			@Override
			//Invoked when an action occurs.
		    public void actionPerformed(ActionEvent e) {
				
				label.setText(String.valueOf(Integer.valueOf( label.getText() + 1) ) );
//				label.setText(String.valueOf(Integer.valueOf( label.getText() + 1) ) );
	
				clicker++;	//increment it once the button is clicked
				System.out.println("The button is clicked " + clicker + " time(s)");

				
				label.setText(String.valueOf(clicker));
			}
			
			
		};
		
		jButton.addActionListener(listener);	//add listener into jButton. call back method approach 
		
		
		
		
		
		
		frame.add(jButton);	//add jButton into frame
		frame.pack();	//modulate the window size of frame
		frame.setVisible(true);	//true == display.  false == not display
		
		//there is a default constructor and setter methods in GridLayout class. So, we use both a pair of default constructor, specified constructor, setters and getters. 
		System.out.println("jButton.getText(): " + jButton.getText());	//get text
		System.out.println("jButton.getFont(): " + jButton.getFont());	//get font
		System.out.println("jButton.getForeground(): " + jButton.getForeground());	//get fore ground
		System.out.println("jButton.getBackground(): " + jButton.getBackground());	//get back ground
		System.out.println("jButton.getHorizontalAlignment(): " + jButton.getHorizontalAlignment());	//get horizontal alignment
		System.out.println("jButton.getVerticalAlignment(): " + jButton.getVerticalAlignment());	//get vertical alignment
//		System.out.println(clicker);
		
        
	}
}

