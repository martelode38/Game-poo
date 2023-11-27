package main;

import java.awt.Graphics;
import java.awt.event.KeyEvent;

import javax.swing.JPanel;

import inputs.KeyboardInputs;
import inputs.MouseInputs;

public class GamePanel extends JPanel{
	
	public GamePanel() {
		addKeyListener(new KeyboardInputs());
		addMouseListener(new MouseInputs());
		addMouseMotionListener(new MouseInputs());
	}
	
	public void paintComponent(Graphics g) {
		//metodo chamado sempre que é apertado o play
		// o grafics permite que a gente desenhe um objeto grafico
		
		super.paintComponent(g);
		g.fillRect(100, 100, 200, 50);
		
	}
}
