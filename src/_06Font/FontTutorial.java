package _06Font;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class FontTutorial {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("KT's frame");	//create an instance of JFrame
		Dimension dim = new Dimension(700, 400);	//create an instance of Dimension with the Dimension (frame size) constructor parameters
		frame.setLocation(650, 250); 	//set location of frame
		frame.setPreferredSize(dim);	//set the dimension(size) of frame at axis (700, 300)

		JLabel label = new JLabel();	//create an instance of JLabel using a default constructor in JLabel class
		label.setText("text with the setter setText()");	//set text using setter; we need setter since we are using the default constructor from JLabel class. 
		label.setVerticalAlignment(SwingConstants.TOP);	//SwingConstants.TOP is a parameter which has a TOP attribute. SwingConstants is an interface for alignment
		label.setHorizontalAlignment(SwingConstants.RIGHT);	//SwingConstants.RIGHT is a parameter which has a RIGHT attribute. SwingConstants is an interface for alignment


		/* In Font class, there are some of specified constructors
		   The following specified constructor is what we are going to use
		   
		   public Font(String name, int style, int size) {
	           this.name = (name != null) ? name : "Default";
	           this.style = (style & ~0x03) == 0 ? style : 0;
	           this.size = size;
	           this.pointSize = size;
           }											   */
		Font font = new Font("Verdana", Font.ITALIC, 40);	//create an instance of Font with a specified constructor having three parameters
		label.setFont(font);

		frame.add(label);	//add label to frame
		frame.pack();	//modulate the window size of frame
		frame.setVisible(true);	//true == display.  false == not display
		
		
		System.out.println(label.getText());	//print out label text set using getter on console
		System.out.println(label.getVerticalAlignment()); 	//print out the vertical alignment attribute of text of label set using getter on console
		System.out.println(label.getHorizontalAlignment()); 	//print out the horizontal alignment attribute of text of label set using getter on console
		
		//useful methods in Font class. there are no a default constructor and setter methods in Font class. So, we should use an appropriate specified constructor of Font class in instantiating.
		System.out.println("\nfont.getSize(): " + font.getSize());	//get the font size
		System.out.println("font.getName(): " + font.getName());	//get the font name
		System.out.println("font.getFontName(): " + font.getFontName());	//get the font name and its style
		System.out.println("font.getStyle(): " + font.getStyle());	//get the font style as a numeric value
		System.out.println("font.isBold(): " + font.isBold());	//get the boolean flag; bold
		System.out.println("font.isItalic(): " + font.isItalic());	//get the boolean flag; italic
		System.out.println("font.isPlain(): " + font.isPlain());	//get the boolean flag; plain
		

		/* In Font class, you can see how the font styles (Font.PLAIN, Font.BOLD, Font.ITALIC) are represented as a numeric value each 
		   
		   font.getStyle() above has returned 2. Let's see its feature 
		   
		   //Constants to be used for styles. Can be combined to mix styles.
		   
		   public static final int PLAIN       = 0;	//The plain style constant.   
		
		   public static final int BOLD        = 1;	//The bold style constant.  This can be combined with the other style constants (except PLAIN) for mixed styles.
		   
		   public static final int ITALIC      = 2;	//The italicized style constant.  This can be combined with the other style constants (except PLAIN) for mixed styles.
		   
		   and so on..  
		   
		   # more information at Font class*/
        
	}
}
