package knapp;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;


public class MyButton extends JButton implements ActionListener{
	/*Lots of variables!*/
	final static String ABC = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	int state = 1;   //to keep track on which state the button is in
	Color col1;
	Color col2;
	String text1;
	String text2;
	
	/*Constructor 1 takes no arguments*/
	 public MyButton(){											
		 this(ButtonColor(), ButtonColor(),ButtonText(),ButtonText());
	 }

	/*Constructor 2 takes 4 arguments*/
	 public MyButton(Color col1, Color col2, String text1, String text2){	
		 this.col1 = col1;
		 this.col2 = col2;
		 this.text1 = text1;
		 this.text2 = text2;
		 
		 setText( text1 );
		 setBackground( col1 );
		 addActionListener(this);
	 }
	 
	 /*Changes the state*/
	 public void toggleState(){
		 state = state*-1;
		 if (state == 1){
			 setText(text1);
			 setBackground(col1);
		 }
		 else{
			 setText(text2);
			 setBackground(col2);
		 }
	 }
	 
	 public void removeAL(){
		 for(ActionListener act : getActionListeners()) {			//http://stackoverflow.com/questions/16731328/removing-actionlisteners
			    removeActionListener(act); 					
			}
	 }
	 
	 
	@Override
	public void actionPerformed(ActionEvent e) {
		toggleState();
	}
	
	/*Generates a random string*/
	public static String ButtonText(){
			String s="";	
			for (int i=0 ; i<4 ; i++){
				s+=ABC.charAt((int)(Math.random()*25));  //TYPECASTING
			}
			return s;
		}
	
	//Generates a random color
	public static Color ButtonColor(){
		return new Color((float) Math.random(), (float) Math.random(), 
						  (float) Math.random()); 							//http://stackoverflow.com/questions/4246351/creating-random-colour-in-java
	}
}
	 
