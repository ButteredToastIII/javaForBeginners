/*
 * Java For Beginners, Episode 12
 * Basic GUI 
 * Displaying an Image
 */

//Import necessary GUI classes
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Container;

//Obligatory Class Initialization
public class displayAnImage {
	//Also Obligatory Main Statement
	public static void main(String args[]){
		//Create Instances of necessary classes
		JFrame frame = new JFrame(); //JFrame is basically the window
		ImageIcon icon = new ImageIcon("example.png"); //An icon holding an image
		JLabel label = new JLabel(icon); //This is what is going to display the icon, which is holding an image
		Container contentPane = frame.getContentPane(); //This content pane is where all of the labels or text-boxes or buttons will be displayed.
		
		contentPane.add(label); //This will add the label into the content pane in order for it to be displayed
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		/*
		 * This determines the behavior of the frame when the frame is closed.
		 * You can also use HIDE_ON_CLOSE, DISPOSE_ON_CLOSE, and DO_NOTHING_ON_CLOSE
		 */
		frame.pack(); //This basically is another layer inside the frame for storing stuff
		frame.setVisible(true);
	}
}
