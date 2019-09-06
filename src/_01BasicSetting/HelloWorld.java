package _01BasicSetting;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloWorld {

	public static void main(String[] args) {
		// hello world
		JFrame frame = new JFrame("KT's frame");	//create an instance of JFrame
		JLabel label = new JLabel("Hello World");	//create an instance of JLabel

		frame.add(label);	//add label to frame
		frame.pack();	//modulate the window size of JFrame
		frame.setVisible(true);	//true == display.  false == not display
	}

}
