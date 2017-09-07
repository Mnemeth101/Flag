import java.awt.*;

import javax.swing.JFrame;

public class Union extends JFrame{
	private static int Length; // ~1.4 Height
	private static int Height;
	private int scaleG;
	private int scaleH;
	private int scaleE;
	private int scaleF;
	private int scaleK;
	private int offsetx = 5;
	private int offsety = 30;
	
	public Union(int newLen, int newHei) {
		Length = newLen;
		Height = newHei;
		scaleG = (int) (Length*.08289/2);
		scaleH = scaleG*2;
		scaleE = (int) (Height*.100286/2);
		scaleF = scaleE*2;
		scaleK = (int) (Height*.1144);
		init();
	}
	
	public void init() {
		setSize(Length+offsetx, Height+offsety);
		repaint();
	}
	
	public void paint(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(offsetx, offsety, Length, Height);
		//Rows of 6
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 6; j++) {
				Star s = new Star(offsetx + 3*scaleG/2 + 2*j*scaleH, offsety + scaleE + 2*i*scaleF, scaleK);
				s.paint(g);
			}
		}	
		
		//Rows of 5
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				Star s = new Star(offsetx + 3*scaleG/2 + scaleH + 2*j*scaleH, offsety + scaleE + scaleF + 2*i*scaleF, scaleK);
				s.paint(g);
			}
		}
	}
}