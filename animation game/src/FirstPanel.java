import javax.swing.*;
public class  FirstPanel extends JPanel {
	@Override public void paintComponent(java.awt.Graphics g) {
	g.fillRect(40, 30, 40, 23);			
	}
	public static void main(String[] args) {
		JFrame f=new JFrame();
		f.add(new FirstPanel());
		f. setVisible (true) ;
	}
}
