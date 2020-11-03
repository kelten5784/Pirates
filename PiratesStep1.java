// Import the GUI libraries
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class PiratesStep1 {
	/**
	 * MAIN METHOD
	 * This main method starts the GUI and runs the createMainWindow() method.
	 * This method should not be changed.
	 */
	public static void main (String [] args) {
		javax.swing.SwingUtilities.invokeLater (new Runnable () {
			public void run () {
				createMainWindow ();
			}
		});
	}


	/**
	 * STATIC VARIABLES AND CONSTANTS
	 * Declare the objects and variables that you want to access across
	 * multiple methods.
	 */
	


	/**
	 * CREATE MAIN WINDOW
	 * This method is called by the main method to set up the main GUI window.
	 */
	private static void createMainWindow () {
		// Create and set up the window.
		JFrame frame = new JFrame ("Pirates");
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		frame.setResizable (false);

		// The panel that will hold the components in the frame.
		JPanel contentPane = new JPanel ();
		contentPane.setLayout(new BorderLayout());
		contentPane.setPreferredSize(new Dimension (950, 400));
		
		
		JPanel rightPanel = new JPanel ();
		contentPane.setLayout(new BorderLayout());
		
		contentPane.add(rightPanel, BorderLayout.EAST);
		

		// TODO: Add the components to the view
		JLabel scoreLabel = new JLabel ("Score");
		rightPanel.add(scoreLabel);
		scoreLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		
		JLabel scoreNumberLabel =new JLabel ("0");
		rightPanel.add(scoreNumberLabel);
		rightPanel.setLayout(new BoxLayout(rightPanel, BoxLayout.PAGE_AXIS));
		
		JLabel actionsTitleLabel = new JLabel ("Actions");
		rightPanel.add(actionsTitleLabel);
		actionsTitleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
	
		JButton newGameButton = new JButton ("New Game");
		rightPanel.add(newGameButton);
		newGameButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		
		JButton QuitButton = new JButton ("Quit");
		rightPanel.add(QuitButton);
		QuitButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		
		
		JButton Music = new JButton ("Music");
		rightPanel.add(Music);
		Music.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		JLayeredPane GamePanel = new JLayeredPane();
		contentPane.add(GamePanel);
		
		JLabel map = new JLabel(new ImageIcon ("resources/world-map-animals.jpg"));
		map.setSize(775,400);
		contentPane.add(map);
		
		JLabel shipimage = createScaledImage("resources/pirate-ship.png",40,40);
		shipimage.setSize(40,40);
		
		//put the ship at a random loction
		Random randomGenertor = new Random();
		int pirateX = randomGenertor.nextInt(735);
		int pirateY = randomGenertor.nextInt(360);
		shipimage.setLocation(pirateX, pirateY);
		
		GamePanel.add(shipimage);
		Integer.valueOf(100);
		
		
		frame.setContentPane(contentPane);

		//size the window.
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}


	/**
	 * HELPER METHODS
	 * Methods that you create to manage repetitive tasks.
	 */

	/** Creates an image label scaled to the given size. */
	private static JLabel createScaledImage (String filename, int width, int height) {
		Image originalImage = new ImageIcon(filename).getImage();
		Image scaledImage = originalImage.getScaledInstance(width, height, Image.SCALE_SMOOTH);
		return new JLabel(new ImageIcon(scaledImage));
	}


	/**
	 * EVENT LISTENERS
	 * Subclasses that handle events (button clicks, mouse clicks and moves,
	 * key presses, timer expirations)
	 */
	
}