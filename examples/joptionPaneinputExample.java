package Joptionpane.examples;
import javax.swing.*;

public class joptionPaneinputExample {
	
	  public static void main(String[] args)
	  {
	    // a jframe here isn't strictly necessary, but it makes the example a little more real
	    JFrame frame = new JFrame();

	    // prompt the user to enter their name
	    String name = JOptionPane.showInputDialog(frame, "What's your name?");

	    // get the user's input. note that if they press Cancel, 'name' will be null
	  	    
	    JOptionPane.showMessageDialog(frame, "your name is "+name);
	 //   System.exit(0);
	  }
}

