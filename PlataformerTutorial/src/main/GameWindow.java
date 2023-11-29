package main;

import javax.swing.JFrame;

public class GameWindow extends JFrame{
	private JFrame jframe;
	
	public GameWindow(GamePanel gamePanel) {
		jframe = new JFrame();
		
//		jframe.setSize(400,400);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.add(gamePanel);
		jframe.setLocationRelativeTo(null); //isso e so pra a tela se iniciar no centro sempre
		jframe.setResizable(false);
		jframe.pack();
		jframe.setVisible(true);
	}
}//
