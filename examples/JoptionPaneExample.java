package Joptionpane.examples;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class JoptionPaneExample {
	
	  public static void main(String[] args)
	  {
	    String backupDir = "/Users/al/backups";
	     
	    // create a jframe
	    JFrame frame = new JFrame("JOptionPane showMessageDialog example");
	     
	    // show a joptionpane dialog using showMessageDialog
	    JOptionPane.showMessageDialog(frame,"Hello","Backup problem",JOptionPane.PLAIN_MESSAGE);
	    
	    System.exit(0);
	  }
	}

