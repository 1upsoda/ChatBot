package chat.controller;

import javax.swing.JOptionPane;

public class Continue
{

	public void start()
	{
		ContinueGUI();
		
	}
	private void ContinueGUI()
	{
		String answerGUI = JOptionPane.showInputDialog("What do you want to chat aboot?");
		if(answerGUI.equalsIgnoreCase("Ponies") || answerGUI.equalsIgnoreCase("Pones") || answerGUI.equalsIgnoreCase("Pony") || answerGUI.equalsIgnoreCase("Pone"));
		{
			JOptionPane.showMessageDialog(null, "Then why the heck did you play with The Chat%20Bot");
		}
		if(answerGUI.equalsIgnoreCase("ponys"))
		{
			JOptionPane.showMessageDialog(null, "Then why the heck did you play with The Chat%20Bot");
		}
	}
}
