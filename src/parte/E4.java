package parte;

import javax.swing.JApplet;

import knapp.MyButton;

public class E4 extends JApplet{
	
	MyButton button; 
	
	public void init(){
		button = new MyButton();
		add(button);
		setVisible(true);
	}

}
