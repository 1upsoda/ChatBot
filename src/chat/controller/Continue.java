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
		if(answerGUI.equalsIgnoreCase("Ponies") || answerGUI.equalsIgnoreCase("Pones") || answerGUI.equalsIgnoreCase("Pony") || answerGUI.equalsIgnoreCase("Pone"))
		{
			JOptionPane.showMessageDialog(null, "OOh, what's your favorite Pony?");
			PonyChat myPonyChat = new PonyChat();
			myPonyChat.start();
			
		}
		else if(answerGUI.equalsIgnoreCase("Pwny") || answerGUI.equalsIgnoreCase("Pwnies") || answerGUI.equalsIgnoreCase("PWN13Z") || answerGUI.equalsIgnoreCase("PWNIEZ") || answerGUI.equalsIgnoreCase("PONIEZ") || answerGUI.equalsIgnoreCase("pon13z"))
		{
			JOptionPane.showMessageDialog(null, "00h, wh@1'$ Y0R F@V0R1T3 0f teh PWN13Z?");
			PonyChat myPonyChat = new PonyChat();
			myPonyChat.start();
		}
		else if(answerGUI.equalsIgnoreCase("ponys"))
		{
			JOptionPane.showMessageDialog(null, "I mean, good try at english but... Whatever, what is your favorite pony?");
			PonyChat myPonyChat = new PonyChat();
			myPonyChat.start();
		}
	}
}
