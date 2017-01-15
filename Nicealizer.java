// School: Arizona State University
// Name: Robert Hammerschmidt
//  Description: Initiates the JApplet for Nice.java

import javax.swing.*;

public class Nicealizer extends JApplet
 {
  private final int WIDTH = 650;
  private final int HEIGHT = 340;

  /**
	 * init - creates a new object of Nice
	 * and gives it the parameters for width
	 * and height
	 */
  public void init()
   {
       Nice panel = new Nice(WIDTH,HEIGHT);
       getContentPane().add(panel);
       setSize(WIDTH,HEIGHT);
   }
 }