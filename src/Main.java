package program;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
public class Main {
  
  public static void main(String[] args) {
		JMenuBar menuBar;
		JMenu menu;
		JMenuItem simpleView, scientificView, programmingView, about;

	  	// Creating objects of type Class to be able to use the methods within them
		SimpleCalculator simpleCalculator = new SimpleCalculator();
		ScientificCalculator scientificCalculator = new ScientificCalculator();
	  	ProgrammingCalculator programmingCalculator = new ProgrammingCalculator();

		// Create the menu bar
		menuBar = new JMenuBar();
		// Creating a menu
		menu = new JMenu("Switch View");
		// Adding the menu to the menuBar
		menuBar.add(menu);
		// Creating items for the menu and adding them to the menu
		// Simple
		simpleView = new JMenuItem("Simple Calculator");
		menu.add(simpleView);
		// Math / Scientific
		scientificView = new JMenuItem("Scientific Calculator");
		menu.add(scientificView);
	  	//Programming
	  	programmingView = new JMenuIteam("Programming Calculator");
	  	menu.add(programmingView);
		// Separator
		menu.addSeparator();
		// About - separated
		about = new JMenuItem("About");
		menu.add(about);

		simpleCalculator.setVisible(true);
		simpleCalculator.setJMenuBar(menuBar);

		// Hiding the other views
		scientificCalculator.setVisible(false);
	  	programmingCalculator.setVisible(false);

		// ActionListeners to the JMenu items
		simpleView.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {

				// Closing any previous windows and reseting the fields
				scientificCalculator.setVisible(false);
				programmingCalculator.setVisible(false);
				simpleCalculator.reset();

				// Adding the existing menu to the new frame
				simpleCalculator.setVisible(true);
				simpleCalculator.setJMenuBar(menuBar);
			}
		});

		scientificView.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {

				// Closing any previous windows and reseting the fields
				simpleCalculator.setVisible(false);
				programmingCalculator.setVisible(false);
				scientificCalculator.reset();

				// Adding the existing menu to the new frame
				scientificCalculator.setVisible(true);
				scientificCalculator.setJMenuBar(menuBar);
			}
		});
	
	  	programmingView.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				// Closing previous windows and reseting the fields
				simpleCalculator.setVisible(false);
				scientificCalculator.setVisible(false);
				programmingCalculator.reset();
				
				// Adding the existing menu to the new frame
				programmingCalculator.setVisible(true);
				programmingCalculator.setJMenuBar(menuBar);
			}
		});
	  	
		about.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				//Message dialog pops up with details about hte program
				JOptionPane.showMessageDialog(null, "JCalculator is a multi-functional calculator program\nwritten in the Java programming language.\n\n                        Version 1.0");
			}
		});
	}
}
