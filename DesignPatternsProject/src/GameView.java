
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GameView {
	
	
	
	public void showGameDetails(String title, String genre, int releaseYear, int rating, String completionStatus) {
		JFrame window = new JFrame("Game");
		JPanel p = new JPanel();
		JLabel titleLabel = new JLabel(title);
		JLabel genreL = new JLabel(genre);
		JLabel releaseYearLTemp = new JLabel();
		releaseYearLTemp.setText(String.valueOf(releaseYear));
		JLabel ratingLTemp = new JLabel();
		ratingLTemp.setText(String.valueOf(rating));
		JLabel completionStatusL = new JLabel(completionStatus);
		JLabel welcomeLabel = new JLabel("Welcome to the Game Colelction Library");
		
		
		JButton addBttn = new JButton("Add a game");
		JButton displayBttn = new JButton("Display the whole library");
		JButton editBttn = new JButton("Edit a game in the library");
		JButton deleteBttn = new JButton("Delete a game in the library");
		JButton closeBttn = new JButton("Close the app");
		
		GridBagLayout layout = new GridBagLayout();
		GridBagConstraints c = new GridBagConstraints();
		p.setLayout(layout);
		c.gridx = 2;
		c.gridy = 0;
		p.add(welcomeLabel, c);
		
		c.gridx = 0;
		c.gridy = 1;
		p.add(addBttn, c);
		
		c.gridx = 1;
		c.gridy = 1;
		p.add(displayBttn, c);
		
		c.gridx = 2;
		c.gridy = 1;
		p.add(editBttn, c);
		
		c.gridx = 3;
		c.gridy = 1;
		p.add(deleteBttn, c);
		
		c.gridx = 4;
		c.gridy = 1;
		p.add(closeBttn, c);
		
		window.setSize(200,500);
		window.add(p);
		window.pack();
		window.setVisible(true);
	
		
		
	}
	public void printGameDetails(String title, String genre, int releaseYear, int rating, String completionStatus) {
		System.out.println("GAME LIBRARY ");
		System.out.println("Title: " + title);
		System.out.println("Genre: " + genre);
		System.out.println("Release Year: " + releaseYear);
		System.out.println("Rating: " + rating);
		System.out.println("Completion Status: " + completionStatus);
		
	}
}
