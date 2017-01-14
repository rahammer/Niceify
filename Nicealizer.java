// Assignment #: Arizona State University CSE205 #12
//         Name: Robert Hammerschmidt
//  Description: Inputs a nasty message and turns it
//	into a nice message.

import javax.swing.*;

public class Nicealizer extends JApplet
 {
  private final int WIDTH = 650;
  private final int HEIGHT = 340;

  public void init()
   {
       Nice panel = new Nice(WIDTH,HEIGHT);
       getContentPane().add(panel);
       setSize(WIDTH,HEIGHT);
   }
 }