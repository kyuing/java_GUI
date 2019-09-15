package _12FlowLayout;

import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutEx {
	
	private static int maxCount = 20;	//a static int variable
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("KT's frame");	//create an instance of JFrame
		Dimension dim = new Dimension(600, 400);	//create an instance of Dimension with the Dimension (frame size) constructor parameters
		frame.setLocation(980, 470); 	//set location of frame
		frame.setPreferredSize(dim);	//set the dimension(size) of frame at axis (700, 300)

		/* Constructs a new <code>FlowLayout</code> with a centered alignment 
		   and a default 5-unit horizontal and vertical gap.
		
		   public FlowLayout() {
	        this(CENTER, 5, 5);
	       }					 */
		//create an instance of FlowLayout with the default constructor. 
		//A flow layout arranges components in a directional flow, much like lines of text in a paragraph.
		//FlowLayout provides a responsive layout.
		FlowLayout flowLayout = new FlowLayout();	
		frame.setLayout(flowLayout); 	//set a new layout with flowLayout to frame
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

