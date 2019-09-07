package _08GridLayout;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
//import java.beans.ConstructorProperties;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class GridLayoutTutorial {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("KT's frame");	//create an instance of JFrame
		Dimension dim = new Dimension(600, 400);	//create an instance of Dimension with the Dimension (frame size) constructor parameters
		frame.setLocation(980, 470); 	//set location of frame
		frame.setPreferredSize(dim);	//set the dimension(size) of frame at axis (700, 300)

		
		/* In GridLayout class, there are some of specified constructors
		   The following specified constructor is what we are going to use
		   
		   public GridLayout(int rows, int cols) {
           		this(rows, cols, 0, 0);
    	   }									
    	   
    	   It's thought that GridLayout returns true unless row==0 && col==0
    	   That means, if row != 0 || col != 0, GridLayout covers all of inputs (label1, label2..) regardless of the number of inputs is less than or greater than the grid size
    	   
    	   The class itself provides user with a best effort reasonable output 
    	   
    	   For instance, we have four labels to display on a grid.
    	   
    	   case 1) GridLayout gridLayout = new GridLayout(1,0) will have the same output as GridLayout gridLayout = new GridLayout(0,4); GridLayout class takes the given row 1 first and it creates 4 columns inside the given row  
    	   		   GridLayout gridLayout = new GridLayout(1,2) == GridLayout gridLayout = new GridLayout(0,4)
    	   		   GridLayout gridLayout = new GridLayout(1,3) == GridLayout gridLayout = new GridLayout(0,4)    	   		   
    	   		   
    	   case 2) GridLayout gridLayout = new GridLayout(0,1) will have the same output as GridLayout gridLayout = new GridLayout(4,0); GridLayout class takes the given col 1 first and it creates 4 rows inside the given col  
    	   		   
    	   case 3) GridLayout gridLayout = new GridLayout(2,0) will have the same output as GridLayout gridLayout = new GridLayout(2,2); GridLayout class takes the given row 2 first and it creates 2 columns inside the given row		   		   
    	   		   GridLayout gridLayout = new GridLayout(0,2)== GridLayout gridLayout = new GridLayout(2,2)
    	   		   GridLayout gridLayout = new GridLayout(2,1) == GridLayout gridLayout = new GridLayout(2,2)
    	   		   GridLayout gridLayout = new GridLayout(2,2) == GridLayout gridLayout = new GridLayout(2,2)
    	   		   GridLayout gridLayout = new GridLayout(2,4) == GridLayout gridLayout = new GridLayout(2,2) 
    	   
    	     	   # It seems to be initializing a proper numeric & current value in order unless it is zero.
    	     	       if there is difference between the grid size and the number of input, assigning the rest of the input to the grid is proceeded at the current non-zero axis  
    	     	   
    	     	   # if there is any zero input in either size of row or column, input is assigned into the location whose initial axis is not zero and then any input which is over the given grid size is dealt with at the location of zero  
    	     	   
    	   any grid size that is greater than the number of input assigns each of input at a correct location within a given grid  	   
    	   */
		  
		GridLayout gridLayout = new GridLayout(2,2);	//create an instance of GridLayout with a specified constructor having two parameters row and column
		frame.setLayout(gridLayout);	//set layout into frame depending on size of row and column
		
		JLabel label1 = new JLabel();	//create an instance of JLabel using a default constructor in JLabel class
		label1.setText("label 1");	//set text using setter; we need setter since we are using the default constructor from JLabel class. 		
		label1.setOpaque(true);	//set setOpaque (background color) to be true. If true the component paints every pixel within its bounds.
		label1.setBackground(Color.RED);

		
		JLabel label2 = new JLabel();	//create an instance of JLabel using a default constructor in JLabel class
		label2.setText("label 2");
		label2.setOpaque(true);
		label2.setBackground(Color.BLUE);
		
		JLabel label3 = new JLabel();	//create an instance of JLabel using a default constructor in JLabel class
		label3.setText("label 3");
		label3.setOpaque(true);
		label3.setBackground(Color.GREEN);
		
		JLabel label4 = new JLabel();	//create an instance of JLabel using a default constructor in JLabel class
		label4.setText("label 4");
		label4.setOpaque(true);
		label4.setBackground(Color.YELLOW);
		
		frame.add(label1);	//add labels to frame
		frame.add(label2);
		frame.add(label3);
		frame.add(label4);
		frame.pack();	//modulate the window size of frame
		frame.setVisible(true);	//true == display.  false == not display
		
		//there is a default constructor and setter methods in GridLayout class. So, we use both a pair of default constructor, specified constructor, setters and getters. 
		System.out.println(label1.getLocation());
		System.out.println(label2.getLocation());
		System.out.println(label3.getLocation());
		System.out.println(label4.getLocation());
		
        
	}
}
