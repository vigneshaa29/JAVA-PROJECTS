import javax.swing.JFrame;

public class GameFrame extends JFrame{

	GameFrame(){
			
		this.add(new GamePanel());
		this.setTitle("Snake");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);// here we set the frame to be not resizable.
		this.pack();// here this method is used to pack the components in the frame so that
        // it can adjust its size according to the components inside of it.
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		
	}
}
