package parte;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import knapp.MyButton;

public class E2och3{
	/**
	 * @param args
	 */
	static JFrame frame;
	static MyButton button;
	
	public static void main(String[] args){
				
		frame = new JFrame();
		button = new MyButton(Color.GREEN,Color.RED,"HEJ","DÅ");
		/*
		button.removeAL();
		button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){  // 4_forelasnong.pdf					
					button.toggleState();
				}});*/
		
		frame.setPreferredSize(new Dimension(400,300));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(button);
		frame.pack();
		frame.setVisible(true);
		
	}
}