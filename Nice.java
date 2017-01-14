import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.awt.TextField;
import java.applet.Applet;

public class Nice extends JPanel{
	
	private int width, height;
	private JPanel mainPanel;
	private JButton Niceify;
	private JLabel input, output, nice;
	private JTextField inputText;
	private JTextField outputText;
	
	public Nice(int width, int height){
	       this.width = width;
	       this.height = height;
	       mainPanel = new JPanel();
	       
	       Niceify = new JButton("Niceify");
	       input = new JLabel("Insert mean message here: ");
	       output = new JLabel("Here is the Niceified Message: ");
	       nice = new JLabel("The Niceifier");
	       inputText = new JTextField("input mean message");
	       outputText = new JTextField("nice message");
	       
	       mainPanel.setLayout(new GridLayout(3, 3));
	       mainPanel.add(input);
	       mainPanel.add(inputText);
	       mainPanel.add(output);
	       mainPanel.add(outputText);
	       mainPanel.add(Niceify);
	       mainPanel.add(nice);
	       
	       Niceify.addActionListener (new ButtonListener());
	       
	       setLayout(new BorderLayout());
	       mainPanel.setPreferredSize(new Dimension(width, 120));
	       add(mainPanel);

	       setPreferredSize(new Dimension(width,height));
	   }
	
	private String makeNice(String meanString){
		String niceString = meanString;
		String ugly = "good looking";
		String fat = "in good shape";
		String old = "young";
		String overrated = "underrated";
		String stupid = "smart";
		String dumb = "smart";
		String virgin = "wizard";
		String shutUp = "I enjoy your conversation";
		String loud = "soft-spoken";
		String rude = "nice";
		String stink = "smells nice";
		String dick = "sandwich";
		String fuck = "love";
		String shit = "flowers";
		String ass = "chair";
		String douche = "nice person";
		String bitch = "nice lady";
		String nigga = "brother";
		String nigger = "nice person";
		String horny = "excited";
		String cunt = "mountain";
		String pussy = "food";
		String nazi = "good samaritan";
		String cock = "nice guy";
		
		
		String result = niceString.replaceAll("ugly", ugly);
		result = result.replaceAll("fat", fat);
		result = result.replaceAll("old", old);
		result = result.replaceAll("overrated", overrated);
		result = result.replaceAll("stupid", stupid);
		result = result.replaceAll("dumb", dumb);
		result = result.replaceAll("virgin", virgin);
		result = result.replaceAll("shut up", shutUp);
		result = result.replaceAll("loud", loud);
		result = result.replaceAll("rude", rude);
		result = result.replaceAll("stink", stink);
		result = result.replaceAll("dick", dick);
		result = result.replaceAll("ass", ass);
		result = result.replaceAll("fuck", fuck);
		result = result.replaceAll("shit", shit);
		result = result.replaceAll("ass", ass);
		result = result.replaceAll("douch", douche);
		result = result.replaceAll("bitch", bitch);
		result = result.replaceAll("nigga", nigga);
		result = result.replaceAll("nigger", nigger);
		result = result.replaceAll("horny", horny);
		result = result.replaceAll("cunt", cunt);
		result = result.replaceAll("pussy", pussy);
		result = result.replaceAll("nazi", nazi);
		result = result.replaceAll("cock", cock);
		return result;
	}
	
	
	private class ButtonListener implements ActionListener
	   {
	       public void actionPerformed(ActionEvent event)
	        {
	            Object action = event.getSource();

				if( event.getSource()== Niceify)
				{
					String theMeanMessage = inputText.getText();
					String theNiceString = makeNice(theMeanMessage);
					outputText.setText(theNiceString);
				}

	         }
	     } //end of ButtonListener

}
