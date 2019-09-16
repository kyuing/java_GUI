package _13BoxLayout;


import java.awt.Dimension;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class BoxLayoutEx {
	
	private static int maxCount = 20;	//a static int variable
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("KT's frame");	//create an instance of JFrame
		Dimension dim = new Dimension(600, 400);	//create an instance of Dimension with the Dimension (frame size) constructor parameters
		frame.setLocation(980, 470); 	//set location of frame
		frame.setPreferredSize(dim);	//set the dimension(size) of frame at axis (700, 300)

		/* BoxLayout(Container target, int axis) Creates a layout manager that will lay out components along the given axis
		
		   @ConstructorProperties({"target", "axis"})
    			public BoxLayout(Container target, int axis) {
        			if (axis != X_AXIS && axis != Y_AXIS && axis != LINE_AXIS && axis != PAGE_AXIS) {
             			throw new AWTError("Invalid axis");
        			}
        	this.axis = axis;
        	this.target = target;
    		}					 */
 
		/************************************************************************************************************************************
		 * # BoxLayout attempts to arrange components at their preferred widths (for horizontal layout) or heights (for vertical layout).	*
		 * # BoxLayout is not responsive																									*
		 * 																																	*
		 * # the method public Container getContentPane() in JRootPane.class returns the content pane										* 
		 *   -- the container that holds the components parented by the root pane.															*
		 *   In other word,																													*
		 * 	 The layer that is used to hold objects is called "content pane".																*
		 *   Objects are added to the content pane layer of the container. 																	*
		 *   getContentPane() method retrieves the content pane layer so that you can add an object to it.									*
		 ***********************************************************************************************************************************/		
											/* target */ 			/* axis; X_AXIS == row, Y_AXIS == column*/
		BoxLayout boxLayout = new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS);	//create an instance of BoxLayout with a specified constructor having two parameters	
		frame.setLayout(boxLayout); 	//set a new layout with boxLayout to frame
		for (int i=0; i<maxCount; i++) {
			
			/* i++ == i + 1 which increments the number after the expression is evaluated.
			 * ++i == 1 + i which increments the number before the current expression is evaluated  */

			/************************************************************************************ 
			 * if (i < 10) {																	*
			 * 		String zeroPadding = "0";													*
			 * 		frame.add(new JButton("test button" + zeroPadding + (i + 1)));				*
			 * 																					*
			 * }else {																			*
			 * 		frame.add(new JButton("test button" + (i + 1)));							*
			 * }																				*
			 * 																					*
			 * if i < 10, a zero will be padded in front of an index number in general.			*
			 * However, there is an issue at i = 9 in relation to ScringBuilder.class			*
			 * which results in having 01...09 010 not 10										*
			 * 																					*
			 * (this issue seems to be pointing a convert or a space padding issue 				*
			 *  between string and number at a specific position in a conditional operator) 	*
			 ***********************************************************************************/	
			
			//Thus, we will go for i < 9 
			if (i < 9) {	//(!(i > 8)) outputs the same
				String zeroPadding = "0";
				frame.add(new JButton("test button" + zeroPadding + (i + 1)));
				
			}else {
				//i > 9
				frame.add(new JButton("test button" + (i + 1)));
			}
			
		}
		
		frame.pack();	//modulate the window size of frame
		frame.setVisible(true);	//true == display.  false == not display 	
        
	}
}

