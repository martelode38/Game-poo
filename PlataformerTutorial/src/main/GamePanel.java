package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.util.Random;

import javax.swing.JPanel;

import inputs.KeyboardInputs;
import inputs.MouseInputs;

public class GamePanel extends JPanel{
	
	private float xDelta = 100;
	private float yDelta = 100;
	private float xDir = 1f;
	private float yDir = 1f;
	private int frames = 0;
	private long lastCheck = 0;
	private Color color = new Color(150,20,90);
	private Random random;
	
	public GamePanel() {
		random = new Random();
		setFocusable(true);
		addKeyListener(new KeyboardInputs(this));
		setPanelSize();
		addMouseListener(new MouseInputs(this));
		addMouseMotionListener(new MouseInputs(this));
	}
	
	private void setPanelSize() {
		Dimension size = new Dimension(800,800);
		setMinimumSize(size);
		setPreferredSize(size);
		setMaximumSize(size);
		
	}

	public void changeXDelta(int v){
		this.xDelta += v;

	}
	
	public void changeYDelta(int v){
		this.yDelta += v;

	}
	
	public void setRectPos(int x, int y) {
		this.xDelta = x;
		this.yDelta = y;

	}
	
	public void paintComponent(Graphics g) {
		//metodo chamado sempre que é apertado o play
		// o grafics permite que a gente desenhe um objeto grafico
		
		super.paintComponent(g);
		
		upgradeRetangle();
		g.setColor(color);
		g.fillRect((int)xDelta,(int)yDelta, 200, 50);
		

	}

	private void upgradeRetangle() {
		xDelta += xDir;
		if(xDelta > 400 || xDelta < 0) {
			xDir *= -1;
			color = getRndColor();
		}
		
		if(yDelta > 400 || yDelta < 0) {
			yDir *= -1;
			color = getRndColor();
		}
		yDelta += yDir;
		
	}
	
	public Color getRndColor() {
		int r = random.nextInt(255);
		int g = random.nextInt(255);
		int b = random.nextInt(255);
		
		return new Color (r,g,b);
	}
}//
