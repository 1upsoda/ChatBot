package chat.controller;

import javax.swing.JOptionPane;

public class Chat
{

	public void start()
	{
		chatGUI();
		
	}
	private void chatGUI()
	{
		JOptionPane.showMessageDialog(null, "Hello I am the Chat%20Bot");
		String answerGUI = JOptionPane.showInputDialog("Want to chat?");
		if(answerGUI.equalsIgnoreCase("Sure") || answerGUI.equalsIgnoreCase("Yeah") || answerGUI.equalsIgnoreCase("Okay") || answerGUI.equalsIgnoreCase("alright") || answerGUI.equalsIgnoreCase("ok") || answerGUI.equalsIgnoreCase("yes") || answerGUI.equalsIgnoreCase("yep"))
		{
			JOptionPane.showMessageDialog(null, "Yay.");
			Continue myContinue = new Continue();
			myContinue.start();
		}
		else if(answerGUI.equalsIgnoreCase("No") || answerGUI.equalsIgnoreCase("Nah") || answerGUI.equalsIgnoreCase("Nope") || answerGUI.equalsIgnoreCase("Not Really"))
		{
			JOptionPane.showMessageDialog(null, "Then why the heck did you play with The Chat%20Bot");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Alrighty then...");
			Continue myContinue = new Continue();
			myContinue.start();
		}
			
	}
}
