
import java.awt.*;
import javax.swing.*;

public class GameView {
	
	private JFrame window;
	private JTextArea tArea;
	private JButton addBttn;
	private JButton displayBttn;
	private JButton editBttn;
	private JButton deleteBttn;
	
	public GameView() {
		window = new JFrame("Game Collection Library");

		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel welcomeLabel = new JLabel("Welcome to the Game Collection Library");

		tArea = new JTextArea(15, 50);
		tArea.setEditable(false);

		JScrollPane scrollPane = new JScrollPane(tArea);

		addBttn = new JButton("Add a game");
		displayBttn = new JButton("Display the whole library");
		editBttn = new JButton("Edit a game in the library");
		deleteBttn = new JButton("Delete a game in the library");
		


		JPanel p = new JPanel();
		GridBagLayout layout = new GridBagLayout();
		GridBagConstraints c = new GridBagConstraints();
		p.setLayout(layout);

		c.insets = new Insets(5, 5, 5, 5);

		c.gridx = 0;
		c.gridy = 0;
		c.gridwidth = 5;
		p.add(welcomeLabel, c);

		c.gridx = 0;
		c.gridy = 1;
		c.gridwidth = 5;
		c.fill = GridBagConstraints.BOTH;
		p.add(scrollPane, c);

		c.gridwidth = 1;
		c.fill = GridBagConstraints.NONE;
		c.gridy = 2;

		c.gridx = 0;
		p.add(addBttn, c);

		c.gridx = 1;
		p.add(displayBttn, c);

		c.gridx = 2;
		p.add(editBttn, c);

		c.gridx = 3;
		p.add(deleteBttn, c);

		window.add(p);

		window.pack();
	}
		public void show() {
			window.setVisible(true);
		}
		public void showGames(String text) {
			tArea.setText(text);
		}
		public String askText(String prompt) {
			return JOptionPane.showInputDialog(window, prompt);
		}

		public void showMessage(String text) {
			JOptionPane.showMessageDialog(window, text);
		}
		public JButton getAddButton() {
			return addBttn;
		}
		public JButton getDisplayButton() {
			return displayBttn;
		}
		public JButton getEditButton() {
			return editBttn;
		}
		public JButton getDeleteButton() {
			return deleteBttn;
		}

	}

