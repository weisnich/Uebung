import javax.swing.*;
public class  FirstPanel extends JPanel {
	@Override public void paintComponent(java.awt.Graphics g) {
	g.fillOval(200, 200, 500, 500);	
	g.fillRect(343, 111, 300, 123);
	}
	public static void main(String[] args) {
		JFrame f=new JFrame();
		f.add(new FirstPanel());
		f. setVisible (true) ;
		f.setSize(1000,1000);
	}
}
