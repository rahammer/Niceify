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
		String goddamnit = "Bob Sagat";
		String suicide = "to relationships";
		String freak = "intelligent";
		String chubby = "in good shape";
		String lame = "really interesting";
		String slut = "smart-decision maker";
		String noOne = "everyone";
		String ho = "smart-decision maker";
		String flat = "good-looking";
		String douchebag = "good thinker";
		String retard = "highly intelectual";
		String trash = "valuable";
		String annoying = "worthy";
		String liar = "trustworthy";
		String coward = "brave";
		String moron = "good thinker";
		String obnoxious = "calm";
		String nerd = "computer-adapt individual";
		String leave = "love";
		String crazy = "together";
		String fourEyes = "intelectual looking";
		
		
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
		result = result.replaceAll("godamnit", goddamnit);
		result = result.replaceAll("suicide", suicide);
		result = result.replaceAll("freak", freak);
		result = result.replaceAll("chubby", chubby);
		result = result.replaceAll("lame", lame);
		result = result.replaceAll("slut", slut);
		result = result.replaceAll("no one", noOne);
		result = result.replaceAll("ho", ho);
		result = result.replaceAll("flat", flat);
		result = result.replaceAll("douchebag", douchebag);
		result = result.replaceAll("retard", retard);
		result = result.replaceAll("trash", trash);
		result = result.replaceAll("annoying", annoying);
		result = result.replaceAll("liar", liar);
		result = result.replaceAll("coward", coward);
		result = result.replaceAll("moron", moron);
		result = result.replaceAll("obnoxious", obnoxious);
		result = result.replaceAll("nerd", nerd);
		result = result.replaceAll("leave", leave);
		result = result.replaceAll("crazy", crazy);
		result = result.replaceAll("four eyes", fourEyes);
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
