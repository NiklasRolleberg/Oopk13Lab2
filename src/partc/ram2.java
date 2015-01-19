package partc;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;

import knapp.MyButton;

public class ram2 {
	
	static int n;
	static MyButton[] buttons;
	static JFrame frame;
	static JPanel panel;
	
	public static void main( String[] args ){
		/*Takes an input number*/
		while ( true )
		{
			System.out.println("SKRIV ETT NUMMER!");
			Scanner reader = new Scanner(System.in);   			//http://stackoverflow.com/questions/5287538/how-to-get-basic-user-input-for-java
			try{
				n=reader.nextInt();
				break;
			}catch(Exception e){
				System.out.println("feeeel, du får försöka igen");
			}
		}
		
		
		/*Changes the gridlayout*/
		frame=new JFrame();
		panel=new JPanel(new GridLayout((int) Math.sqrt(n),1));  //TYPECASTING
		buttons=new MyButton[n];
		
		/*Creates and adds buttons to the panel and adds a ActionListener to the button*/
		for ( int i = 0; i < n ; i++ ){		
			buttons[i]=new MyButton();
			buttons[i].removeAL();
			buttons[i].addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){  // 4_forelasnong.pdf	
					String clickedbutton = e.getActionCommand();
					
					for (MyButton button : buttons){
						if (button.getActionCommand() != clickedbutton){
							button.toggleState();
						}
					}
					}});
			
			panel.add(buttons[i]);
		}
		
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(400,310));
		frame.pack();
		frame.setVisible(true);		
	}	
} 


